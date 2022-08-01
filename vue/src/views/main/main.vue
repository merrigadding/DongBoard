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
                  <input type="text" placeholder="ID (아이디 또는 이메일)" />
                </div>
                <div>
                  <input type="password" placeholder="비밀번호" />
                </div>
              </div>
              <div class="login-content-checkbox">
                <input type="checkbox" id="loginCheck" />
                <label for="loginCheck">로그인상태 유지</label>
              </div>
            </div>
          </div>
          <div class="login-content-bottom">
            <div class="login-content-bottom-btn">
              <button>로그인</button>
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
    <div class="">여긴 뭐 넣을까낭</div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return {
      userId: '',
      userPw: '',
    }
  },
  computed: {
    loginPopup() {
      return this.$store.getters.loginPopup
    },
  },
  methods: {
    sign() {
      this.$router.push({
        name: 'main',
      })
    },
    login() {
      const params = {
        userId: this.userId,
        userPw: this.userPw,
      }
      console.log(params)
      axios
        .request({
          url: '/api/v1/test/login',
          params: params,
        })
        .then((res) => {
          console.log(res.data)
        })
    },
    Cancle() {
      this.userId = ''
      this.userPw = ''
      this.$store.commit('loginPopupCancle')
    },
  },
}
</script>

<style></style>
