"""
Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. 
El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:

- Si se cumple Pitágoras entonces es triángulo rectángulo
- Si sólo dos lados del triángulo son iguales entonces es isósceles.
- Si los 3 lados son iguales entonces es equilátero.
- Si no se cumple ninguna de las condiciones anteriores, es escaleno.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: A,B,C
"""
import os
os.system("cls")
    
    # Pide los datos
print("Introduce los tres lados: ")
A = float(input("Indica el lado A: "))
B = float(input("Indica el lado B: "))
C = float(input("Indica el lado C: "))

print("-"*20)

 
if A**2 + B**2 == C**2 or B**2 + C**2 == A**2 or C**2 + A**2 == B**2: #Si se cumple Pitágoras entonces es triángulo rectángulo
    print("Triángulo rectángulo")

if (A==B or A==C or B==C) and (A!=B or A!=C or B!=C): # Si sólo dos lados del triángulo son iguales entonces es isósceles.
    print("Triángulo isósceles")
elif A==B and B==C : # Si los 3 lados son iguales entonces es equilátero.
    print("Triángulo equilátero")
else: # Si no se cumple ninguna de las condiciones anteriores, es escaleno.
    print("Triángulo escaleno")










