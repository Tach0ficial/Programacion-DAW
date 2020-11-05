
"""
Realiza un programa que pida cinco números enteros y diga cuál es el mayor.
    
##############################################
Algoritmo: calcula el mayor de 5 números

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 22/10/2020
Variables a usar: n1, n2, n3, n4, n5
"""


import os
os.system("cls")

# Pide los datos.
n1 = int(input("Indica un número: "))
n2 = int(input("Indica un número: "))
n3 = int(input("Indica un número: "))
n4 = int(input("Indica un número: "))
n5 = int(input("Indica un número: "))

# Calcula el número mayor.
if n1>n2 and n1>n3 and n1>n4 and n1>n5:
    print(f"El primer número ({n1}) es el mayor.")
elif n2>n1 and n2>n3 and n2>n4 and n2>n5:
    print(f"El segundo número ({n2}) es el mayor.")
elif n3>n1 and n3>n2 and n3>n4 and n3>n5:
    print(f"El tercer número ({n2}) es el mayor.")
elif n4>n1 and n4>n2 and n4>n3 and n4>n5:
    print(f"El cuarto número ({n2}) es el mayor.")
elif n5>n1 and n5>n2 and n5>n3 and n5>n4:
    print(f"El quinto número ({n5}) es el mayor.")
else:
    print("ERROR")
