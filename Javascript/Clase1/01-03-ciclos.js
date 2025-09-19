
let contador = 0;
while(contador < 3){
console.log(contador); 0 , 1 , 2
contador++;

}
console.log("fin del ciclo while");

let conteo = 0;
do{
console.log(conteo); 0, 1, 2
conteo++;
}while(conteo < 3);
console.log("fin del ciclo do while");

for(let contado = 0; contado < 3; contado++){
    console.log(contado); 0, 1, 2
}
console.log("Fin del ciclo for");

for(let contado = 0; contado <= 10; contado++){
if(contado % 2 == 0){
console.log(contado); 0
break;
  }
}
console.log("Termina el ciclo al encontrar el primero numero par");

inicio:
for(let contado = 0; contado <= 10; contado++){
if(contado % 2 !== 0){
break inicio;
}
console.log(contado); 0
  
}
console.log("Termina el ciclo");