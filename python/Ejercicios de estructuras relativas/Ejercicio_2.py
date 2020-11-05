"""
Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

##############################################
-
-
-
-

Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar: nota,edad,sexo
"""
import os

os.system("cls")

times = int(input("Indica las veces que quieres que pida números: "))
greater = 0
less = 0
equal = 0
while times != 0:
    times = times - 1
    number = int(input("Indica un número:"))
    if number > 0:
        greater = greater + 1
    elif number < 0:
        less = less + 1
    else:
        equal = equal + 1
    print(f"Te quedan {times} intentos.\n")

print(f"Has introducido {greater} números mayores que 0.")
print(f"Has introducido {less} números menores que 0.")
print(f"Has introducido {equal} números iguales a 0.")
