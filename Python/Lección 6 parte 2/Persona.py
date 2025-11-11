class Persona: #Creamos una clase

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):# self es igual a this
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni}{self.edad} la direccion es: {self.args}, los datos importantes son: {self.kwargs}')


persona1 = Persona('Rafael', 'Wayer',46233796, 20) # Necesitamos enviar argumentos
# print(persona1.nombre) #Tarea: Hacer el print igual que con el objeto 2
# print(persona1.apellido)
# print(persona1.edad)
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido}  su edad es: {persona1.edad}')
persona2 = Persona('Osvaldo', 'Giordanini', 46233797, 45)
print(f'El objeto de la clase persona: {persona2.nombre} {persona2.apellido}  Su edad es: {persona2.edad}')

persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

# los atributos son: caracteristicas
#los metodos son: el comportamiento que van a tener los objetos (acciones
persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

#Persona.mostrar_detalle(persona1) # debemos pasarle una referencia paraa el self o dará error
persona1.telefono = '44445555289'
print(f'este es el telefono de: {persona1.nombre} {persona1.telefono}') # hemos creado un atributo para un objeto

# print(persona2.telefono) # el objeto persona2 no tiene este atributo, da error
persona3 = Persona('Rogelio', 'Romero', 27127933,22, 'telefono', '2614445557', 'calle Lopéz', 823, 'Manzana', 77, 'casa', 18, altura=1.83, peso=105, CFavorito='azul', auto='Citroen', modelo=2021)
persona3.mostrar_detalle()
# print(persona3._dni) # esto no se debe utilizar (esta encapsulado), esto dice que lo desconocemos python
# persona3.__nombre # esta totalmente encapsulado