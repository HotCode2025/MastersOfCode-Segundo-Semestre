<script setup>
import { ref } from 'vue';
import FondoLava from '../FondoLava.vue'
//este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref ([
    'Desarrolo de Sofware de Código Abierto: contribuyo a proyectos en GitHub, colaborando con otros desarrolladores para mejorar herramientas y librerias populares'
    'Deportes al Aire Libre: disfruto del senderismo y el ciclismo de montaña, actividades que practico regularmente para mantener un equilibrio entre trtabajo y la vida peresonal'
    'Tecnologia de Innovación: me apaciona explorar nuevas tendencias tecnologicas como la inteligencia artificial y el desarrollo de aplicaciones móviles'
    'Fotografía: praactico la fotografía como un hobby, lo que me ayuda a mantener una perspectiva creativa tanto en mi vida profecional como personal'
])
</script>

<templete>
    <div class= "intereses-contenedor">
        <FondoLva />
        <ul ul class="contenedor-lista">
            <li class="item" v-for="intereses in intereses" :key="intereses">
                {{ intereses }}
            </li>
        </ul>
    </div>
    <!--<div class= "intereses-contenedor">
        <ul class="contenedor-lista">
            <li class="item">
                Desarrolo de Sofware de Código Abierto: contribuyo a proyectos en GitHub, colaborando con otros
                desarrolladores para mejorar herramientas y librerias populares
            <li>
            <li class="item">
                Deportes al Aire Libre: disfruto del senderismo y el ciclismo de montaña, actividades que practico
                regularmente para mantener un equilibrio entre trtabajo y la vida peresonal
            </li>
            <li class="item">
                Tecnologia de Innovación: me apaciona explorar nuevas tendencias tecnologicas como la inteligencia
                artificial y el desarrollo de aplicaciones móviles
            </li>
            <li class="item">
                Fotografía: praactico la fotografía como un hobby, lo que me ayuda a mantener una perspectiva creativa
                tanto en mi vida profecional como personal
            </li>
        </ul>
    </div>-->
</templete>
<!-- lo que esta mas arriba no se preocupen ya que mientras vayan cargando los archivos se va a ir acomodando y el ultimo que lo termine borre este mensaje-->
<style scoped>
.intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    padding: 1rem;
}

.contenedor.lista {
    list-style-type: none;
    padding: 1rem;
    margin-bottom: .5rem;
    color: var(--vt-c-white-soft);
    font-size: 1.4rem;
    text-shadow: 3px 3px 6px rgba(0, 0, 0, 1);
}

.item {
    margin-bottom: 1rem;
}
</style>