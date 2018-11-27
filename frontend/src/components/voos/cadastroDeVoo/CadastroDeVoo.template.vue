<template>
  <div class="cadastroDeVoo">
    <h1>Cadastro De Vôos</h1>
    <label for="cadastrarVoosPadrao">Caso não tenha vôos cadastrados no  banco, clique aqui.</label>
    <button id="cadastrarVoosPadrao" v-on:click="cadastrarVoosPadrao">Cadastrar!</button>
  </div>
</template>

<script src="./CadastroDeVoo.module.js"></script>
<style src="./CadastroDeVoo.style.css"></style>
