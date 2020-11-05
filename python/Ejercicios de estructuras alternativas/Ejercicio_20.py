"""
Una compañía de transporte internacional tiene servicio en algunos países de 
América del Norte, América Central, América del Sur, Europa y Asia.
El costo por el servicio de transporte se basa en el peso del paquete y 
la zona a la que va dirigido. Lo anterior se muestra en la tabla:

1	América del Norte	24.00 euros
2	América Central	    20.00 euros
3	América del Sur	    21.00 euros
4	Europa	            10.00 euros
5	Asia	            18.00 euros

Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados,
esto por cuestiones de logística y de seguridad. Realice un algoritmo para determinar el cobro
por la entrega de un paquete o, en su caso, el rechazo de la entrega.

##############################################
------
objetivo
------

determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

##############################################
Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: kg
"""
import os
os.system("cls")

country = input("""Indica con el número del indici de pais es:

1   América del Norte   
2   América Central	    
3   América del Sur	    
4   Europa	            
5   Asia	            
>>> """)
kg = int(input("Indica cuanto pesa el paquete: "))

if kg <= 5:
    if kg == 1:
        print("El coste del envío es: 24.00 euros")
    elif kg == 2:
        print("El coste del envío es: 20.00 euros")
    elif kg == 3:
        print("El coste del envío es: 21.00 euros")
    elif kg == 4:
        print("El coste del envío es: 10.00 euros")
    else: 
        print("El coste del envío es: 18.00 euros")
else:
    print("El peso indicado no esta permitido por cuestiones de logística.")