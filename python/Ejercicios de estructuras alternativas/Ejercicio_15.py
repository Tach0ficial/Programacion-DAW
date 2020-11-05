"""
El director de una escuela está organizando un viaje de estudios, 
y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.

La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de 65 euros; 
de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, 
el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 

Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

##############################################
------
Datos
------
cuánto debe cobrar a cada alumno
cuánto debe pagar a la compañía de viajes
100 alumnos o más, el costo por cada alumno es de 65 euros
50 a 99 alumnos, el costo es de 70 euros
30 a 49, de 95 euros, y si son menos de 30
el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 

##############################################

Objetivo: determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: alumnos,price_alumno
"""
import os
os.system("cls")

# Pide los datos
alumnos = int(input("Cuantos alumnos van al viaje: "))

print("-"*20)

# Calcula el precio que tiene que pagar coda alumno y lo que se le tiene que pagar a la compañia de autobuses.
if alumnos >= 100 : 
    price_alumno = 65
elif alumnos >= 50 and alumnos <= 99:
    price_alumno = 70
elif alumnos >= 30 and alumnos <= 49:
    price_alumno = 95
else:
    price_alumno = f"{4000/alumnos:.2f}" 

print(f"El precio que tiene que pagar cada alumno es de: {price_alumno}€")

print("El precio que tiene que pagar a la compañía de autobuses es de: 4000€")



    





