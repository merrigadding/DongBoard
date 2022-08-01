<template>
  <div class="sign-content">
    <div class="sign-content-wrap">
      <div class="sign-content-top">
        <img src="@/assets/img/sign/오구.jpg" />
        <p>유동에 오신 것을 환영합니다!</p>
      </div>
      <div class="sign-content-center">회원가입 방식을 선택해주세요.</div>
      <div class="sign-content-bottom">
        <div><p @click="emailSign">이메일로 회원가입</p></div>
        <div><p>네이버로</p></div>
        <div><p>준비중입니다..</p></div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    emailSign() {
      this.$router.push('agreement')
    },
  },
}
</script>

<style></style>
