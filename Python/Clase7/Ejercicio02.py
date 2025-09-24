class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad


# Pedir valores al usuario
print("Cálculo del volumen de un cubo:")

ancho = float(input("Ingrese el ancho: "))
alto = float(input("Ingrese el alto: "))
profundidad = float(input("Ingrese la profundidad: "))

# Crear objeto
cubo1 = Cubo(ancho, alto, profundidad)

# Mostrar resultado
print(f"\nEl volumen del cubo es: {cubo1.calcular_volumen()}")