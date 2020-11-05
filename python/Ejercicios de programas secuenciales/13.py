# 13. Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. 
# Python no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿cómo se puede calcular?

# Hecho por Carlos Hidalgo Risco

# Pido un numero y calculo la raiz cuadrada y cúbica
numero_1 = float(input("Introduce un número: "))

print("La raiz cuadrada de " + str(numero_1) +" es "+ str(numero_1**.5))
print("La raiz cúbica de " + str(numero_1) +" es "+ str(numero_1**(1. / 3.)))
