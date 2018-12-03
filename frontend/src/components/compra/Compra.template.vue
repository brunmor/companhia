<template>
  <body>
 <h1>Comprar passagem</h1>
  <div class="compra">


     <br><h3>Já é cadastrado? Insira seu cpf para buscarmos os seus dados!</h3>
     <div id="buscarCompradorPorCpf">
       <input type="text" v-model="cpfParaBuscar"> <button class="bBuscar" v-on:click="buscarComprador(cpfParaBuscar)">Buscar</button>
     </div><br>

     <label for="dadosDoComprador">Dados pessoais:</label>
     <form id="dadosDoComprador" v-on:submit.prevent="salvarComprador">

       <label for="nomeDoComprador">Nome: </label>
       <input id="nomeDoComprador" type="text"
              v-model="dadosDoComprador.nome"> <br>

       <label for="cpf">Cpf:   </label>
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
              v-model="dadosDoComprador.endereco"><br><br>

       <button class="bSalvar">Salvar</button>
     </form>
     <button class="bLimpar" v-on:click="limparFormulario">Limpar Formulário</button>

   </div>
   </body>
</template>

<script src="./Compra.module.js"></script>
<style scoped src="./Compra.style.css"></style>
