import VooApi from '../../../api/Voo.api';
import AeroportoApi from '../../../api/Aeroporto.api';
import CompanhiaAereaApi from "../../../api/CompanhiaAerea.api";
import VoosPadrao from './VoosPadrao';
import AeroportosPadrao from "./AeroportosPadrao";
import CompanhiasAereasPadrao from "./CompanhiasAereasPadrao";

export default {
  name: 'cadastroDeVoo',
  data() {
    return {
      numeroDeVoos: 0,
      novoVoo: {
        cidadeDeOrigem: '',
        cidadeDeDestino: '',
        dataDeIda: '',
        dataDeVolta: '',
        preco: ''
      }
    }
  },
  methods: {
    cadastrarVoosPadrao: function() {
      VooApi.salvarVoosAleatorios(this.numeroDeVoos);
    },
    cadastrarAeroportosPadrao: function() {
      let aeroportos = AeroportosPadrao.aeroportos;
      aeroportos.forEach((aeroporto) => {
        if (aeroporto.nome !== "" && aeroporto.cidade !== "" && aeroporto.pais !== "" && aeroporto.codigoIATA !== ""
          && aeroporto.nome !== "\\N" && aeroporto.cidade !== "\\N" && aeroporto.pais !== "\\N" && aeroporto.codigoIATA !== "\\N") {
          AeroportoApi.salvarAeroporto(aeroporto);
        }
      });
    },
    cadastrarCompanhiasAereasPadrao: function() {
      let companhiasAereas = CompanhiasAereasPadrao.companhiasAereas;
      companhiasAereas.forEach((companhia) => {
        if (companhia.nome !== "" && companhia.cidade !== "" && companhia.pais !== ""
          && companhia.codigoICAO !== "" && companhia.nome !== "\\N" && companhia.cidade !== "\\N"
          && companhia.pais !== "\\N" && companhia.codigoICAO !== "\\N" && companhia.ativo !== "N") {
          CompanhiaAereaApi.salvarCompanhia(companhia);
        }
      });
    },
    salvarNovoVoo: function () {
      VooApi.salvarVoo(this.novoVoo)
        .then(() => {
          alert("Seus dados foram salvos com sucesso!");
        }, () => {
          alert("Erro ao salvar!");
        });
    }
  }
}
