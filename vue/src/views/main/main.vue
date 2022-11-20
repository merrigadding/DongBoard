<template>
  <div id="app">
    <div v-if="loginPopup">
      <div class="background-popup">
        <div class="inner-popup">
          <div class="cancle-content">
            <button @click="Cancle">X</button>
          </div>
          <div class="login-content">
            <div class="login-content-wrap">
              <div class="login-content-banner">
                <p>DongBlog</p>
              </div>
              <div class="login-content-input">
                <div>
                  <input
                    ref="userId"
                    v-model="userId"
                    type="text"
                    placeholder="ID (아이디 또는 이메일)"
                  />
                </div>
                <div>
                  <input
                    v-model="userPw"
                    type="password"
                    placeholder="비밀번호"
                  />
                </div>
              </div>
              <div class="login-content-checkbox">
                <input
                  type="checkbox"
                  id="loginStatus"
                  v-model="checkboxCookie"
                />
                <label for="loginStatus">아이디 유지</label>
              </div>
            </div>
          </div>
          <div class="login-content-bottom">
            <div class="login-content-bottom-btn">
              <button @click="login">로그인</button>
            </div>
            <div class="login-content-bottom-flex">
              <ul>
                <li @click="sign">회원가입</li>
                <li>아이디 찾기</li>
                <li>비밀번호 찾기</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <hnb></hnb>
    <div class="content">
      <router-view></router-view>
    </div>
    <status></status>
  </div>
</template>

<script>
import axios from 'axios'
import status from '../../components/common/CMP_STATUS.vue'
export default {
  components: {
    status,
  },
  data() {
    return {
      userId: this.$cookies.get('userIdCookie')
        ? this.$cookies.get('userIdCookie')
        : '',
      userPw: '',
      checkboxCookie: this.$cookies.get('checkboxCookie')
        ? this.$cookies.get('checkboxCookie')
        : false,
    }
  },
  computed: {
    loginPopup() {
      return this.$store.getters.loginPopup
    },
  },
  mounted() {},
  methods: {
    sign() {
      this.$router.push({
        name: 'main',
      })
    },
    reset() {
      this.userId = ''
      this.userPw = ''
    },
    login() {
      const params = {
        userId: this.userId,
        userPw: this.userPw,
      }

      axios
        .request({
          url: '/api/v1/test/login',
          params: params,
        })
        .then((res) => {
          if (res.data.data == null) {
            alert('로그인 실패 다시 로그인 해주세요.')
            this.$refs.userId.focus()
          } else {
            this.maintainCookie()
            const userInfo = res.data.data
            this.$store.commit('userInfo', userInfo)
            this.$store.commit('loginPopupCancle')
          }
        })
    },
    maintainCookie() {
      if (!this.checkboxCookie) {
        this.$cookies.keys().forEach((cookie) => this.$cookies.remove(cookie))
        this.userId = ''
      } else {
        this.$cookies.set('checkboxCookie', this.checkboxCookie)
        this.$cookies.set('userIdCookie', this.userId)
      }
      this.userPw = ''
    },
    Cancle() {
      this.userPw = ''
      this.$store.commit('loginPopupCancle')
    },
  },
}
</script>

<style></style>
