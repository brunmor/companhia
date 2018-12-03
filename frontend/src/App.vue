<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
import HomeTemplate from './components/home/Home.template';
import CompraTemplate from './components/compra/Compra.template';
import router from './router/index';

export default {
  name: 'App',
  components: { router }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
