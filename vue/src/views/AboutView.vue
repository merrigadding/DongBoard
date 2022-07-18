<template>
  <div class="about">
    <h1>This is an about page</h1>
    <h1>{{ $store.getters.count}}</h1>
    <button @click="increase">증가</button>
  </div>
</template>

<script>
export default {
  data(){
    return {

    }
  },
  methods: {
    increase() {
      this.$store.commit('increase');
    },
  },
  mounted() {
    console.log(this.$store.getters.count);
  },
}
</script>

<style>

</style>