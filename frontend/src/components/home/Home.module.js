import Voo from '../voos/Voo.template';

export default {
  name: 'home',
  components: { Voo },
  data() {
    return {
      titulo: 'Compra de Passagens Aéreas',
      cidade: ''
    }
  }
}
