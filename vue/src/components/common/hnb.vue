<template>
  <div class="high-bar">
    <div class="high-bar-wrap">
      <div class="high-bar-left">
        <button>DongBlog</button>
      </div>
      <div class="high-bar-center">
        <ul>
          <li>
            <button>게시글</button>
          </li>
          <li>
            <button>방명록</button>
          </li>
        </ul>
      </div>
      <div class="high-bar-right">
        <button @click="loginPopup">로그인</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    loginPopup() {
      this.$store.commit('loginPopup')
    },
  },
}
</script>

<style></style>
