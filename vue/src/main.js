import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import componentRester from './config/componentRegister'
import utils from './config/utils.js'

import './assets/css/hnb/hnb.css'
import './assets/css/reset.css'
import './assets/css/popup/popup.css'
import './assets/css/sign/main.css'
import './assets/css/sign/header.css'
import './assets/css/message/message.css'
Vue.config.productionTip = false

componentRester.init()
window.utils = utils
utils.install('message', (msg) => {
  const res = document.querySelector('.message')
  if (!res) {
    const div = document.createElement('div')
    const body = document.querySelector('body')
    div.className = 'message'
    div.innerHTML = msg
    body.append(div)

    setTimeout(() => {
      div.remove()
    }, 3000)
  }
})

new Vue({
  store,
  router,
  render: (h) => h(App),
}).$mount('#app')
