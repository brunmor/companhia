import VooApi from '../../api/Voo.api';

export default {
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
    }
  }
}

