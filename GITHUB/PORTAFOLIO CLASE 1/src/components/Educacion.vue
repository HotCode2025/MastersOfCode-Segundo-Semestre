<!-- eslint-disable vue/multi-word-component-names -->
<script setup>
import { ref } from 'vue';
const fechaColor = ref([])
fechaColor.vue =[
    {color: '#41516c'},
    {color: '#FBCA3E'},
    {color: '#E24A68'},
    {color: '#1B5F8C'},
    {color: '#4CADAD'}
]
const educacion = ref([])
educacion.value = [
    {fecha: '2024', title: 'Tecnicatura Universitaria en Programación', descripcion: 'Incumbencias Profecionales: Operación y programación de computadoras, desarrollo de programas en distintos lenguajes, análisis y control de sistemas informaticos.', enlace:'http://www.youtube.com/'},
    {fecha: '2023', title: 'Desarrollador Full Strack', descripcion: 'Trabajé en XYZ Tech, donde diseñe y desarrollé aplicaciones web completas utilizando tecnologias como Node.js, React y MongoDB.' enlace:'http:www.direccion.com'},
    {fecha: '2022', title: 'Internship en Desasrrolo Web', descripcion: 'Realicé una pasantía en ABC Solution, contribuyendo en la creacion de interfaces de usuario y optimizacion de sitios web.', enlace: 'http:www.direccion.com'},
    {fecha: '2021', title: 'Proyecto Personal - Aplicación de Gestión de Tareas', descripcion: 'Desarrollé una aplicación para la gestion de tareas diarias usando HTML, CSS y JavaScript, implementando funcionalidades como listas de tareas y recomendatorios.', enlace:'http:www.direccion.com'},
    {fecha: '2020', title: 'Curso de Intrucción a la Programación', descripcion: 'Completé un curso en línea sobre fundamentos de programación , donde aprendí lenguajes como Python y Java.', enlace:'http:www.direccion.com'}
];
</script>

<template>
    <ul>
        <li v-for="{item, index} in educacion" :Key="index" :style="{'--fecha-color': fechaColor{index}.color}">
            <div class="fecha">{{ item.fecha }}</div>
            <div class="Title">{{ item.title }}</h3>
            <div class="descripción">{{ item.descripcion }}</div>
            <!-- Aqui vemos con el uso de b-vid (:) que bindeamos el atributo herf de html con el item.enlace-->
            <a class="enlace":href="item.enlace" target="_blank">Saber más</a>
        </li>
    </ul>
</template>

<style scoped>
/* Estilos generales*/
@import url();
/* Reseteo de estilos básicos para todos los elementos y pseudo-elementos */
*,
*::before,
*::after {
    margin: 0; /* Elimina el margen predeterminado */
    padding: 0; /* Elimina el padding predeterminado */
    box-sizing: border-box; /* Incluye el padding y el borde en el tamaño total del elemento*/
}

/* Estilos para el cuerpop de la pagína */
body{
    --color: rgba(30,30,30); /* variable para el color de texto */
    --bgColor: rgba(245,245,245); /* variable para el color de fondo */
    min-height: 100vh; /*asegura que el cuerpo ocupe al menos el 100% de la altura de la ventana */
    display: grid; /* utiliza el modelo de caja cuadricula */
    align-content: center;/* centra verticalmente el contenido dentro de la cuadricula */
    gap: 2rem; /* espaciado entre los elementos de la cuadricula */
    padding: 2rem; /* espaciado interno alrededor del cuerpo */
    font-family: "Poppins", "sans-serif"; /* fuente para todo el texto en la pagina */
    color: var(--color); /* aplica el color de texto definido en la variable */
    background: var(--bgColor); /* aplica el color de fondo definido en la variable */
}

