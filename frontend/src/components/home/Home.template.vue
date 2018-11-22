<template>
  <div class="home">
    <h1>{{titulo}}</h1>

    <div id="escolhaDePassagens">
      <label for="cidadeDestino">Escolha a cidade de destino</label>
      <select id="cidadeDestino">
        <option>Campo Grande</option>
        <option>São Paulo</option>
      </select><br/>

      <label for="listaDeDestinos">Destinos para {{cidade}}</label>
      <ul id="listaDeDestinos">
        <li>1
          <router-link to="/compra">
            <button>Comprar</button>
          </router-link>
          <button>Detalhes</button>
        </li>
        <li>2</li>
        <li>3</li>
      </ul>
    </div>
  </div>
</template>

<script src="./Home.module.js"></script>
<style scoped src="./Home.style.css"></style>
