import Vue from 'vue';
import Router from 'vue-router';
import HomeTemplate from '../components/home/Home.template';
import CompraTemplate from "../components/compra/Compra.template";

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: __dirname,
  routes: [
    {path: '/', component: HomeTemplate},
    {path: '/home', component: CompraTemplate},
    {path: '/compra', component: CompraTemplate}
  ]
});
