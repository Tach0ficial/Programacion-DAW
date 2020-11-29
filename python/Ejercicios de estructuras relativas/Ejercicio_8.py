"""
Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

Para hacer una espera en Python podemos usar el método sleep del módulo time.



##############################################


Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar:
"""
import os

os.system("cls")

horas = 0
minutos = 0
segundos = 0

segundos += 1

if segundos == 60:
    segundos = 0
    minutos += 1
    if minutos == 60:
        minutos = 0
        horas += 1

#ponemos el curso a la derecha
print(8 * "\b", end="")
