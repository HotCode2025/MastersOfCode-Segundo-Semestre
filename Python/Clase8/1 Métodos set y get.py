class Persona2:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalles(self):
        print(f'Loss datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property #decorador
    def nombre(self): #Metodo Getter
        print('Estamos usando el metodo get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre): #Metodo setter
        print('Estamos usando el metodo set')
        self._nombre = nombre

persona1 = Persona2('Ariel', 'Bentacud', 41)
print(persona1.nombre)#Llamamos al metodo getter