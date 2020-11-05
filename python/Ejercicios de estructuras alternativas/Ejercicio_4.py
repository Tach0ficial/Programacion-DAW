
"""
Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 15/10/2020
Variables a usar: n1,n2
"""
import os
os.system("cls")

# Pide los 2 números.
print("Pide los 2 números y si el segundo nuemro es 0, lo hace la división.")
print("-"*20)
n1 = float(input("Dime el primer número: "))   
n2 = float(input("Dime el segundo número: "))  

# Calcula la division de n1 y n2 si n2 es diferente a 0.
if n2 != 0:
    print(f"La división de {n1} y {n2} es {n1/n2}")
else:
    print("No puedo hacer la división porque el segundo número es 0.")



