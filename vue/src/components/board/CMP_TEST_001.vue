<template>
  <div>
    <select>
      <option>1</option>
      <option>2</option>
      <option>3</option>
    </select>
  </div>
</template>

<script>
export default {
  props: {
    // siteId: {
    //   type: String,
    // },
  },
  name: 'board-title',
  computed: {
    userInfo() {
      return this.$store.getters.userInfo
    },
  },
  mounted() {
    // console.log(this.siteId)
    console.log(this.userInfo)
    // this._load()
  },
  methods: {
    // _load() {
    //   const that = this
    //   http
    //     .request('/api/v1/board/selectBoardTitle', {
    //       params: {
    //         siteId: this.userInfo.siteId,
    //       },
    //     })
    //     .then((res) => {
    //       console.log(res.data)
    //     })
    //     .catch((r) => {
    //       console.log(r)
    //     })
    // },
  },
}
</script>

<style></style>
