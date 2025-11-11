<template>
    <nav class="navbar">
        <div class="navbar-menu">
            <ul>
                <li v-for="nav in navegacion" :key="nav.nombre">
                    <a :href="nav.enlace" class="nav-item">{{nav.nombre}}</a> 
                </li>
            </ul>
        </div>
    </nav>
</template>

<script setup>
import { ref } from 'vue';
const navegacion= ref([
    {id:1, nombre:'Nosotros', enlace:'#nosotros'},
    {id:2, nombre:'Capacitación', enlace:'#capacitación'},
    {id:3, nombre:'Experiencia', enlace:'#experiencia'},
    {id:4, nombre:'Proyectos', enlace:'#proyectos'},
    {id:5, nombre:'Habilidades', enlace:'#habilidades'},  
    {id:6, nombre:'Intereses', enlace:'#intereses'},
])
</script>


<style scoped>
.navbar {
  background-color:  #293d7c;
  color: #fff;
  padding: 0.5rem 1rem;
  align-items: center;
}
.navbar-item {
  color: #fff;
  text-decoration: none;
  margin-right: 1rem;
}
.navbar-menu {
  display: flex;
  justify-content: flex-end;
}
.navbar-menu ul {
    display: flex;         /* 1. Pone los <li> en línea horizontal */
    flex-wrap: wrap;       /* 2. Permite que bajen de línea si no caben */
    list-style: none;      /* 3. Quita los puntos de la lista */
    padding: 0;            /* 4. ¡Quita el padding que causaba el error! */
    margin: 0;             /* 5. Quita el margen por defecto */
}

a {
  border: 1px solid hsla(210, 70%, 50%, 0.3);
  border-color: hsla(100, 100%, 37%, 0.2);
  border-radius: 5px;
  /*elimina lo subrayado de elementos y elementos con clase "green"*/
  text-decoration: none;
  /*añade una transicion suave para los cambios de estilo*/
  transition: 0.4s;
  /*añade padding alrededor del contenido*/
  padding: 5px;
  color: #D0E6FF;
}
a :hover{
  background-color:hsla(210, 70%, 50%, 0.2);
}

.nav-item:hover {
    background-color: hsla(250, 50%, 60%, 0.3);
}

@media (max-width: 768px) {
  .navbar-menu{
    display: flex;
    justify-content: flex-end;
    width: 100%;
  }
}

</style>