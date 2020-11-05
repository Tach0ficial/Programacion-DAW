
"""
Realiza un programa que pida tres números enteros y diga cuál es el mayor.
    
##############################################
Algoritmo: calcula el mayor de 3 números

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 22/10/2020
Variables a usar: n1, n2, n3
"""


import os
os.system("cls")

# Pide los datos.
n1 = int(input("Indica un número: "))
n2 = int(input("Indica un número: "))
n3 = int(input("Indica un número: "))

# Calcula el número mayor.
if n1>n2 and n1>n3:
    print(f"El primer número ({n1}) es el mayor.")
elif n2>n1 and n2>n3:
    print(f"El segundo número ({n2}) es el mayor.")
elif n3>n1 and n3>n2:
    print(f"El tercer número ({n3}) es el mayor.")
else:
    print("ERROR")
