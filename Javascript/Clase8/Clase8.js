class persona{  

static contadorPersona = 5;
//email = 'valro default mail';

static get MAX_OBJ(){
    return 5;
}

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(persona.contadorPersona < persona.MAX_OBJ){
         this.idpersona = ++persona.contadorPersona; 
        }
       else{
        console.log('Se ha superado el maximo de objetos permitidos');
       }
    }
    
    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){

    return this.idpersona+' ' + this._nombre+' '+this._apellido;
}

toString() { //Regresa un String
    return this.nombreCompleto();
}

static saludar() {
  console.log('Saludos desde este método static');
}

  static saludar2(persona){
    console.log(persona.nombre +' '+ persona.apellido);
  }
}


class Empleado extends persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }

nombreCompleto() {
    return super.nombreCompleto() + ', ' + this._departamento;
}
}

let persona1 = new persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
persona1.apellido = 'Alvarez';

let persona2 = new persona('Carlos', 'Lara');
console.log(persona2.nombre);   
persona2.nombre = 'María Laura';
console.log(persona2.nombre); 

let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

console.log(empleado1.toString());
console.log(persona1.toString())

persona.saludar();
persona.saludar2(persona2);

persona.saludar(); 
Empleado.saludar();
persona.saludar2(empleado1); 


 console.log(persona1.contadorObjetospersona); 
console.log(Empleado.contadorObjetospersona);
 console.log(persona1.email);
 console.log(persona1.email);
 console.log(persona1.email);

console.log(persona1.toString());   
console.log(persona2.toString());   
console.log(empleado1.toString());


console.log(persona.contadorPersona);

let persona3 = new persona('Carla', 'Pertosi');
console.log(persona3.toString());  
console.log(persona.contadorPersonas); 

console.log(persona.MAX_OBJ); 
console.log(persona.MAX_OBJ); 

let persona4 = new persona('Franco', 'Diaz');
console.log(persona4.toString()); 
let persona5 = new persona('Liliana', 'Paz');
console.log(persona5.toString()); 