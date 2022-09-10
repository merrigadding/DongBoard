<template>
  <div>
    <div>
      <button @click="test">insert 테스트</button>
      <button @click="test2">select 테스트</button>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  methods: {
    test() {
      axios
        .request({ url: '/api/v1/board/boardWrite' })
        .then((res) => console.log(res.data))
    },
    test2() {
      axios
        .request({ url: '/api/v1/board/selectBoard' })
        .then((res) => console.log(res.data))
    },
  },
}
</script>

<style></style>
