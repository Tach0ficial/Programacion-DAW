"""
Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el mensaje ‘ACEPTADA’ si la nota es mayor
o igual a cinco, la edad es mayor o igual a dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo
sea ‘M’, debe imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 15/10/2020
Variables a usar: nota,edad,sexo
"""
import os

os.system("cls")

print("Indica la base y el exponente para calcular la potencia.")
print("-" * 20)

# Pide dos números y el sexo en cadena.
nota = int(input("Dime tu nota: "))
edad = int(input("Dime tu edad: "))
sexo = input("Dime tu sexo(F o M): ")

# Calcula si es Acepada, posible o no aceptada.
if nota >= 5 and edad >= 18 and sexo == "F":
    print("-" * 20)
    print("ACEPTADA")
elif nota >= 5 and edad >= 18 and sexo == "M":
    print("-" * 20)
    print("POSIBLE")
else:
    print("-" * 20)
    print("NO ACEPTADA")
