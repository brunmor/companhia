import Vue from 'vue';
import router from './router/index';
import vueResource from 'vue-resource';
import CabecalhoTemplate from './components/cabecalho/Cabecalho.template'

Vue.use(vueResource);

/* eslint-disable no-new */
new Vue({
  router,
  template: `
    <div id="app">
        <cabecalho></cabecalho>
        <router-view></router-view>
    </div>
  `,
  components:{
    CabecalhoTemplate
  }
}).$mount('#app');
