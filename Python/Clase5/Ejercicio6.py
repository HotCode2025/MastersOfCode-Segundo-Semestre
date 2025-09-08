# Ejercicio 4: Calculadora de Impuestos

def calcular_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + (pago_sin_impuesto * (impuesto / 100))
    return pago_total

# Solicitar datos al usuario
pago_sin_impuesto = float(input("Ingrese el pago sin impuesto: "))
impuesto = float(input("Ingrese el porcentaje de impuesto (%): "))

# Calcular el pago con impuesto
pago_con_impuesto = calcular_pago(pago_sin_impuesto, impuesto)

print(f"Pago con impuesto: {pago_con_impuesto:.2f}")