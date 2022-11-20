<template>
  <div class="status-background" v-if="status">
    <div class="status-counter">
      <div class="status-content"><div class="loader"></div></div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'status',
  computed: {
    status() {
      return this.$store.getters.status
    },
  },
}
</script>

<style>
.status-background {
  background-color: transparent;
  width: 100%;
  height: 100%;
  position: absolute;
  left: 0;
  top: 0;
}
.status-counter {
  position: absolute;
  translate: calc(-50%, -50%);
  left: 50%;
  top: 50%;
}
.loader {
  position: absolute;
  z-index: 1;
  margin: -75px 0 0 -75px;
  border: 16px solid #f3f3f3;
  border-radius: 50%;
  border-top: 16px solid #3498db;
  width: 120px;
  height: 120px;
  animation: spin 2s linear infinite;
}
@keyframes spin {
  0% {
    transform: rotate(0deg);
  }
  100% {
    transform: rotate(360deg);
  }
}
</style>
