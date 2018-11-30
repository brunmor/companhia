<template>
  <div class="buscarVoo">
    <h4>{{titulo}}</h4>

    <form>
      <input v-model="mostrarVolta" type="checkbox">
      <section id="ida">
        <p>Ida</p>
      </section>

      <section v-if="mostrarVolta" id="volta">
        <p>Volta</p>
      </section>
    </form>
  </div>
</template>

<script src="./BuscarVoo.module.js"></script>
<style scoped src="./BuscarVoo.style.css"></style>
