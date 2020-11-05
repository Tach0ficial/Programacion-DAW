"""
Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.

##############################################


Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar: 
"""
import os

os.system("cls")

lista = []
ch = str(input("Introduce una cadena: "))

for i in ch:
    if i.isupper():
        i = i.lower()
        list.append(i)
    else:
        i = i.upper()
        list.append(i)