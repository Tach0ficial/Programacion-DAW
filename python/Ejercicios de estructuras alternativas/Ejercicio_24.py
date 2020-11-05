
"""
Diseña un programa que, dado un número real que debe representar la calificación numérica de un examen, 
proporcione la calificación cualitativa correspondiente al número dado. 
La calificación cualitativa será una de las siguientes: 
«Suspenso» (nota menor que 5),
«Aprobado» (nota mayor o igual que 5, pero menor que 7), 
«Notable» (nota mayor o igual que 7, pero menor que 9), 
«Sobresaliente» (nota mayor o igual que 9, pero menor que 10), 
«Matrícula de Honor» (nota 10).

##############################################
Algoritmo: Calcular la calificación sabiendo la nota.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 22/10/2020
Variables a usar: n1, n2, n3, n4, n5
"""


import os
os.system("cls")

# Pide los datos.
nota = float(input("Introduce la calificación del examen: "))

# Calcula la nota calificación del examen.
if nota < 5:
    print("Suspenso")
elif nota >= 5 and nota < 7:
    print("Aprobado")
elif nota >= 7 and nota < 9:
    print("Notable")
elif nota >= 9 and nota < 10:
    print("Sobresaliente")
elif nota == 10:
    print("Matrícula de Honor")
else:
    print("Nota no valida.")




