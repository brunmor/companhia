import http from './http';

export default class CompanhiaAereaApi {
  static salvarCompanhia(companhiaDTO) {
    return http.post(`companhiaAerea`, companhiaDTO);
  }
}
