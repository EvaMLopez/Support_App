<script setup>
import WelcomeComponent from '@/components/WelcomeComponent.vue';
import LoginComponent from "@/components/LoginComponent.vue";
</script>

<template>

    <div class="main-container">
      <WelcomeComponent />
      <LoginComponent  />
    </div>

</template>

<style scoped lang="scss">
body {
  background-image: ("./../assets/img/background_ticket.jpg");
}
  .main-container {
    display: flex;
    justify-content: space-between; 
    align-items: center;
    padding: 8rem 0;
    height: 85vh; 
  }

  @media (max-width: 767px) {
    .main-container {
      flex-direction: column; 
      /* align-items:center  */
    }
  }
</style>
