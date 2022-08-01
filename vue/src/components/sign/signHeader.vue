<template>
  <div class="sign-header">
    <div class="sign-header-wrap">
      <div class="sign-header-left"><p @click="home">DongBlog</p></div>
      <div class="sign-header-right">
        <p @click="back">뒤로 가기</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'sign-header',
  methods: {
    home() {
      this.$store.commit('loginPopupCancle')
      this.$router.push({
        name: 'home',
      })
    },
    back() {
      // this.$store.commit('loginPopup')
      // this.$router.push({
      //   name: 'home',
      // })
      this.$router.go(-1)
    },
  },
}
</script>

<style></style>
