
"""
Escribir un programa que que calcule el desglose mínimo en billetes y monedas de una cantidad exacta de euros.
Hay billetes de 500, 200, 100, 50, 20, 10 y 5€ y monedas de 2 y 1€.
    
##############################################
Algoritmo: Calcula el desglose mínimo de billetes y monedas de una cantidad exacta de dinero.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 22/10/2020
Variables a usar: dinero, billetes_500, billetes_200, billetes_100, billetes_50, billetes_20, billetes_10, monedas_2, monedas_1, 
resto_500, resto_200, resto_100, resto_50, resto_20, resto_10, resto_2, resto_1.
"""


import os
os.system("cls")

# Pide los datos.
dinero = int(input("Ingrese la cantidad de dinero a desglosar: "))

# Calcula la cantidad mínima de billetes de 500€
if dinero >= 500:
    billetes_500 = dinero // 500
    print(f"Quedan {billetes_500} billetes de 500€.")

# Calcula la cantidad mínima de billetes de 200€
if dinero >= 200:
    billetes_200 = dinero // 200
    print(f"Quedan {billetes_200} billetes de 200€.")

# Calcula la cantidad mínima de billetes de 100€
if dinero >= 100:
    billetes_100 = dinero // 100
    print(f"Quedan {billetes_100} billetes de 100€.")

# Calcula la cantidad mínima de billetes de 50€
if dinero >= 50:
    billetes_50 = dinero // 50
    print(f"Quedan {billetes_50} billetes de 50€.")

# Calcula la cantidad mínima de billetes de 20€
if dinero >= 20:
    billetes_20 = dinero // 20
    print(f"Quedan {billetes_20} billetes de 20€.")

# Calcula la cantidad mínima de billetes de 10€
if dinero >= 10:
    billetes_10 = dinero // 10
    print(f"Quedan {billetes_10} billetes de 10€.")

# Calcula la cantidad mínima de billetes de 5€
if dinero >= 5:
    billetes_5 = dinero // 5
    print(f"Quedan {billetes_5} billetes de 5€.")

# Calcula la cantidad mínima de monedas de 2€
if dinero >= 2:
    monedas_2 = dinero // 2
    print(f"Quedan {monedas_2} monedas de 2€.")

# Calcula la cantidad mínima de monedas de 1€
if dinero >= 1:
    monedas_1 = dinero // 1
    print(f"Quedan {monedas_1} monedas de 1€.")



    

