import Voo from '../voos/Voo.template';
import VooApi from '../../api/Voo.api';

export default {
  name: 'home',
  components: { Voo },
  data() {
    return {
      titulo: 'Compra de Passagens Aéreas',
      cidadeDestinoSelecionada: '',
      cidades: []
    }
  },
  methods: {
    buscarCidadesDeDestinoDisponiveis: function() {
      VooApi.buscarCidadesDeDestino()
        .then((cidadesRetornadas) => {
          this.cidades = cidadesRetornadas;
        });
    }
  },
  beforeMount() {
    this.buscarCidadesDeDestinoDisponiveis()
  }
}
