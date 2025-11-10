# Clase 11 - Cosas importantes en JavaScript

## Apuntes de clase 11


## ¿Cómo creamos funciones en JavaScript de manera descriptiva?

Tenemos que tener presente que utilizamos el tipo de escritura **Camel case** y sus identificadores normalmente los vamos a encontrar en inglés, veamos varios ejemplos:

---

### Estas funciones tienen que ver con la manipulación de datos

```
calculateTotalPrice()
formatUserInput()
validateEmailAddress()
convertToCamelCase()
filterActiveUsers()
```

---

### Eventos o Interacción

```
handleButtonClick()
onFormSubmit()
toggleDarkMode()
updateProgressBar()
initializeApp()
```

---

### Operaciones CRUD

```
createNewUser()
fetchUserData()
updateUserProfile()
deleteUserAccount()
```

---

### Utilidades

```
generateRandomId()
formatCurrency()
debounceSearch()
sanitizeInput()
checkPermissions()
```

---

### Veamos un ejemplo en código:

```js
// En lugar de:
function abc() { }

// Mejor:
function calculateMonthlyRevenue() {
    // código aquí
}

function validateUserCredentials() {
    // código aquí
}
```

---

### Otro ejemplo es una función para sumar todo lo que recibe:

```js
// Más específica o más utilizada
calculateTotalSum()

// Clara y directa
sumAllInputs()

// Concisa pero descriptiva
computeTotal()

// Alternativas excelentes
calculateSum()
getTotalAmount()
sumAllValues()
```

---

### Implementando los ejemplos:

```js
function calculateTotalSum(...inputs) {
    return inputs.reduce((total, current) => total + current, 0);
}

// Uso:
console.log(calculateTotalSum(1, 2, 3, 4)); // 10
console.log(calculateTotalSum(10, 20)); // 30
```

---

Aunque todavía no vamos a avanzar en funciones flechas y otras cosas más avanzadas, ya que lo veremos más adelante, es importante comenzar a tener en cuenta esta forma productiva de trabajar a la hora de programar en JavaScript.

---

### A la hora de trabajar tenemos que tener en cuenta los siguientes ítems para un identificador de función,
en este ejemplo sería una función para sumar todo lo que recibe:

✅ Es muy descriptiva  
✅ Indica que hace un cálculo  
✅ Específica que es una suma  
✅ Suena natural en inglés  
✅ Fácil de entender para otros desarrolladores


## TAREA CLASE 11

## Tarea: Funciones descriptivas en JavaScript

En JavaScript, las funciones deben tener nombres **descriptivos** que expliquen claramente qué hacen.  
Usamos la escritura **camelCase** y preferimos nombres en inglés que suenen naturales.  

A continuación se detallan ejemplos por categoría, su **significado en español** y **5 puntos importantes** para comprender qué hace cada función.

---

##  Manipulación de Datos

### `calculateTotalPrice()`
**Significado:** Calcular el precio total.
1. Indica que realiza un cálculo.  
2. Se enfoca en un precio o valor monetario.  
3. Usa “total” para mostrar que suma varios valores.  
4. Es clara y específica.  
5. Útil para operaciones de compra o facturación.

---

### `formatUserInput()`
**Significado:** Formatear la entrada del usuario.
1. Indica que modifica o da formato a datos.  
2. “UserInput” deja claro que trabaja con lo que el usuario escribe.  
3. Sirve para limpiar o ajustar texto.  
4. Evita errores en validaciones.  
5. Mejora la consistencia de los datos ingresados.

---

### `validateEmailAddress()`
**Significado:** Validar la dirección de correo electrónico.
1. Comprueba si el email tiene formato correcto.  
2. “validate” indica que revisa o confirma algo.  
3. Evita datos erróneos en registros.  
4. Suele usarse antes de enviar formularios.  
5. Mejora la seguridad y calidad de datos.

---

### `convertToCamelCase()`
**Significado:** Convertir un texto a formato Camel Case.
1. Indica transformación de texto.  
2. “CamelCase” refiere al estilo de escritura en programación.  
3. Útil para limpiar nombres de variables.  
4. Mejora la uniformidad del código.  
5. Permite automatizar procesos de formato.

---

### `filterActiveUsers()`
**Significado:** Filtrar usuarios activos.
1. “filter” indica selección o filtrado.  
2. “ActiveUsers” muestra el criterio (usuarios activos).  
3. Permite separar datos según estado.  
4. Es clara y específica.  
5. Ideal para mostrar solo usuarios vigentes.

---

##  Eventos o Interacción

