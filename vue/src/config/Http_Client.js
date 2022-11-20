import axios from 'axios'
import store from '../store/index.js'
class Http {
  constructor() {
    this.axios = axios
    this.init()
  }
  init() {
    this.axios.interceptors.request.use(
      function (config) {
        store.commit('plusStatus')
        return config
      },
      function (error) {
        return Promise.reject(error)
      }
    )
    this.axios.interceptors.response.use(
      function (config) {
        store.commit('minusStatus')
        return config
      },
      function (error) {
        alert('에러!')
        store.commit('minusStatus')
        return Promise.reject(error)
      }
    )
  }

  request(url, { params = {} }) {
    // console.log(url)
    // console.log(params)
    return axios
      .request({
        url,
        params,
      })
      .then((res) => res)
  }
}

const http = new Http()
export default http
