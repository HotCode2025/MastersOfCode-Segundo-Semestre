<script setup>
import NavBar from './components/NavBar.vue';

import DatosPersonales from './components/DatosPersonales.vue';
/// aca estaba el error, no habia NADA y NavBar seguia llamando la funcion, corran el codigo 
//cuando hagan cambios asi para doble verificar
//re-usenlo para el titulo o no se


import EducacionComponente from './components/EducacionComponente.vue';
import InteresesComponente from './components/InteresesComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import NosotrosComponente from './components/NosotrosComponente.vue';
import ExperiencieComponente from './components/ExperiencieComponente.vue';
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
       <section id="nosotros">
      <!--Componente Nosotros-->
      <h2>Nosotros</h2>
      <NosotrosComponente />
    </section>
      <section id="educacion">
          <h2>Educacion - Cursos</h2>
          <!--Componente Educacion-->
          <EducacionComponente />
      </section>
      <section id="experiencia"><h2>Experiencia</h2></section>
      <ExperiencieComponente />
      <section id="proyectos"><h2>Proyectos</h2></section>
      <section id="habilidades">
      <!--Componente Habilidades-->
      <h2>Habilidades</h2>
      <HabilidadesComponente />
    </section>
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
