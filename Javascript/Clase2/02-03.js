//Array o arreglos
const autos = ['Ferrari', 'Renault', 'BW'];
console.log(autos); ['Ferrari', 'Renault', 'BW']

//elementos de un arreglo
console.log(autos[0]); Ferrari
console.log(autos[2]); BMW

for(let i = 0; i < autos.length; i ++){
    console.log(i+' : '+autos[i]);
}

autos[1] = 'Volvo';
console.log(autos[1]);

autos.push('Audi');
console.log(autos);

autos[autos.length]= 'Porche';
console.log(autos);

autos[6] = 'Renault';
console.log(autos);

console.log(Array.isArray(autos));

console.log(autos instanceof Array);