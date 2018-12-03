import Voo from '../voos/Voo.template';
import VooApi from '../../api/Voo.api';
import BuscarVoo from '../voos/buscarVoos/BuscarVoo.template';
import CabecalhoTemplate from '../cabecalho/Cabecalho.template';
export default {
  name: 'home',
  components: { Voo, BuscarVoo, CabecalhoTemplate },
  data() {
    return {
      cidadeDestinoSelecionada: '',
      cidades: [],
    }
  },
  methods: {
    // buscarCidadesDeDestinoDisponiveis: function() {
    //   VooApi.buscarCidadesDeDestino()
    //     .then((cidadesRetornadas) => {
    //       this.cidades = cidadesRetornadas;
    //     });
    // }
  },
  beforeMount() {
    //this.buscarCidadesDeDestinoDisponiveis()
  }
}
