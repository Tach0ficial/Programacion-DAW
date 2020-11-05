"""
Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.

##############################################


Autor: Carlos Hidalgo Risco
Fecha: 29/10/2020
Variables a usar: ch
"""
import os

os.system("cls")

ch = str(input("Introduce una cadena: "))

for i in ch:
    if i.isupper():
        i = i.lower()
        print(i)
    else:
        i = i.upper()
        print(i)

