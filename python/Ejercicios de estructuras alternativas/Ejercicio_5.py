
"""
Crea un programa que lea la edad de dos personas y diga quién es más joven, la primera o la segunda. 
Ten en cuenta que ambas pueden tener la misma edad. En tal caso, hazlo saber con un mensaje adecuado.
    
##############################################
Algoritmo: Pedir la edad de dos personas y determinar cual es el mas joven.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 22/10/2020
Variables a usar: 
"""


import os
os.system("cls")

# Pide los datos
edad_1 = int(input("Indica la edad de la primera persona: "))
edad_2 = int(input("Indica la edad de la segunda persona: "))

# Calcular que persona es mas joven
if edad_1 < edad_2:
    print("La primera persona es mas joven.")
elif edad_2 < edad_1:
    print("La segunda persona es mas joven.")
else:
    print("Ambas personas tienen la misma edad.")


