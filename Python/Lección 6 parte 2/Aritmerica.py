class Aritmerica:
    """
    el nombre de este tipo ded comentario es: DocString
    esto es documentaacion ded la claase en ppython
    vamos aa hacer en esta clase aalgunas operaciones de: suma, resta, multiplicacion y mas
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # metodo para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    def restar(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB


aritmerica1 = Aritmerica(7,9) # le pasamos los argumentos para los operandos
print(f'la suma de los números es: {aritmerica1.sumar()}')
print(f'la resta de los números es: {aritmerica1.restar()}')
print(f'la multiplicación de los números es: {aritmerica1.multiplicar()}')
print(f'la division de los números es: {aritmerica1.dividir():.2f}')
