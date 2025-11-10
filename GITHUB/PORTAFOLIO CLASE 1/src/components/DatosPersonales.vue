<script setup>
import github from '../assets/github_icon.svg';

const title = 'Masters of Code';
const descripcion = 'Tecnicatura Universitaria en Programación – UTN';
const residencia = 'San Rafael, Mendoza, Argentina';
const presentacion = 'Les damos la bienvenida al portafolio de Masters of Code, un grupo de estudiantes dedicados al desarrollo de software y al aprendizaje constante en el mundo de la tecnología.';
const redesSociales = [
  { id: 1, name: 'github', src: github, url: '/src/assets/github_icon.svg', https: '//github.com/HotCode2025/MastersOfCode-Segundo-Semestre' },
];
</script>

<template>
<section class="datos-personales">
  <section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>
      <u1 v-for="red in redesSociales" :key="red.id">
        <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
      </u1>
      <h3>{{ residencia }}</h3>
    </div>  
    </section>   
</section>     
</template>

<style scoped>
h1 {
    font-size: 2.5rem;
}

p {
    font-size:1.2rem;
    font-weight: 600;
    margin-bottom: 1rem;
}

.card{
    background-color: rgb(28, 41, 52);
    border-radius: 10px;
    padding: 10px;
    margin: 10px;
    text-align: center;
}

.container-lista {
    display: flex;
    justify-content: center;
    list-style: none;
    padding: 0%;
    margin: 0%;
    text-align: center;
}

.icon-redsocial {
    align-items: center;
    background-color: aliceblue;
    border-radius: 50%;
    padding: 2px;
    margin: 5px;
    box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}

.icon-redsocial:hover {
    background-color: rgb(28, 41, 52);
    box-shadow: 0 0 5px rgba(251, 249, 249, 0.934) ;
}
h3{
    font-size: 1.2rem;
    font-weight: 600;
}
</style>