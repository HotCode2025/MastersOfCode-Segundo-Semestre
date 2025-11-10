<script setup>
import github from '../assets/github_icon.svg';

const title = 'Masters of Code';
const descripcion = 'Grupo de estudiantes de la Tecnicatura Universitaria en Programación - UTN';
const residencia = 'San Rafael, Mendoza, Argentina';
const presentacion = 'Les damos la bienvenida al portafolio de Masters of Code, un grupo de estudiantes dedicados al desarrollo de software y al aprendizaje constante en el mundo de la tecnología.';
const redesSociales = [
  { id: 1, name: 'github', src: github, url: '/src/assets/github_icon.svg', https: '//github.com/HotCode2025/MastersOfCode-Segundo-Semestre' },
];
</script>

<template>
<section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
        </li>
      </ul>
      <h3>{{ residencia }}</h3>
    </div>    
</section>     
</template>

<style scoped>
h1 {
    font-size: 2.5rem;
    color: #bbd5f1; 
}

p {
    font-size:1.2rem;
    font-weight: 600;
    margin-bottom: 1rem;
    color: #5DA9E9;
}

.card{
    background-color: #293d7c;
    border-radius: 10px;
    padding: 10px;
    margin: 10px;
    text-align: center;
    color: #EAF2FA;
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
    background-color: #EAF2FA;
    border-radius: 50%;
    padding: 2px;
    margin: 5px;
    box-shadow: 0 0 5px rgba(58, 124, 165, 0.6);
}

.icon-redsocial:hover {
    background-color: #1B3B5F;
    box-shadow: 0 0 5px rgba(251, 249, 249, 0.934) ;
}
h2{
    font-size: 1.2rem;
    font-weight: 600;
    color: #EAF2FA;
}
h3{
    font-size: 1.2rem;
    font-weight: 600;
    color: #5DA9E9;
}
</style>