"""
Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 15/10/2020
Variables a usar: cadena
"""
import os
os.system("cls")

# Pide una cadena.
cadena = str(input("Dime una cadena: "))
print("-"*20)

# Calcula si es minúscula y mayúscula.
if cadena == cadena.upper():
    print(f"La letra {cadena} es mayúscula.")
else:
    print(f"La letra {cadena} es minúscula.")
    
    
    
