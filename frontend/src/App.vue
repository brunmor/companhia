<template>
  <div id="app">
    <img src="./assets/logo.png">
  </div>
</template>

<script>
import HomeTemplate from './components/home/Home.template';
import CompraTemplate from './components/compra/Compra.template';

export default {
  name: 'App',
  components: {  }
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
