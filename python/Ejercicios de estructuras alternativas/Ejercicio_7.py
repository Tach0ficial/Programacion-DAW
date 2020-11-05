"""
Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:

- El exponente sea positivo, sólo tienes que imprimir la potencia.
- El exponente sea 0, el resultado es 1.
- El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

##############################################
Análisis: Pedimos la base y el exponente de 
##############################################

Autor: Carlos Hidalgo Risco
Fecha: 15/10/2020
Variables a usar: base,exponente 
"""
import os
os.system("cls")


print("Indica la base y el exponente para calcular la potencia.")
print("-"*20)

# Pide dos números.
base = int(input("Dime la base: "))
exponente = int(input("Dime el exponente: "))

# Calcula la potencia, comparando si el exponente es igual, mayor o menor que 0
if exponente > 0:
    print(f"El resultado es {base**exponente}")
elif exponente == 0:
    print("El resultado es 0")
else:
    print(f"El resultado es {1/(base**abs(exponente))}")
