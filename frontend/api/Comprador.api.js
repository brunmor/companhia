import http from './http';

export default class CompradorApi {
  static salvarComprador(compradorDTO) {
    console.log(compradorDTO);
    return http.post(`/comprador`, compradorDTO)
  }
}
