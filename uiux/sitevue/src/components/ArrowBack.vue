<template>
  <div class="arrow-back" @click="goBack">
    <i class="fas fa-arrow-left"></i>
  </div>
</template>

<script>
export default {
  methods: {
    goBack() {
      // Implement your logic to go back here
      // For example, you can use Vue Router's `router.go(-1)` to go back to the previous page
      // Or you can use `window.history.back()` to go back in browser history
    }
  }
}
</script>

<style scoped>
.arrow-back {
  cursor: pointer;
  /* Add your custom styles for the arrow back button here */
}
</style>