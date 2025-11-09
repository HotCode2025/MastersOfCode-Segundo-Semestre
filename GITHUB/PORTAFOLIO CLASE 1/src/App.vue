<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/datosPersonales.vue';
import Educacion from './icons/Educacion.vue';
import InteresesComponente from './components/InteresesComponente.vue';
</script>

<template>
  <header id="top">
      <!--Barra de Navegación-->
      <NavBar />
      <!--Componente Datos Personales-->
      <DatosPersonales />
  </header>
  <main>
      <!-- el estilo css de section se encuentra en base.css-->
      <section id="educacion">
          <h2>Educacion - Cursos</h2>
          <!--Componente Educacion-->
          <Educacion />
      </section>
      <section id="experiencia"><h2>Experiencia</h2></section>
      <section id="proyectos"><h2>Proyectos</h2></section>
      <section id="habilidades"><h2>Habilidades</h2></section>
      <section id="intereses">
          <!--Componente Intereses-->
          <h2>intereses</h2>
          <InteresesComponente />
      </section>
  </main>
  <footer>
      <a href="#top">Inicio</a>
      <p>  2024 Rafael Pacheco (los demas nombres)- Portafolio Web</p>
  </footer>
</template>

<style scoped>
footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 2rem;
  font-size: 1.3rem;
}
</style>
