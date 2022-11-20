import vue from 'vue'
import vuex from 'vuex'
import createPersistedState from 'vuex-persistedstate'
vue.use(vuex)

const state = {
  count: 0,
  loginPopup: false,
  userInfo: null,
  status: 0,
}
const getters = {
  count(state) {
    return state.count
  },
  loginPopup(state) {
    return state.loginPopup
  },
  userInfo(state) {
    return state.userInfo
  },
  status(state) {
    return state.status
  },
}
const mutations = {
  increase(state) {
    state.count++
  },
  loginPopup(state) {
    state.loginPopup = true
  },
  loginPopupCancle(state) {
    state.loginPopup = false
  },
  userInfo(state, user) {
    state.userInfo = user
  },
  logout(state) {
    state.userInfo = null
  },
  plusStatus(state) {
    state.status++
  },
  minusStatus(state) {
    state.status--
  },
}

export default new vuex.Store({
  state,
  getters,
  mutations,
  plugins: [
    createPersistedState({
      // 여기에 쓴 모듈만 저장됩니다.
      paths: ['userInfo'],
    }),
  ],
})
