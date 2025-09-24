class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura


# Crear 3 objetos pidiendo los datos al usuario
rectangulos = []
for i in range(3):
    print(f"\nRectángulo {i+1}:")
    base = float(input("Ingrese la base: "))
    altura = float(input("Ingrese la altura: "))
    rect = Rectangulo(base, altura)
    rectangulos.append(rect)

# Mostrar las áreas
print("\nÁreas de los rectángulos:")
for i, r in enumerate(rectangulos, start=1):
    print(f"Rectángulo {i}: área = {r.calcular_area()}")