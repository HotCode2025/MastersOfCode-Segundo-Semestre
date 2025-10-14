class Persona2:
    def __init__(self, nombre, apellido, edad):  
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property  
    def nombre(self):  
        print('Estamos utilizando el metodo get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  
        print('Estamos utilizando el metodo set')
        self._nombre = nombre
    @property
    def apellido(self):
         return self._apellido
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad
    
    def __del__(self):
        print(f'Persona eliminada: {self._nombre} {self._apellido} {self._edad}')


if __name__ == '__main__':
    persona1 = Persona2('Ariel', 'Bentancud', 41)
    print(persona1.nombre)  
    persona1.nombre = 'Juan Pedro'  
    print(persona1.nombre)  
    persona1.mostrar_detalles()  
    print(persona1.edad)

    # Tarea: crear tres objetos mas, utilizando los metodos getter and setter
    # para modificar y mostrar los cambios con el metodo mostrar detalles

    # 1
    persona2 = Persona2('piter', 'Alonso', 27)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Piter'
    persona2.apellido = 'Alonso'
    persona2.edad = 28
    persona2.mostrar_detalles()

    # 2
    persona3 = Persona2('Florencia', 'Romero', 23)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Florencia'
    persona3.apellido = 'Romery'
    persona3.edad = 31
    persona3.mostrar_detalles()

    # 3
    persona4 = Persona2('Alberto', 'Gonzalez', 21)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Alberto'
    persona4.apellido = 'Gonzalez'
    persona4.edad = 29
    persona4.mostrar_detalles()
