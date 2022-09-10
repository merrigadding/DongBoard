import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import componentRester from './config/componentRegister'
import utils from './config/utils.js'
import vueCookies from 'vue-cookies'

import http from './config/Http_Client.js'
import './assets/css/hnb/hnb.css'
import './assets/css/reset.css'
import './assets/css/popup/popup.css'
import './assets/css/sign/main.css'
import './assets/css/sign/header.css'
import './assets/css/message/message.css'
import './assets/css/content/content.css'
import { library } from '@fortawesome/fontawesome-svg-core'

/* 
   import specific icons 
   원하는 아이콘을 개별적으로 import
*/
import { faMagnifyingGlass, faXmark } from '@fortawesome/free-solid-svg-icons'

/* import font awesome 컴포넌트 */
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

/* 위에서 import한 아이콘들을 Core library에 등록 */
library.add(faMagnifyingGlass, faXmark)

/* font awesome 컴포넌트를 전역으로 등록 */
Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.config.productionTip = false
Vue.use(vueCookies)
Vue.$cookies.config('1d') // expire 1일 (global 설정)

componentRester.init()
window.utils = utils
window.http = http

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
