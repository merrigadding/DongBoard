import Vue from 'vue'
import VueRouter from 'vue-router'
import main from '../views/main/main.vue'
import signPage from '../views/signPage/signPage.vue'
import mainPage from '../views/signPage/mainPage.vue'
import agreement from '../views/signPage/agreement.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: main,
  },
  {
    path: '/sign',
    name: 'sign',
    component: signPage,
    children: [
      {
        path: 'main',
        name: 'main',
        component: mainPage,
      },
      {
        path: 'agreement',
        name: 'agreement',
        component: agreement,
      },
    ],
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
})

export default router
