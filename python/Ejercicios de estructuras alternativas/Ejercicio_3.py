"""
Escribe un programa que lea un número e indique si es par o impar.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 15/10/2020
Variables a usar: n1
"""
import os
os.system("cls")

# Pide los datos
print("Introduce un números para calcular si es par o impar.")
print("-"*20)
n1 = int(input("Dime el primer número: "))


# Calcula si el numero introducido es par o impar.
if n1 % 2 == 0:
    print(f"El número {n1} es par.")
else:
    print(f"El número {n1} es impar.")
