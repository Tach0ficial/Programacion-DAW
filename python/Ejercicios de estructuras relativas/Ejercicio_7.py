"""
Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 €
y así sucesivamente. Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará
después de los 20 meses.



##############################################


Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar: total, pay
"""
import os

os.system("cls")

pay = 10
total = 0

for i in range(20):
    print(f"El mes {i+1} tiene que pagar: {pay} euros")
    total += pay
    pay = pay * 2
print(f"El total a pagar es {total}")
