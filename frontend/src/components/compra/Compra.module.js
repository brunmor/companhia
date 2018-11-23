import CompradorApi from '../../api/Comprador.api';

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
      },
      cpfParaBuscar: ''
    }
  },
  methods: {
    salvarComprador: function () {
      let dadosDoCompradorJson = this.gerarJsonDoComprador(this.dadosDoComprador);
      CompradorApi.salvarComprador(dadosDoCompradorJson)
        .then(() => {
          alert("Seus dados foram salvos com sucesso!");
        }, () => {
          alert("Erro ao salvar!");
        });
    },
    buscarComprador: function (cpf) {
      CompradorApi.buscarComprador(cpf)
        .then((compradorRetornado) => {
          if (compradorRetornado.nome !== null) {
            this.popularFormularioComDadosDo(compradorRetornado);
          }
        });
    },
    popularFormularioComDadosDo: function (comprador) {
      this.dadosDoComprador.nome = comprador.nome;
      this.dadosDoComprador.cpf = comprador.cpf;
      this.dadosDoComprador.email = comprador.email;
      this.dadosDoComprador.dataDeNascimento = comprador.dataDeNascimento;
      this.dadosDoComprador.telefone = comprador.telefone;
      this.dadosDoComprador.endereco = comprador.endereco;
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
