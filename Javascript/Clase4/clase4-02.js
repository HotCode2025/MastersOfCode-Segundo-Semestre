let x = 10; 
console.log(x.length);

let persona = {
  nombre: 'Carlos',
  apellido: 'Gil',
  email: 'cgil@gmail.com',
  edad: 30,
  nombreCompleto: function(){
    return this.nombre+ ' '+this.apellido;
  }
}

console.log(persona.nombre); 
console.log(persona.apellido); 
console.log(persona.email); 
console.log(persona.edad); 
console.log(persona); 
console.log(persona.nombre);
console.log(persona.nombreCompleto());

let persona2 = new Object();
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '5492618282821';
console.log(persona2.telefono); 

console.log(persona['apellido']); 

//for in
for(propiedad in persona){
    console.log(propiedad); 
    console.log(persona[propiedad]); 
}
console.log('arreglamos un error');
persona.apellido = 'Betancud'; 
delete persona.apellido; 
console.log(persona); 


console.log('Distinta formas de imprimir un objeto: forma 1');
console.log(persona.nombre + ', ' + persona.apellido); 

console.log('Distinta formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]); 
}


console.log('Distinta formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

console.log('Distinta formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString); 