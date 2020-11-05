"""
La política de cobro de una compañía telefónica es: cuando se realiza una llamada,
el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro,
los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos.

Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. 

Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

##############################################
------
Datos
------

primeros cinco minutos cuestan 1 euro
los siguientes tres, 80 céntimos
los siguientes dos minutos, 70 céntimos
y a partir del décimo minuto, 50 céntimos.
un impuesto de 3 % cuando es domingo

Otro dia 
--------
en turno de mañana, 15 %
en turno de tarde, 10 %
##############################################

Objetivo: determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: minutes,day,turn
"""
import os
os.system("cls")

minutes = int(input("Indica los minutos que duro la llamada: "))
day = input("Indica el día que realizó la llamada(minuscula): ")
if day != "domingo":
    turn = input(
        "Indica el turno en el que realizó la llamada(mañana/tarde): ")

if minutes <= 5:
    pay = 1
elif minutes >= 6 and minutes <= 8:
    pay = 1.80
elif minutes >= 9 and minutes <= 10:
    pay = 2.50
else:
    pay = 3

if day == "domingo":
    pay = pay*1.03
else:
    if turn == "mañana":
        pay = pay*1.15
    else:
        pay = pay*1.10


print(f"Esta persona tiene que pagar {round(pay,2)}€ ")
