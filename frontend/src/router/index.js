import Vue from 'vue';
import Router from 'vue-router';
import HomeTemplate from '../components/home/Home.template';
import CompraTemplate from "../components/compra/Compra.template";
import CadastroDeVooTemplate from '../components/voos/cadastroDeVoo/CadastroDeVoo.template';

Vue.use(Router);

export default new Router({
  base: __dirname,
  routes: [
    {path: '/', component: HomeTemplate},
    {path: '/compra', component: CompraTemplate},
    {path: '/cadastroDeVoos', component: CadastroDeVooTemplate}
  ]
});
