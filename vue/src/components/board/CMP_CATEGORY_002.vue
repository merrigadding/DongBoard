<template>
  <select @change="test" ref="selectOption">
    <option value="0">전체</option>
    <option
      :value="value.categoryDetailNo"
      v-for="(value, index) in list"
      :key="index"
    >
      {{ value.categoryDetailName }}
    </option>
  </select>
</template>

<script>
import axios from 'axios'
export default {
  props: {
    value: {
      type: String,
    },
  },
  data() {
    return {
      list: [],
    }
  },
  watch: {
    value() {
      this._load()
    },
  },
  methods: {
    _load() {
      this.reset()

      axios
        .request('/api/v1/board/categoryDetail', {
          params: {
            category: this.value,
          },
        })
        .then((res) => {
          this.list = res.data
        })
    },
    reset() {
      this.$refs.selectOption.value = '0'
    },
    test() {
      this.$emit('select', this.$refs.selectOption.value)
    },
  },
}
</script>

<style></style>
