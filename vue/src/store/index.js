import vue from 'vue'
import vuex from 'vuex'

vue.use(vuex);

const state = {
    count: 0,
}
const getters = {
    count(state) {
        return state.count;
    }
}
const mutations = {
    increase(state) {
        state.count++;
    }
}
  
export default new vuex.Store({
    state,
    getters,
    mutations
    
})