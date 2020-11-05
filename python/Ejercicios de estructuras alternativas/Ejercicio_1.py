"""
Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 15/10/2020
Variables a usar: n1,n2
"""


import os
os.system("cls")

# Pide los 2 números.
print("Introduce 2 números para calcular cual es menor y cual mayor.")
print("-"*20)
n1 = float(input("Dime el primer número: "))   
n2 = float(input("Dime el segundo número: "))  

# Comprueba cual es el mayor y lo imprime.
if n1 > n2:
    print(f"El número {n1} es mayor que {n2}")
else:
    print(f"El número {n1} no es mayor que {n2}")
    