"""
Escribe un programa que pida un número entero entre uno 
y doce e imprima el número de días que tiene el mes correspondiente.

##############################################
------
objetivo
------
Pedir un numero de la semana del 1 al 12 y que te diga cuantos dias tiene ese més.

##############################################
Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: day
"""
import os
os.system("cls")

day = int(input("Introduzca un número de la semana del 1 al 12: "))

if day >= 1 and day <= 12:
    if day == 1:
        print("Enero tiene 31 días.")
    elif day == 2:
        print("Febrero tiene 29 días.")
    elif day == 3:
        print("Marzo tiene 31 días.")
    elif day == 4:
        print("Abril tiene 30 días.")
    elif day == 5:
        print("Mayo tiene 31 días.")
    elif day == 6:
        print("Junio tiene 30 días.")
    elif day == 7:
        print("Julio tiene 31 días.")
    elif day == 8:
        print("Agosto tiene 31 días.")
    elif day == 9:
        print("Septiembre tiene 30 días.")
    elif day == 10:
        print("Octubre tiene 31 días.")
    elif day == 11:
        print("Noviembre tiene 30 días.")
    else:
        print("Diciembre tiene 31 días.")
else:
    print("ERROR: Número incorrecto.")

