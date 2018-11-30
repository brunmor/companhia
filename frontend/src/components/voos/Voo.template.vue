<template>
  <div class="voo">
    <h2>Vôos para {{cidadeSelecionada}}</h2>
    <ul id="example-1" v-if="voos.length > 0">
      <li v-for="voo in voos">
        <p>Origem: {{ voo.cidadeDeOrigem }}</p>
        <p>Destino: {{ voo.cidadeDeDestino }}</p>
        <p>Ida: {{ voo.dataDeIda }}</p>
        <p>Volta:{{ voo.dataDeVolta }}</p>
        <p>Valor: {{ voo.preco }}</p>
      </li>
    </ul>
  </div>
</template>

<script src="./Voo.module.js"></script>
<style scoped src="./Voo.style.css"></style>
