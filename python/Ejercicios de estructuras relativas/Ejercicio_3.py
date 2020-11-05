"""
Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario,
el programa termina cuando se introduce un espacio.

##############################################
-
-
-
-

Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar: ch, vowels, consonats, 
"""
import os

os.system("cls")

ch = ""
vowels = 0
consonants = 0
while ch != " ":
    ch = input("Introduce un caracter:")
    ch = ch.upper()
    if ch in "AEIOUÁÉÍÓÚ":
        vowels += 1
    elif ch in "BCDFGHJKLMÑPQRSTVWXYZ":
        consonants += 1
    else:
        print("El caracter introducido no es ni consonante ni vocal.")
    print(vowels)
    print(consonants)
