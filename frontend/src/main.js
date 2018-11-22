import Vue from 'vue';
import router from './router/index';
import vueResource from 'vue-resource';

Vue.use(vueResource);

/* eslint-disable no-new */
new Vue({
  router,
  template: `
    <div id="app">
        <router-view></router-view>
    </div>
  `,
}).$mount('#app');
