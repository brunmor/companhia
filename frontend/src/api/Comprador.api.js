import http from './http';

export default class CompradorApi {
  static salvarComprador(compradorDTO) {
    return http.post(`/comprador`, compradorDTO)
  }

  static buscarComprador(cpf) {
    return http.getJson(`/comprador/${cpf}`);
  }
}
