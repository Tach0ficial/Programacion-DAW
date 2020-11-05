"""
Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter
en la cadena por el segundo carácter.


##############################################


Autor: Carlos Hidalgo Risco
Fecha: 29/10/2020
Variables a usar: ch
"""
import os

os.system("cls")

ch = str(input("Introduce una cadena: "))

x = ch.replace(ch[0], ch[1])

print(x)
