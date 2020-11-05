# Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, 
# el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones 
# por las tres ventas que realiza en el mes y el total que recibirá en el mes 
# tomando en cuenta su sueldo base y comisiones.

# Autor: Carlos Hidalgo Risco

# Pedimos el sueldo base y las ventas que hizo.
sueldo_base = float(input("Dime tu sueldo base: "))
ventas = float(input("Valor de las ventas: "))

# Calcula el 10 % de las ventas.
diez_porciento = ventas * 0.10

# Calcula el total
total = sueldo_base + diez_porciento

# Imprime lo que se gano con las ventas y el total de lo que gano.
print("El total al final de mes es:",diez_porciento)
print("El total al final de mes es:",total)
