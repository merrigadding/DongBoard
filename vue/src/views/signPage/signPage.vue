<template>
  <div id="app">
    <signHeader></signHeader>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  methods: {
    back() {
      this.$router.push({
        name: 'home',
      })
    },
  },
}
</script>

<style></style>
