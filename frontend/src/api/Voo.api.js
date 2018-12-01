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

  static buscarCidadesDeDestino() {
    return http.getJson(`/voos/cidadesDeDestino`);
  }

  static buscarVoosPorDestino(cidadeDestino) {
    return http.getJson(`/voos/buscarVoosPorDestino/${cidadeDestino}`)
  }

  static salvarVoosAleatorios(n) {
    return http.put(`/voos/${n}`, n);
  }
}
