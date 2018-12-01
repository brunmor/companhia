import VooApi from '../../api/Voo.api';

export default {
  name: 'voo',
  props: ['cidadeSelecionada'],
  watch: {
    cidadeSelecionada: function (cidade) {
      if (cidade !== "" || cidade !== undefined || cidade !== null) {
        // VooApi.buscarVoosPorDestino(cidade)
        //   .then((voosRetornados) => {
        //     console.log(voosRetornados);
        //     this.voos = voosRetornados;
        //   });
      }
    }
  },
  data() {
    return {
      voos: []
    }
  }
}

