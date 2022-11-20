<template>
  <textarea
    class="width-100 height-100"
    placeholder="내용을 입력해 주세용"
    ref="contentInput"
    @change="updateDate()"
  ></textarea>
</template>

<script>
export default {
  methods: {
    updateDate() {
      this.$emit('input', this.$refs.contentInput.value)
    },
  },
}
</script>

<style></style>
