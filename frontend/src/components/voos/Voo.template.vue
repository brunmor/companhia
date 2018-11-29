<template>
  <div class="voo">
    <h2>Lista de Voôs</h2>
    <ul id="example-1">
      <li v-for="item in items">
        <p>Origem: {{ item['cidadeDeOrigem'] }}</p>
        <p>Destino: {{ item['cidadeDeDestino'] }}</p>
        <p>Ida: {{ item['dataDeIda'] }}</p>
        <p>Volta:{{ item['dataDeVolta'] }}</p>
        <p>Valor: {{ item['preco'] }}</p>
      </li>
    </ul>
  </div>
</template>

<script src="./Voo.module.js"></script>
<style scoped src="./Voo.style.css"></style>
