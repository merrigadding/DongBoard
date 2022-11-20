<template>
  <select @input="updateSelect($event.target.value)">
    <option value="0">전체</option>
    <option
      :value="value.categoryNo"
      v-for="(value, index) in list"
      :key="index"
    >
      {{ value.categoryName }}
    </option>
  </select>
</template>

<script>
import axios from 'axios'
export default {
  props: [],
  data() {
    return {
      list: [],
    }
  },
  mounted() {
    axios.request('/api/v1/board/category').then((res) => {
      this.list = res.data
    })
  },
  methods: {
    updateSelect(e) {
      this.$emit('update', e)
    },
  },
}
</script>

<style></style>
