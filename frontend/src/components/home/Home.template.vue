<template>
  <div class="home">
    <span class="border"></span>
    <div class="container-fluid">
      <h1>Jane Tour</h1>

      <div class="jumbotron">
        <h1 class="display-4">Quer viajar?</h1>
        <p class="lead">Aqui na Jane Tour temos os melhores preços para todos os destinos, confira!</p>
        <hr class="my-4">
        <p>A sua viagem a um clique de você!</p>
        <p class="lead">
          <router-link class="btn btn-primary btn-lg" to="buscarVoo">Buscar Passagens</router-link>
        </p>
      </div>
    </div>
  </div>
</template>

<script src="./Home.module.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
