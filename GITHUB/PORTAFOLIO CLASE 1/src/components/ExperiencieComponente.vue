<script setup>
import icono1 from '/src/assets/ventas.svg';
import icono2 from '/src/assets/ecomerce.svg';
import icono3 from '/src/assets/configuracion.svg';
import icono4 from '/src/assets/uiux.svg';
import icono5 from '/src/assets/watch.svg';

import { ref } from 'vue';
const titulo = 'Desarrolladores Full Stack y Creativos Digitales';
const fecha = 'Enero 2021 – Noviembre 2025';
const experiencias = ref([
    { id: 1, src: icono1, parrafo: 'Colaboramos en el desarrollo de sistemas de gestión y plataformas web, incluyendo gestión de inventarios, reservas de restaurantes y plataformas de e-learning, aplicando buenas prácticas de programación y metodologías ágiles.' },
    { id: 2, src: icono2, parrafo: 'Implementamos interfaces modernas y responsivas con Vue.js, React y Bootstrap, garantizando una experiencia de usuario intuitiva en todos los dispositivos.' },
    { id: 3, src: icono3, parrafo: 'Participamos en la documentación y control de versiones de los proyectos mediante Git y GitHub, fomentando la colaboración eficiente entre todos los miembros del grupo.' },
    { id: 4, src: icono4, parrafo: 'Desarrollamos habilidades en automatización de procesos y despliegue con herramientas como Netlify, Docker y Firebase, mejorando la eficiencia del flujo de trabajo y la disponibilidad de los proyectos.' },
    { id: 5, src: icono5, parrafo: 'Fomentamos el aprendizaje colaborativo, compartiendo conocimientos sobre nuevas tecnologías, frameworks y buenas prácticas, fortaleciendo la formación de todo el grupo.' },
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experencia in experiencias" :key="experencia.id">
                <img class="imagen-svg" :src="experencia.src" width="45rem" :alt="experencia.parrafo">
                <p>{{ experencia.parrafo }}</p>
            </li>

            <!-- <li class="item"><img class="imagen-svg" src="/src/assets/ventas.svg" width="45rem" alt="">
                <p>Lideré un equipo de 5 desarrolladores en la creación de una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/ecomerce.svg" width="45rem" alt="">
                <p>Diseñé y desarrollé aplicaciones web utilizando Node.js, React y MongoDB, logrando reducir el tiempo de carga de las páginas en un 50%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/configuracion.svg" width="45rem" alt="">
                <p>Implementé soluciones de autenticación y autorización, mejorando la seguridad del sitio web y reduciendo los intentos de acceso no autorizado en un 20%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/uiux.svg" width="45rem" alt="">
                <p>Colaboré con diseñadores de UX/UI para crear interfaces de usuario atractivas y fáciles de usar, aumentando la satisfacción del cliente en un 15%.</p>
            </li>
            <li class="item"><img class="imagen-svg" src="/src/assets/watch.svg" width="45rem" alt="">
                <p>Automaticé procesos de despliegue continuo utilizando Jenkins y Docker, reduciendo los tiempos de despliegue en un 40%.</p>
            </li> -->
        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: #1A1F71;
    border-radius: 15px;
}

.titulo {
    font-size: 1.5rem;
    color: #6C63FF;
}

.fecha {
    font-size: 1rem;
    color: #3E5C76;
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
    color: #E0E6ED;
    border-bottom: 1px solid #2a2983;
}

.item:last-child {
    border-bottom: none;
}
</style>