### `handleButtonClick()`
**Significado:** Manejar el clic de un botón.
1. “handle” indica que gestiona un evento.  
2. “ButtonClick” aclara cuál es el evento.  
3. Se usa en botones de formularios o interfaces.  
4. Facilita interacción con el usuario.  
5. Mejora la experiencia de uso (UX).

---

### `onFormSubmit()`
**Significado:** Al enviar el formulario.
1. “on” indica que ocurre cuando algo pasa.  
2. Se relaciona con el envío de formularios.  
3. Permite validar datos antes de enviar.  
4. Es intuitiva para otros programadores.  
5. Evita envíos incompletos o erróneos.

---

### `toggleDarkMode()`
**Significado:** Alternar el modo oscuro.
1. “toggle” indica cambiar entre dos estados.  
2. “DarkMode” especifica la función visual.  
3. Aporta personalización a la interfaz.  
4. Facilita accesibilidad visual.  
5. Es muy usada en páginas modernas.

---

### `updateProgressBar()`
**Significado:** Actualizar la barra de progreso.
1. “update” señala que cambia un valor existente.  
2. “ProgressBar” especifica el elemento.  
3. Indica visualmente el avance de una tarea.  
4. Se usa en cargas o procesos largos.  
5. Mejora la comunicación visual al usuario.

---

### `initializeApp()`
**Significado:** Inicializar la aplicación.
1. “initialize” significa comenzar o configurar.  
2. Suele ejecutarse al iniciar un programa.  
3. Prepara datos o configuraciones iniciales.  
4. Es esencial en cualquier proyecto.  
5. Suena natural y profesional en inglés.

---

##  Operaciones CRUD

### `createNewUser()`
**Significado:** Crear un nuevo usuario.
1. “create” indica creación de algo nuevo.  
2. “NewUser” aclara el tipo de dato.  
3. Pertenece a la parte de “Create” del CRUD.  
4. Suele guardar datos en una base.  
5. Es directa y fácil de entender.

---

### `fetchUserData()`
**Significado:** Obtener datos del usuario.
1. “fetch” significa traer o solicitar información.  
2. Indica lectura de datos (Read).  
3. Suele usar APIs o bases de datos.  
4. “UserData” aclara el tipo de información.  
5. Es descriptiva y moderna (fetch API).

---

### `updateUserProfile()`
**Significado:** Actualizar el perfil del usuario.
1. “update” indica modificación de datos.  
2. “UserProfile” especifica qué se actualiza.  
3. Representa la parte “Update” del CRUD.  
4. Es clara para otros desarrolladores.  
5. Mejora la precisión del sistema.

---

### `deleteUserAccount()`
**Significado:** Eliminar la cuenta del usuario.
1. “delete” es eliminar o borrar.  
2. Indica acción definitiva sobre un usuario.  
3. Representa la parte “Delete” del CRUD.  
4. Debe usarse con precaución.  
5. Es directa y profesional.

---

##  Utilidades

### `generateRandomId()`
**Significado:** Generar un identificador aleatorio.
1. “generate” indica creación automática.  
2. “RandomId” aclara que no se repite.  
3. Útil para asignar claves únicas.  
4. Se usa en bases o registros nuevos.  
5. Es una función de soporte general.

---

### `formatCurrency()`
**Significado:** Formatear moneda.
1. “format” indica aplicar estilo o formato.  
2. “Currency” se refiere a dinero.  
3. Permite mostrar montos correctamente ($, €).  
4. Mejora la presentación visual.  
5. Es útil en aplicaciones financieras.

---

### `debounceSearch()`
**Significado:** Controlar la frecuencia de búsqueda.
1. “debounce” limita la cantidad de ejecuciones.  
2. Mejora el rendimiento en búsquedas.  
3. Evita consultas innecesarias al escribir.  
4. Se usa en cuadros de búsqueda interactivos.  
5. Es técnica avanzada de optimización.

---

### `sanitizeInput()`
**Significado:** Limpiar la entrada del usuario.
1. “sanitize” significa eliminar datos peligrosos.  
2. Evita inyecciones o errores.  
3. Protege la seguridad del sistema.  
4. Se usa antes de guardar datos.  
5. Es fundamental en validaciones.

---

### `checkPermissions()`
**Significado:** Verificar permisos.
1. “check” indica revisar o confirmar.  
2. “Permissions” aclara el tipo de revisión.  
3. Controla accesos según roles o niveles.  
4. Refuerza la seguridad.  
5. Es clave en sistemas con usuarios múltiples.

---

##  Conclusión

Usar nombres **claros y descriptivos** en inglés permite:
- Código más fácil de leer y mantener.  
- Colaboración más efectiva entre desarrolladores.  
- Mayor productividad y organización en proyectos.

---
**Autores:** Masters Of Code  
**Materia:** Programación  
**Profesor:** Ariel Betancud  
