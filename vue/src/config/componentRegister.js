import hnb from '../components/common/hnb.vue'
import signHeader from '../components/sign/signHeader.vue'
import vue from 'vue'
import _ from 'lodash'

class componentRester {
  constructor() {
    this.componentMap = {}
  }

  init() {
    this.componentMap['hnb'] = hnb
    this.componentMap['signHeader'] = signHeader

    _.forEach(this.componentMap, (component, name) => {
      vue.component(name, component)
    })
  }
}

export default new componentRester()
