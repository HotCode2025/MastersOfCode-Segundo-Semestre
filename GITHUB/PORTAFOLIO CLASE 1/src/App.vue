<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import EducacionComponente from './components/EducacionComponente.vue';
import InteresesComponente from './components/InteresesComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import NosotrosComponente from './components/NosotrosComponente.vue';
import ExperiencieComponente from './components/ExperiencieComponente.vue';
import ProyectosComponentes from './components/ProyectosComponentes.vue';
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
        <section id="Nosotros">
            <!--Componente Nosotros-->
            <h2>Nosotros</h2>
            <NosotrosComponente />
        </section>
        <section id="capacitacion">
            <h2>Capacitación</h2>
            <!--Componente Educación-->
            <EducacionComponente />
        </section>
        <section id="experiencia">
            <h2>Experiencia de Equipo</h2>
            <!--Componente Experiencia-->
            <ExperiencieComponente />
        </section>
        <section id="proyectos">
            <h2>Proyectos</h2>
            <!--Componente Proyectos-->
            <ProyectosComponentes />
        </section>
        <section id="habilidades">
            <!--Componente Habilidades-->
            <h2>Habilidades</h2>
            <HabilidadesComponente />
        </section>
        <section id="intereses">
            <!--Componente Intereses-->
            <h2>Intereses</h2>
            <InteresesComponente />
        </section>
  </main>
  <footer>
      <a href="#top">Inicio</a>
      <p> © 2025 Masters Of Code - Portafolio Grupal Web</p>
  </footer>
</template>


<style>
html, body {
  margin: 0;
  padding: 0;
  height: 100%;
  width: 100%;
  overflow-x: hidden; 
}

body {
  background: linear-gradient(-45deg, #E0E6ED, #1A1F71, #6C63FF, #3E5C76);
  background-size: 600% 600%; 
  animation: gradientBG 10s ease infinite; 
}

#app {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  color: rgb(184, 223, 255);
}

@keyframes gradientBG {
  0% { background-position: 0% 50%; }
  25% { background-position: 50% 100%; }
  50% { background-position: 100% 50%; }
  75% { background-position: 50% 0%; }
  100% { background-position: 0% 50%; }
}

/* Footer y títulos visibles */
footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 2rem;
  font-size: 1.3rem;
}
h2 {
  color: rgb(180, 194, 220); 
}
</style>

