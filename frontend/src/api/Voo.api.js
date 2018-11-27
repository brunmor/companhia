import http from './http';

export default class VooApi {

  static listarVoos() {
    return http.getJson(`/voos`);
  }

  static salvarVoo(vooDTO) {
    return http.post(`/voos`, vooDTO)
  }

  static buscarVoo(id) {
    return http.getJson(`/voos/${id}`);
  }
}
