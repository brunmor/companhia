import VooApi from '../../api/Voo.api';

export default {
  name: 'voo',
  data() {
    return {
        items:[{
          'cidade' : 'Campo Grade'
        }]
    }
  },
  created: function () {
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

