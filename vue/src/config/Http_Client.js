import axios from 'axios'

class Http {
  constructor() {
    this.axios = axios
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
