<template>
  <div class="high-bar">
    <div class="high-bar-wrap">
      <div class="high-bar-left">
        <button
          @click="
            $router.push({
              name: 'home',
            })
          "
        >
          DongBlog
        </button>
      </div>
      <div class="high-bar-center">
        <ul>
          <li>
            <button @click="boardMove">게시판</button>
          </li>
          <li>
            <button @click="questBook">방명록</button>
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
    boardMove() {
      this.$router.push({
        name: 'board',
      })
    },
    questBook() {
      utils.message('준비중 입니다.')
    },
  },
}
</script>

<style></style>
