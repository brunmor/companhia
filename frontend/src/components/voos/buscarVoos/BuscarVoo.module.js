import Autocomplete from '../../autocomplete/Autocomplete.template';

export default {
  name: "buscarVoo",
  components: {
    Autocomplete
  },
  data() {
    return {
      titulo: "Módulo de busca de Vôo",
      mostrarVolta: false,
      aeroportoDeOrigem: '',
      aeroportoDeDestino: '',
      dataDeIda: '',
      dataDeVolta: '',
      numeroDeAdultos: 0,
      numeroDeCriancas: 0,
      aeroportos: ['A', 'B', 'C'],
    }
  },
}
