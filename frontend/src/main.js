// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import VueRouter from 'vue-router';
import vueResource from 'vue-resource';
import HomeTemplate from './components/home/Home.template';
import CompraTemplate from './components/compra/Compra.template';

Vue.use(vueResource);
Vue.use(VueRouter);

const router = new VueRouter({
  mode: 'history',
  base: __dirname,
  routes: [
    {path: '/', component: HomeTemplate},
    {path: '/compra', component: CompraTemplate}
  ]
});

/* eslint-disable no-new */
new Vue({
  router,
  template: `
    <div id="app">
        <router-view></router-view>
    </div>
  `,
}).$mount('#app');
