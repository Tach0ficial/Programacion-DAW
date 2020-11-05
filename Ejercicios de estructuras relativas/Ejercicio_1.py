"""
Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100.
A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
a demás de los intentos que te quedan (tienes 10 intentos para acertarlo).
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado),
si se llega al limite de intentos te muestra el número que había generado.

Para usar números aleatorios en Python: http://www.mclibre.org/consultar/python/lecciones/python-biblioteca-random.html

##############################################
-generar un numero aleatorio
-pide numeros y dice si es mayor o menor al numero generado.
-tiene 10 intentos
-Muestra con los intentos que has acertado el número

Autor: Carlos Hidalgo Risco
Fecha: 28/10/2020
Variables a usar: nota,edad,sexo
"""
import os
import random

os.system("cls")

random_number = random.randint(1, 100)
trys = 10
while trys != 0:
    trys = trys - 1
    try_n = int(input("Adivina el número:"))
    if try_n == random_number:
        print(f"Has acertado el número con {abs(trys - 10)} intentos")
        break
    else:
        if trys != 0:
            if try_n > random_number:
                print(f"El número que tienes que adivinar es menor que el número: {try_n} \nTe quedan {trys} intentos.\n")
            else:
                print(f"El número que tienes que adivinar es mayor que el número: {try_n} \nTe quedan {trys} intentos.\n")
        else:
            print("\nHas gastado los 10 intentos.")
