import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import componentRester from './config/componentRegister'

import './assets/css/hnb/hnb.css';
import './assets/css/reset.css';
Vue.config.productionTip = false

componentRester.init();

new Vue({
  store,
  router,
  render: h => h(App)
}).$mount('#app')
