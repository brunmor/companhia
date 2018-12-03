import Vue from 'vue';
import Router from 'vue-router';
import HomeTemplate from '../components/home/Home.template';
import CompraTemplate from "../components/compra/Compra.template";
import CadastroDeVooTemplate from '../components/voos/cadastroDeVoo/CadastroDeVoo.template';
import VooTemplate from '../components/voos/Voo.template';
import BuscarVooTemplate from '../components/buscarVoo/BuscarVoo.template';

Vue.use(Router);

export default new Router({
  base: __dirname,
  routes: [
    {path: '/', component: HomeTemplate},
    {path: '/compra', component: CompraTemplate},
    {path: '/cadastroDeVoos', component: CadastroDeVooTemplate},
    {path: '/voos', component: VooTemplate},
    {path: '/buscarVoo', component: BuscarVooTemplate}
  ]
});
