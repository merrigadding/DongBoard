<template>
  <div>
    <ul></ul>
  </div>
</template>

<script>
export default {
  props: {
    siteId: {
      type: String,
    },
  },
  name: 'board-title',
  mounted() {
    // console.log(this.siteId)
    this._load()
  },
  methods: {
    _load() {
      const that = this
      /* eslint-disable */
      http
        .request('/api/v1/board/selectBoardTitle', {
          params: {
            siteId: this.siteId,
          },
        })
        .then((res) => {
          console.log(res.data)
        })
        .catch((r) => {
          console.log(r)
        })
    },
  },
}
</script>

<style></style>
