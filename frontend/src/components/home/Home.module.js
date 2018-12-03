import Voo from '../voos/Voo.template';
import VooApi from '../../api/Voo.api';
import BuscarVoo from '../voos/buscarVoos/BuscarVoo.template';

export default {
  name: 'home',
  components: { Voo, BuscarVoo },
  data() {
    return {
      titulo: 'Compra de Passagens Aéreas',
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
