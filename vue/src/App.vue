<template>
  <div>
    <router-view :key="$route.fullPath"></router-view>
    <status></status>
  </div>
</template>

<script>
import status from './components/common/CMP_STATUS.vue'
export default {
  components: {
    status,
  },
}
</script>

<style></style>
