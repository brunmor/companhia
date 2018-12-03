<template>
<body>
  <div class="home">
    <h1>{{titulo}}</h1>

    <buscarVoo></buscarVoo><br>

    <div id="escolhaDePassagens">
      <label for="cidadeDestino">Escolha a cidade de destino</label>
      <select id="cidadeDestino" v-model="cidadeDestinoSelecionada">
        <option disabled value="">Cidades disponíveis</option>
        <option v-for="cidade in cidades">{{cidade}}</option>
      </select><br/>

      <voo :cidadeSelecionada="cidadeDestinoSelecionada"></voo>

    </div>
  </div>
  </body>
</template>

<script src="./Home.module.js"></script>
<style scoped src="./Home.style.css"></style>
