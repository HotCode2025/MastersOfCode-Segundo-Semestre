<template>
  <div>
    <h1>MASTER OF CODE</h1>
    <p>Segundo Semestre</p>
  </div>
</template>

<script setup>
/// aca estaba el error, no habia NADA y NavBar seguia llamando la funcion, corran el codigo 
//cuando hagan cambios asi para doble verificar

import { ref } from 'vue';
const nombre = ref('Jocézitho');
</script>

<style scoped>

h1 {
  color: blue;
}
</style>