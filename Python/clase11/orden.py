from producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self._id_orden = Orden.contador_ordenes
        self._productos = list(productos)  # Aseguramos que siempre sea una lista

    def agregar_producto(self, producto):
        # Agregar un nuevo producto a la lista
        self._productos.append(producto)

    def calcular_total(self):
        total = 0
        for producto in self._productos:
            total += producto.precio
        return total  # <-- return fuera del for

    def __str__(self):
        producto_str = ''
        for producto in self._productos:
            producto_str += producto.__str__() + ' | '
        return f'Orden: {self._id_orden}\nProductos: {producto_str}\nTotal: {self.calcular_total()}'


if __name__ == '__main__':
    producto1 = Producto('Camiseta', 100.00)
    producto2 = Producto('Pantalón', 150.00)
    productos = [producto1, producto2]

    orden1 = Orden(productos)
    print(orden1)
    orden2 = Orden(productos)
    print(orden2)



