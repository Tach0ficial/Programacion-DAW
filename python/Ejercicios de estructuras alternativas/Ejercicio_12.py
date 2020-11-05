"""
Escribir un programa que lea un año indicar si es bisiesto. 
Nota: un año es bisiesto si es un número divisible por 4, 
pero no si es divisible por 100, excepto que también sea divisible por 400.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: year
"""
import os
os.system("cls")

# Pide los datos
year = int(input("Indica el año: "))

# Cacula si el año indicado es bisiesto o no.
if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
    print(f"El año {year} es bisiesto.")
else:
    print(f"El año {year} no es bisiesto.")