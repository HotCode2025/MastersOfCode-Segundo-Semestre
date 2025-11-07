<script setup>

</script>

<template>
  <header>
    <!--barra de navegacion-->
    <nav class="navbar">
      <div class="navbar-menu">
        <ul>
          <li><a href="#educacion" class="navbar-item">Educacion</a></li>
          <li><a href="#experiencia" class="navbar-item">Experiencia</a></li>
          <li><a href="#proyectos" class="navbar-item">Proyecto</a></li>
          <li><a href="#habilidades" class="navbar-item">Habilidades</a></li>
        </ul>
      </div> 
    </nav>  
  </header>
  <main>
    <section id="educacion"><h2>Educacion - Cursos</h2></section>
    <section id="experiencia"><h2>Experiencia</h2></section>
    <section id="proyectos"><h2>Proyecto</h2></section>
    <section id="habilidades"><h2>Habilidades</h2></section>
    <section id="intereses"><h2>intereses</h2></section>
  </main>
</template>

<style scoped>
.navbar {
  background-color: var(--vt-c-indigo);
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
.nav-list {
  list-style: none;
}

a {
  border: 1px solid;
  border-color: hsla(100, 100%, 37%, 0.2);
  border-radius: 5px;
  /*elimina lo subrayado de elementos y elementos con clase "green"*/
  text-decoration: none;
  /*añade una transicion suave para los cambios de estilo*/
  transition: 0.4s;
  /*añade padding alrededor del contenido*/
  padding: 5px;
}
a :hover{
  background-color: hsla(160, 100%, 37%, 0.2)
}

@media (max-width: 768px) {
  .navbar-menu{
    display: flex;
    justify-content: flex-end;
    width: 100%;
  }
}

</style>
