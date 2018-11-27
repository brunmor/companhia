import VoosPadrao from './VoosPadrao';
import VooApi from '../../../api/Voo.api';

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