/* Estilos para la lista */
ul{
    margin-top: 2rem;
    --col-gap: 2rem; /* Espacio entre columnas de la cuadricula */
    --row-gap: 2rem; /* Espacio entre las filas de la cuadricula */
    --line-w: 0.25rem; /* ancho de la linea que conecta los elementos de la lista */
    display: grid; /* usa un layout de cuadricula */
    grid-template-columns: var(--line-w) 1fr; /* define  las columnas de la cuadricula: la primera es la linea y la segunda es el contenido */
    grid-auto-columns: max-content; /* las scolumnas se  ajustan automaticamente al contenido */
    column-gap: var(--col-gap); /* espacio entre las columnas */
    list-style: none; /* elimina las viñetas predeterminadas de la lista */
    width: main(60rem, 90%); /* limita el ancho de la lista al minimo entre 60rem y el 90% del ancho de la ventana */
    margin-inline: auto; /* centra la lista horizontalmente */
}

/* Estilo para la linea vertical que conecta los elementos de la lista */
ul::before {
    content: ""; /* elemento vacio para crear la linea */
    grid-column: 1; /* colocar la linea en la primera columna de la cuadricula */
    grid-row: 1 / span 20; /* la linea se extiende sobre variaas filas */
    background: rgb(225, 225, 225); /* color de la linea */
    border-radius: calc(var(--line-w) / 2); /* bordedes redondeados para la linea */
}

/* Estilo para los elementos de la lista que no son el ultimo */
ul li:not(:last-child) {
    margin-bottom: var(--row-gap); /* espacio entre los elementos de la lista */
}

/* Estilo para cada item de la lista */
ul li {
    grid-column: 2; /* coloca el contenido en la segunda columna de la cuadricula */
    --inlineP: 1.Srem; /* espacio intereno horizontal dentro dede  cada item */
    margin-inline: var(--inlineP); /* margen horizontal para los item */
    grid-row: span 2; /* cada item ocupa dos filas en la cuadricula */
    display: grid; /* usa un layout de cuadricula dentro de cada item */
    grid-template-rows: min-content min-content min-content; /* define tres filas de altura minimas */
}

/* Estilo paraa la fecha dentro de cada item */
ul li .fecha{
    --dateH: 3rem; /* altura de la seccion de la fecha */
    height: var(--dateH); /* aplica la altura definida */
    margin-inline: calc(var(--inlineP) * -1); /* ajusta el margen horizontal para que la fecha sobresalga */
    text-align: center; /* centra el texto dentro de la fecha */
    background-color: var(--fecha-color); /* color de fondo, usando unaa variable personalizada */
    color: white; /* color del texto de la fecha */
    font-size: 1.25rem; /* tamaño del texto */
    font-weight: 700; /* hace el texto en negrita */
    display: grid; /* usa un layout de cuadricula */
    place-content: center; /* centra el contenido de la fecha */
    position: relative; /* posiciona la fecha relativva a su contenedor */
    border-radius: calc(var(--dateH) / 2) 0 0 calc(var(--dateH) / 2); /* bordes redondeados para la fecha */
}

/* Estilo para la parte inferior de la fecha, que parece un triangulo */
ul li .fecha::before {
    content: ""; /* elemento vacio para a crear el triangulo */
    width: var(--inlineP); /* ancho igual al espacio interno definido */
    aspect-ratio: 1; /* mantiene una relacion de aspecto 1:1 para crear un cuadrado */
    background: var(--fecha-color); /* usa el color de fondo de la fecha */
    background-image: linear-gradient(rgba(0,0,0,0.2) 100%, transparent); /* aplica un degradado sutil para dar un efecto de sombra */
    position: absolute; /* posiciona el triangulo reespecto al contenedor de la fecha */
    top: 100%; /* coloca el triangulo justo debajo de la fecha */
    clip-path: polygon(0 0, 100% 0, 0 100%); /* recorta el cuadrado para convertirlo en un triangulo */
    right: 0; /* alinea el triangulo a la derecha de la fecha */
}

/* Estilo para el circulo que conecta la fecha con la linea */
ul li .fecha::after {
    content: ""; /* elemento vacio paraa crear el circulo */
    position: absolute; /* posiciona el circuito respecto al contenedor de la fecha */
    width: 1rem; /* ancho del circulo */
    aspect-ratio: 1; /* mantiene una relacion de aspecto 1:1 para crear un circulo */
    background: var(--bgColor); /* color de fondo, utilizando la variable definida */
    border: 0.3rem solid var(--fecha-color); /* borde del circulo, con el color de la fecha */
    border-radius: 50%; /* hace que el elemento sea un circulo dentro del contenedor para alinearlo correctamente */
    top: 50%; /* centra verticalmente el circulo dentro del contyenedor de la fecha */
    transform: translate(50%, -50%); /* ajusta la posicion del circulo para alinearlo correctamente */
    right: calc(100% + var(--col-gap) + var(--line-w) / 2); /* coloca el circulo a la izquierda ded la linea */
}

