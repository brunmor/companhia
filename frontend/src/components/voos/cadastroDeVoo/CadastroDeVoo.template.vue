<template>
  <div class="cadastroDeVoo">
    <h1>Cadastro De Vôos</h1>
    <label for="cadastrarVoosPadrao">Caso não tenha vôos cadastrados no  banco, clique aqui para cadastrar uma lista.</label>
    <button id="cadastrarVoosPadrao" v-on:click="cadastrarVoosPadrao">Cadastrar!</button><br>

    <label for="cadastrarAeroportosPadrao">Caso não tenha aeroportos cadastrados no  banco, clique aqui para cadastrar uma lista padrão.</label>
    <button id="cadastrarAeroportosPadrao" v-on:click="cadastrarAeroportosPadrao">Cadastrar!</button><br>

    <label for="cadastrarCompanhiasAereasPadrao">Caso não tenha companhias aéreas cadastrados no  banco, clique aqui para cadastrar uma lista.</label>
    <button id="cadastrarCompanhiasAereasPadrao" v-on:click="cadastrarCompanhiasAereasPadrao">Cadastrar!</button><br>

    <label>Ou insira um novo vôo manualmente: </label><br><br>
    <form v-on:submit.prevent="salvarNovoVoo">
      <label for="cidadeOrigem">Cidade de origem: </label>
      <input id="cidadeOrigem" v-model="novoVoo.cidadeDeOrigem" type="text"><br>

      <label for="cidadeDestino">Cidade de desitno: </label>
      <input id="cidadeDestino" v-model="novoVoo.cidadeDeDestino" type="text"><br>

      <label for="dataDeIda">Data de ida: </label>
      <input id="dataDeIda" v-model="novoVoo.dataDeIda" type="date"><br>

      <label for="dataDeVolta">Data de Volta: </label>
      <input id="dataDeVolta" v-model="novoVoo.dataDeVolta" type="date"><br>

      <label for="precoDoVoo">Valor: </label>
      <input id="precoDoVoo" v-model="novoVoo.preco" type="text"><br><br>

      <button>Salvar</button>
    </form>

  </div>
</template>

<script src="./CadastroDeVoo.module.js"></script>
<style src="./CadastroDeVoo.style.css"></style>
