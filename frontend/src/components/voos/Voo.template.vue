<template>
  <div class="voo">
    <h1>Lista de Voôs</h1>
    <button :onclick="listarvoos()" >Listar Voos</button>
    <ul id="example-1">
      <li v-for="item in items">
        {{ item.cidadeDeDestino }}
      </li>
    </ul>
  </div>
</template>

<script src="./Voo.module.js"></script>
<style scoped src="./Voo.style.css"></style>
