"""
Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.


##############################################


Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar: initial, final, i
"""
import os

os.system("cls")

inittial = int(input("Indica el numero inicial: "))
final = int(input("Indica el numero final: "))
for i in range(inittial + 1, final):
    if i % 2 == 0:
        print(f"El número {i} es par")
