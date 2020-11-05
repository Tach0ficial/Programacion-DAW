
"""
Diseña un programa que, dados cinco números enteros, determine cuál de los cuatro últimos números es más cercano al primero. 
Por ejemplo, si el usuario introduce los números 2, 6, 4, 1 y 10, el programa responderá que el número más cercano al 2 es el 1.


    
##############################################
Algoritmo: Calcular la diferencia con el primer numero y comprobar cual es el menor.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 22/10/2020
Variables a usar: n1, n2, n3, n4, n5, dif_n2, dif_n3, dif_n4, dif_n5
"""


import os
os.system("cls")

# Pide los datos.
n1 = int(input("Indica un número: "))
n2 = int(input("Indica un número: "))
n3 = int(input("Indica un número: "))
n4 = int(input("Indica un número: "))
n5 = int(input("Indica un número: "))

# Calcula la diferencia que tiene cada numero respecto a n1.
dif_n2 = abs(n1-n2)
dif_n3 = abs(n1-n3)
dif_n4 = abs(n1-n4)
dif_n5 = abs(n1-n5)

# Calcula que numero es mas cercano.
if dif_n2<dif_n3 and dif_n2<dif_n4 and dif_n2<dif_n5:
    print(f"El numero mas cercano al primero es el {n2}")
elif dif_n3<dif_n2 and dif_n3<dif_n4 and dif_n3<dif_n5:
    print(f"El numero mas cercano al primero es el {n3}")
elif dif_n4<dif_n2 and dif_n4<dif_n3 and dif_n4<dif_n5:
    print(f"El numero mas cercano al primero es el {n4}")
elif dif_n5<dif_n2 and dif_n5<dif_n3 and dif_n5<dif_n4:
    print(f"El numero mas cercano al primero es el {n5}")
else:
    print("ERROR")