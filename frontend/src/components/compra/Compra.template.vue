<template>
  <div class="compra">
    <h1>Compra de passagens</h1>

    <h3>Já é cadastrado? Insira seu cpf para buscarmos os seus dados!</h3>
    <div id="buscarCompradorPorCpf">
      <input type="text"> <button>Buscar</button>
    </div><br>

    <label for="dadosDoComprador">Dados pessoais:</label>
    <form id="dadosDoComprador" v-on:submit.prevent="salvarComprador">

      <label for="nomeDoComprador">Nome: </label>
      <input id="nomeDoComprador" type="text"
             v-model="dadosDoComprador.nome"> <br>

      <label for="cpf">Cpf: </label>
      <input id="cpf" type="text"
             v-model="dadosDoComprador.cpf"><br>

      <label for="email">Email: </label>
      <input id="email" type="text"
             v-model="dadosDoComprador.email"><br>

      <label for="dataDeNascimento">Data De Nascimento: </label>
      <input id="dataDeNascimento" type="date"
             v-model="dadosDoComprador.dataDeNascimento"><br>

      <label for="telefone">Telefone: </label>
      <input id="telefone" type="text"
             v-model="dadosDoComprador.telefone"><br>

      <label for="endereco">Endereço: </label>
      <input id="endereco" type="text"
             v-model="dadosDoComprador.endereco"><br>

      <button>Salvar</button>

    </form>
    <div id="pagamento">
      <p>Todo: Pagamento</p>

    </div>
  </div>
</template>

<script src="./Compra.module.js"></script>
<style scoped src="./Compra.style.css"></style>