/* Estilo para el titulo y la descripcion dentro de cada item */
ul li .title,
ul li .descripcion {
    background: var(--bgColor); /* fondo del titulo y la descripcion, usando la variable definida */
    position: relative; /* posiciona los elementos relativos a su contenedor */
    padding-inline: 1.5rem; /* espaciado interno horizontal */
}

ul li .title{
    overflow: hidden; /* oculta cualquier contenido que se desborde */
    padding-block-start: 1.5rem; /* espaciado interno superior */
    padding-block-end: 1rem; /* espaciado interno inferior */
    font-weight: 500; /* hace el texto del titulo un poco más grueso */
}

ul li .descripcion{
    padding-block-end: 1.5rem; /* espaciado interno inferior */
    font-weight: 300; /* hace el texto de la descripcion más delgado */
}

/* Estilo paara las sombras debajo del titulo y la descripcion */
ul li .fecha::before,
ul li .descripcion::before{
    content: ""; /* elemento vacio para crear la sombra */
    position: absolute; /* posiciona la sombra respecto al contenedor del titulo o descripcion */
    width: 90%; /* ancho de la sombra */
    height: 0.5rem; /* altura de la sombra */
    background: rgba(0, 0, 0, 0.5); /* color de fondo oscuro para simular una sombra */
    left: 50%; /* centra la sombra horizontalmente */
    border-radius: 50%; /* bordes redondeados para la sombra */
    filter: blur(4px); /* aplica un desenfoque para hacer la sombra mas suave */
    transform: translate(-50%, 50%); /* ajusta la popsicion para centrar la sombra */
}

ul li .title::before{
    bottom: calc(100% + 0.125rem); /* coloca la sombra debajo del titulo */
}

ul li .descripcion::before{
    z-index: -1; /* coloca la sombra detras del contenido */
    bottom: 0.25rem; /* coloca la sombra justo */
}


/* Media query para pantallas anchas (40rem o mas) */
@media (min-width: 40rem) {
    ul {
        grid-template-columns: 1fr var(--line-w) 1fr; /* ajusta la cuadricula para tener tres columnas */
    }
    ul::before {
        grid-column: 2; /* mueve la linea vertical a la segunda columna de la cuadricula */
    }
    ul li:nth-child(odd) {
        grid-column: 1; /* coloca los items importantes en la primera columna */
    }
    ul li:nth-child(even) {
        grid-column: 3; /* coloca los items pares en la tercera columna */
    }  
  
    /* Ajuste para que el segundo item abarque dos filas */
    ul li:nth-child(2) {
        grid-row: 2/4; /* el segundo item ocupara desde la segunda hasta la cuarta fila */
    }

    /* Ajustes especificos para los items impares */
    ul li:nth-child(odd) .fecha::before{
        clip-path: polygon(0 0, 100% 0, 100% 100%); /* invierte el triangulo en los items impares */
        left: 0; /* alinea el triangulo a la izquierda */
    }

    ul li:nth-child(odd) .fecha::after {
        transform: translate(-50%, -50%); /* ajusta la posicion del circulo en los items impares */
        left: calc(100% + var(--col-gap) + var(--line-w) / 2); /* coloca el circulo a la derecha de la linea */
    }

    ul li:nth-child(odd) .fecha {
        border-radius: 0 calc(var(--dateH) / 2) calc(var(--dateH) / 2) 0; /* ajusta los bordes redondeados para los items impares */
    }
}

/* Estilo para los creditos */
.credits {
    margin-top: 1rem; /* espaciado superior para los creditos */
    text-align: right; /* alinea el texto de loss creditos a la derecha */
}
.credits a {
    color: var(--color); /* aplica el color de texto definido en la variable */
}
</style>