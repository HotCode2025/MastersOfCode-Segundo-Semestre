miFuncion(8, 2); // Esto se le conoce como hoisting

function miFuncion(a, b) {
  //console.log("Sumamos: " + (a + b)); 
  return a + b;
}

//Llamando la función
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

let x = function(a, b){return a + b};
resultado = x(5,6);
console.log(resultado);

(function(a, b){
    console.log('Ejecutando la funcion: ' + (a + b));
})(0, 6);

console.log(typeof miFuncion);  

function miFuncionDos(a, b) {
  console.log(arguments.length); 
}

miFuncionDos(5, 7, 3, 6);

var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); 
console.log(resultado); 

let sumar = function(a = 4, b = 8) {
  console.log(arguments[0]); 
  console.log(arguments[1]); 
  return a + b + arguments[2];
}

resultado = sumar(3, 2, 9);
console.log(resultado); 


let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta); // 41

function sumarTodo() {
  let suma = 0;
  for (let i = 0; i < arguments.length; i++) {
    suma += arguments[i]; 
  }
  return suma;
}
let k = 10;
function cambiarValor(a) {
  a = 20;
}

cambiarValor(k);
console.log(k);

const persona = {
  nombre: 'Juan',
  apellido: 'Lopez'
}

console.log(persona); 

function cambiarValorObjeto(p1) {
  p1.nombre = 'Ignacio';
  p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona); 