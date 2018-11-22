<template>
  <div class="compra">
    <div id="dadosDoComprador">

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
             v-model="dadosDoComprador.endereco">


    </div>
    <div id="pagamento">
      <p>Todo: Pagamento</p>

    </div>
  </div>
</template>

<script src="./Compra.module.js"></script>
<style scoped src="./Compra.style.css"></style>
