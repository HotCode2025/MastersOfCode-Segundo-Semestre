from orden import Orden
from producto import Producto

producto1 = Producto('Camiseta', 100.00)
producto2 = Producto('Pantalón', 150.00)
producto4 = Producto('blusa', 100.00)
producto5 = Producto('lentes', 150.00)
producto6 = Producto('campera', 200.00)
productos = [producto1, producto2]

orden1 = Orden(productos)
orden1.agregar_producto(producto4)
orden1.agregar_producto(producto5)
print(orden1)
print(f'total de la orden1: {orden1.calcular_total()}')
productos2 = [producto4, producto4]

orden2 = Orden(productos2)
print(f'total de la orden2: {orden2.calcular_total()}')
print(orden2)