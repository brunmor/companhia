import VoosPadrao from './VoosPadrao';
import VooApi from '../../../api/Voo.api';
import AeroportoApi from '../../../api/Aeroporto.api';
import AeroportosPadrao from "./AeroportosPadrao";

export default {
  name: 'cadastroDeVoo',
  data() {
    return {
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
      let voos = VoosPadrao.voos;
      voos.forEach((voo) => {
        VooApi.salvarVoo(voo);
      });
    },
    cadastrarAeroportosPadrao: function() {
      let aeroportos = AeroportosPadrao.aeroportos;
      aeroportos.forEach((aeroporto) => {
        console.log(aeroporto)
        if (aeroporto.nome !== "" && aeroporto.cidade !== "" && aeroporto.pais !== "" && aeroporto.codigoIATA !== ""
          && aeroporto.nome !== "\\N" && aeroporto.cidade !== "\\N" && aeroporto.pais !== "\\N" && aeroporto.codigoIATA !== "\\N") {
          AeroportoApi.salvarAeroporto(aeroporto);
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
