<script setup>
const nombreapelido= "juan perez";
import HabilidadesComponente from './assets/components/HabilidadesComponente.vue';
</script>

<template>
  <header>
    <h1>{{ nombreapelido }}</h1>
    <p>Bienvenido a Vue 3</p>
  </header>
  <main>
    <section id="habilidades">
            <!--Componente Habilidades-->
            <h2>Habilidades</h2>
            <HabilidadesComponente />
        </section>
  </main>
</template>

<style scoped>

</style>
