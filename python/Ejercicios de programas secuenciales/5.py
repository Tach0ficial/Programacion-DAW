# Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
# Autor: Carlos Hidalgo Risco

# Pido los grados Fahrenheit
grados_f = float(input("Dime los grados Fahrenheit para pasarlos a grados Celsius: "))

# Pasa de grados Fahrenheit a grados Celsius
grados_c = (grados_f-32) / 1.8

print(grados_f,"Grados Fahrenheit son:",grados_c,"Grados Celsius")
