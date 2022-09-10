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
        <div v-if="userLoad">
          <button @click="userInfoTset">
            {{ this.$store.getters.userInfo.userId }} 님 안녕하세요!
          </button>
          <button class="blue-btn" @click="logout">로그아웃</button>
        </div>
        <div v-else>
          <button @click="loginPopup">로그인</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  mounted() {},
  methods: {
    userInfoTset() {
      console.log(this.$store.getters.userInfo)
    },
    logout() {
      const check = confirm('로그아웃 하시겠습니까?')
      if (check) {
        axios.request({ url: '/api/v1/test/logout' }).then((res) => {
          // alert(res.data.message)
          // console.log(res.data)
          this.$store.commit('logout')
        })
      }
    },
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
  computed: {
    userLoad() {
      return this.$store.getters.userInfo ? true : false
    },
  },
}
</script>

<style></style>
