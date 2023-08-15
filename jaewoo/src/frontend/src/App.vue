<template>
  <div class="container">
    <HeaderView></HeaderView>
    <router-view></router-view>
  </div>
  <div></div>
</template>

<script>
import HeaderView from './components/HeaderView.vue';

export default {
  name: 'App',
  components: {
    HeaderView
  }
}
</script>

<style>
.container { text-align: center; margin-top: 10px; }
</style>
