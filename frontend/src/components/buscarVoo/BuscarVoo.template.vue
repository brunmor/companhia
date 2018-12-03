<template>
<body>
 <h1>Encontre sua Passagem! </h1>
    <div>
     <form>
      <input id="mostrarSecaoVolta" v-model="mostrarVolta" type="checkbox">
      <label for="mostrarSecaoVolta">Procurar também passagem de volta.</label>
      <section id="ida">
        <div id="aeroportoOrigem">
          <label>Origem: </label>
          <autocomplete :items="aeroportos" @input="search => {aeroportoDeOrigem = search}"></autocomplete>
        </div>

        <div id="aeroportoDestino">
          <label>Destino: </label>
          <autocomplete :items="aeroportos" @input="search => {aeroportoDeDestino = search}"></autocomplete>
        </div>

        <label for="dataDeIda">Data de ida: </label>
        <input id="dataDeIda" type="date" v-model="dataDeIda">


        <label id="dataDeVoltaLabel" for="dataDeVolta" v-if="mostrarVolta">Data de volta: </label>
        <input id="dataDeVolta" v-if="mostrarVolta" type="date" v-model="dataDeVolta"><br><br>

        <label for="numeroDeAdultos">Número de adultos: </label>
        <input id="numeroDeAdultos" type="number" min="0" max="5" v-model="numeroDeAdultos">

        <label id="numeroDeCriancasLabel" for="numeroDeCriancas">Número de crianças: </label>
        <input id="numeroDeCriancas" type="number" min="0" max="5" v-model="numeroDeCriancas"><br><br>
      </section>

      <button class="bProcurar">Procurar Vôos</button>
    </form>
  </div>
  </body>
</template>

<script src="./BuscarVoo.module.js"></script>
<style scoped src="./BuscarVoo.style.css"></style>
