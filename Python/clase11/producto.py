


class Producto:
    # Variable de clase
    contador_producto = 0

    def __init__(self, nombre, precio):
        Producto.contador_producto += 1
        self._id_producto = Producto.contador_producto  # asignación de variable de clase
        self._nombre = nombre
        self._precio = precio

    # Métodos getters y setters
    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, precio):
        self._precio = precio

    # Método __str__
    def __str__(self):
        return f'ID producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}'


# Bloque principal de ejecución
if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalón', 150.00)

    print(producto1)
    print(producto2)

