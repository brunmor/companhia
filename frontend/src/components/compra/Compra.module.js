import CompradorApi from '../../../api/Comprador.api';

export default {
  name: 'compra',
  data() {
    return {
      dadosDoComprador: {
        nome: '',
        cpf: '',
        email: '',
        dataDeNascimento: '',
        telefone: '',
        endereco: ''
      }
    }
  },
  methods: {
    salvarComprador: function () {
      let dadosDoCompradorJson = this.gerarJsonDoComprador(this.dadosDoComprador);
      CompradorApi.salvarComprador(dadosDoCompradorJson);
    },
    gerarJsonDoComprador: function (dadosDoComprador) {
      return {
        'nome': dadosDoComprador.nome,
        'cpf': dadosDoComprador.cpf,
        'email': dadosDoComprador.email,
        'dataDeNascimento': dadosDoComprador.dataDeNascimento,
        'telefone':  dadosDoComprador.telefone,
        'endereco': dadosDoComprador.endereco
      };
    }
  }
}
