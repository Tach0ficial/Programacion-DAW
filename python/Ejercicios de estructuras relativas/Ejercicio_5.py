"""
Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el
superior lo tiene que volver a pedir.

A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las
siguientes informaciones:

- La suma de los números que están dentro del intervalo (intervalo abierto).
- Cuantos números están fuera del intervalo.
- Informa si hemos introducido algún número igual a los límites del intervalo.
##############################################


Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar:
"""
import os

os.system("cls")

limit_low = 1
limit_up = 0
suma = 0
num = 1
x = 0
array_num = []
while limit_low > limit_up:
    limit_low = int(input("Indica el limite inferior: "))
    limit_up = int(input("Indica el limite superior: "))
    if limit_low > limit_up:
        print("ERROR, El número inferior tiene que ser menor que el superior.\n")

while num != 0:
    num = int(input("Introduce un número: "))
    array_num[x] = num 
    x+=1

print(array_num)
for i in range(limit_low+1,limit_up):
    suma+=i
print(f"La suma de los números que están dentro del intervalo es {suma}.")