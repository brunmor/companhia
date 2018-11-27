import VooApi from '../../api/Voo.api';

export default {
  name: 'voo',
  data() {
    return {
        items:[2],

    }

  },
  methods: {
    listarvoos: function () {
      VooApi.listarVoos()
        .then((voos) => {
          if (voos !== null) {
            this.items = voos;
          }
        });
    },
    cadastrarVoosPadrao: () => {
      console.log("Vou cadastrar, em");
    }
  }
}

