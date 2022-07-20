import hnb from '../components/common/hnb.vue'
import vue from 'vue';
import _ from 'lodash';

class componentRester {
    constructor() {
        this.componentMap = {};
    }

    init() {
        this.componentMap['hnb'] = hnb;

        _.forEach(this.componentMap, (component, name) => {
            vue.component(name, component);
        })
    }

}

export default new componentRester()