"""
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

##############################################


Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar: n1, n2, base
"""
import os

os.system("cls")

n1 = float(input("Introduce la base: "))
n2 = int(input("Introduce el exponente: "))
base = n1
for i in range(abs(n2)-1):
    n1 = n1 * base
print(f"El resultado de la potencia es: {n1}")
