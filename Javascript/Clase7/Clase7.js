class Persona{  //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
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
    return this._nombre+' '+this._apellido;
}

toString() { //Regresa un String
    return this.nombreCompleto();
}

}

class Empleado extends Persona{ //Clase hija
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

let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
persona1.apellido = 'Alvarez';

let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);  
persona2.nombre = 'María Laura';
console.log(persona2.nombre); 

let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

console.log(empleado1.toString());
console.log(persona1.toString())