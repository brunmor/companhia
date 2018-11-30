import http from './http';

export default class AeroportoApi {
  static salvarAeroporto(aeroportoDTO) {
    return http.post(`aeroporto`, aeroportoDTO);
  }
}
