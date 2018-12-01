import Autocomplete from '../../autocomplete/Autocomplete.template';
import AeroportoApi from '../../../api/Aeroporto.api';

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
      aeroportos: [],
    }
  },
  mounted() {
    AeroportoApi.buscarAeroportos()
      .then((aerosRetornados) => {
        console.log(aerosRetornados);
        aerosRetornados.forEach((aero) => {
          this.aeroportos.push(
            aero.codigoIATA + ', '
            + aero.nome + ', '
            + aero.cidade + ', '
            + aero.pais
          );
        })
      });
  }
}
