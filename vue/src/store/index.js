import vue from 'vue'
import vuex from 'vuex'

vue.use(vuex)

const state = {
  count: 0,
  loginPopup: false,
}
const getters = {
  count(state) {
    return state.count
  },
  loginPopup(state) {
    return state.loginPopup
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
}

export default new vuex.Store({
  state,
  getters,
  mutations,
})
