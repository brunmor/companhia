<template>
<body>
 <h1>Pesquisar Vôos</h1>
    <div>
     <form>
      <input id="mostrarSecaoVolta" v-model="mostrarVolta" type="checkbox">
      <label for="mostrarSecaoVolta">Procurar também passagem de volta.</label>
      <section id="ida">
        <label for="aeroportoDeOrigem">Aeroporto de origem: </label>
        <input id="aeroportoDeOrigem" type="text" v-model="aeroportoDeOrigem"><br>

        <label for="aeroportoDeDestino">Aeroporto de destino: </label>
        <input id="aeroportoDeDestino"  type="text" v-model="aeroportoDeDestino"><br>

        <label for="dataDeIda">Data de ida: </label>
        <input id="dataDeIda" type="date" v-model="dataDeIda"><br>

        <label for="dataDeVolta" v-if="mostrarVolta">Data de volta: </label>
        <input id="dataDeVolta" v-if="mostrarVolta" type="date" v-model="dataDeVolta"><br>

        <label for="numeroDeAdultos">Número de adultos: </label>
        <input id="numeroDeAdultos" type="number" min="0" max="5" v-model="numeroDeAdultos"><br>

        <label for="numeroDeCriancas">Número de crianças: </label>
        <input id="numeroDeCriancas" type="number" min="0" max="5" v-model="numeroDeCriancas">
      </section>

      <button>Procurar Vôos</button>
    </form>
  </div>
  </body>
</template>

<script src="./BuscarVoo.module.js"></script>
<style scoped src="./BuscarVoo.style.css"></style>
