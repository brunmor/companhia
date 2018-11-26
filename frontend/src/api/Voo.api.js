import http from './http';

export default class VooApi {

  static listarVoos() {
    return http.getJson(`/voos`);
  }
}
