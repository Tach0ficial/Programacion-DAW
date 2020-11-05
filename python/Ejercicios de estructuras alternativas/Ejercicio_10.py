"""
Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos circunferencias y las clasifique en uno de estos estados:

- exteriores
- tangentes exteriores
- secantes
- tangentes interiores
- interiores
- concéntricas

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 15/10/2020
Variables a usar: x1,y1,x2,y2,r1,r2,distancia
"""
import os
import math
os.system("cls")

# Pregunto los dos puntos x1 y y1
print("Introduce el primer par de numeros: ")
x1 = float(input("Primer número (x1): "))
y1 = float(input("segundo número (y1): "))
r1 = float(input("Indica su rádio (r1): "))

print("-"*20)

# Pregunto los dos puntos x2 y y2
print("Introduce el segundo par de numeros: ")
x2 = float(input("Primer número (x2): "))
y2 = float(input("segundo número (y2: "))
r2 = float(input("Indica su rádio (r2): "))

print("-"*20)

distancia = math.sqrt((x2-x1)**2 + (y2-y1)**2)
print(f"La diferencia entre los puntos es {distancia}")
print("-"*20)

# Comprueba si la distacia es mayor que la suma de los radios y si es asi, es una circunferencia exteriores.
if distancia > (r1 + r2):
    print("Circunferencias exteriores")

# Comprueba si la distacia es igual que la suma de los radios y si es asi, es una Circunferencias tangentes exteriores.
if distancia == (r1 + r2):
    print("Circunferencias tangentes exteriores")

# Comprueba si la distacia menor que la suma de los radios y mayor que su diferencia y si es asi, es una Circunferencias tangentes exteriores.
if distancia < (r1 + r2) and distancia > abs(r1-r2):
    print("Circunferencias secantes")


# Comprueba si la distacia es igual a la diferencia de los radios y si es asi, es una Circunferencias tangentes exteriores.
if distancia == abs(r1-r2):
    print("Circunferencias tangentes interiores")

# Comprueba si la distacia es mayor que 0 y menor que la diferencia de los radios y si es asi, es una circunferencia exteriores.
if distancia > 0 and distancia < abs(r1-r2):
    print("Circunferencias interiores")

    # Comprueba si la distacia es igual a 0 y si es asi, es una circunferencia exteriores.
if distancia == 0:
    print("Circunferencias concétricas")
