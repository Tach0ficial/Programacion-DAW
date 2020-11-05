# 14. Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.

# Hecho por Carlos Hidalgo Risco

# Pido un nuemro y invierto el numero cogiendo la primera y segunda cifra y dandole la vuelta
numero_1 = int(input("Introduce un número de 2 cifras: "))

numero= str(numero_1)
print("El numero inverdo de "+ str(numero_1) + " es " + numero[1] + numero[0])