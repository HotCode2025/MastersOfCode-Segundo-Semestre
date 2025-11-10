<script setup>
import foto1 from "/src/assets/nosotros/FranciscoK.png";
import foto2 from "/src/assets/nosotros/EmilianoB.png";
import foto3 from "/src/assets/nosotros/XimenaT.png"
import foto4 from "/src/assets/nosotros/JoaquinN.png";
import foto5 from "/src/assets/nosotros/RafaelP.png";
import foto6 from "/src/assets/nosotros/FrancoC.png";
import foto7 from "/src/assets/nosotros/JoseB.png";

const integrantes = [
  {
    nombre: "Francisco Knap",
    rol: "Desarrollador Frontend",
    descripcion: "Apasionado por el diseño web y la experiencia de usuario.",
    foto: foto1,
    linkedin: "https://linkedin.com",
    github: "https://github.com",
    instagram: "https://instagram.com",
    youtube: "https://youtube.com",
  },
  {
    nombre: "Emiliano Bogado",
    rol: "Desarrollador Backend",
    descripcion: "Encargado de la lógica y conexión con bases de datos.",
    foto: foto2,
    linkedin: "https://linkedin.com",
    github: "https://github.com",
    instagram: "https://instagram.com",
    youtube: "https://youtube.com",
  },
  {
    nombre: "Ximena Tapia",
    rol: "Tester QA",
    descripcion: "Verifica la calidad y el correcto funcionamiento del sitio.",
    foto: foto3,
    linkedin: "https://linkedin.com",
    github: "https://github.com",
    instagram: "https://instagram.com",
    youtube: "https://youtube.com",
  },
  {
    nombre: "Joaquin Navea",
    rol: "Diseñador UI",
    descripcion: "Diseña las interfaces y la identidad visual del proyecto.",
    foto: foto4,
    linkedin: "https://linkedin.com",
    github: "https://github.com",
    instagram: "https://instagram.com",
    youtube: "https://youtube.com",
  },
  {
    nombre: "Rafael Pacheco",
    rol: "Gestor de proyecto",
    descripcion: "Organiza tareas y coordina el trabajo del grupo.",
    foto: foto5,
    linkedin: "https://linkedin.com",
    github: "https://github.com",
    instagram: "https://instagram.com",
    youtube: "https://youtube.com",
  },
  {
    nombre: "Franco Cala",
    rol: "Analista funcional",
    descripcion: "Define los requerimientos y objetivos del proyecto.",
    foto: foto6,
    linkedin: "https://linkedin.com",
    github: "https://github.com",
    instagram: "https://instagram.com",
    youtube: "https://youtube.com",
  },
  {
    nombre: "Jose Britos",
    rol: "Soporte técnico",
    descripcion: "Ayuda en la implementación y solución de problemas técnicos.",
    foto: foto7,
    linkedin: "https://linkedin.com",
    github: "https://github.com",
    instagram: "https://instagram.com",
    youtube: "https://youtube.com",
  },
];
</script>

<template>
  <section id="nosotros" class="nosotros">
    <!--<h2 class="titulo">Nosotros</h2>-->

    <div class="integrantes">
      <div class="integrante" v-for="persona in integrantes" :key="persona.nombre">
        <img :src="persona.foto" :alt="persona.nombre" class="foto" />
        <h3>{{ persona.nombre }}</h3>
        <p class="rol">{{ persona.rol }}</p>
        <p class="descripcion">{{ persona.descripcion }}</p>

        <div class="redes">
          <a v-if="persona.linkedin" :href="persona.linkedin" target="_blank" title="LinkedIn">
            <i class="fab fa-linkedin"></i>
          </a>
          <a v-if="persona.github" :href="persona.github" target="_blank" title="GitHub">
            <i class="fab fa-github"></i>
          </a>
          <a v-if="persona.instagram" :href="persona.instagram" target="_blank" title="Instagram">
            <i class="fab fa-instagram"></i>
          </a>
          <a v-if="persona.youtube" :href="persona.youtube" target="_blank" title="YouTube">
            <i class="fab fa-youtube"></i>
          </a>
        </div>
      </div>
    </div>
  </section>
</template>


<style scoped>
.nosotros {
  padding: 60px 20px;
  background-color: #e9ebff;
  text-align: center;
}

.titulo {
  font-size: 2em;
  margin-bottom: 40px;
  color: #141c8c;
}

.integrantes {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 30px;
   color: #141d72;
}

.integrante {
  background: white;
  border-radius: 15px;
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
  width: 250px;
  padding: 20px;
  transition: transform 0.3s;
}

.integrante:hover {
  transform: translateY(-5px);
}

.foto {
  width: 180px;
  height: 180px;
  border-radius: 50%;
  object-fit: cover;
  margin-bottom: 15px;
}

.rol {
  font-weight: bold;
  color: #141d72;
}

.descripcion {
  font-size: 0.9em;
  color: #555;
  margin-bottom: 15px;
}

/* Estilo para redes */
.redes {
  display: flex;
  justify-content: center;
  gap: 10px;
}

.redes a {
  font-size: 1.3em;
  color: #0e0468;
  transition: color 0.3s, transform 0.2s;
}

.redes a:hover {
  color: #2aad97;
  transform: scale(1.2);
}
</style>