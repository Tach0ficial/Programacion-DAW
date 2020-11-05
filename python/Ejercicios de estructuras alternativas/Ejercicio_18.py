"""
Realiza un programa que pida el día de la semana (del 1 al 7) 
y escriba el día correspondiente. Si introducimos otro número nos da un error.

##############################################

Analisis: Pedir un numero e indicar a que dia de la semana corresponde, si no estan comprendido entre 1 y 7 que te muestre un fallo.

##############################################
Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: day
"""
import os
os.system("cls")

# Pedimos datos.
day = int(input("Introduzca un número de la semana del 1 al 7: "))

# Cálculo del dia y hace la impresión.
if day == 1:
    print("El día que hay introducido es el lunes.")
elif day == 2:
    print("El día que hay introducido es el martes.")
elif day == 3:
    print("El día que hay introducido es el miércoles.")
elif day == 4:
    print("El día que hay introducido es el jueves.")
elif day == 5:
    print("El día que hay introducido es el viernes.")
elif day == 6:
    print("El día que hay introducido es el sábado.")
elif day == 7:
    print("El día que hay introducido es el domingo.")
else:
    print("ERROR: Número incorrecto.")
