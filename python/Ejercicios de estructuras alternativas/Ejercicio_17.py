"""
Realiza un programa que pida por teclado el resultado (dato entero)
obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena)
de la cara opuesta al resultado obtenido.

- Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
- Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.
Ejemplo:

```
Introduzca número del dado: 5
En la cara opuesta está el "dos".
```
##############################################
------
objetivo
------
Pide un numero por pantalla y determina el numero en cadena del opuesto en un dado.

Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: n_dado
"""
import os
os.system("cls")

n_dado = int(input("Introduzca número del dado: "))


if n_dado >= 1 and n_dado <= 6:
    if n_dado == 1:
        print("En la cara opuesta está el seis.")
    elif n_dado == 2:
        print("En la cara opuesta está el cinco.")
    elif n_dado == 3:
        print("En la cara opuesta está el cuatro.")
    elif n_dado == 4:
        print("En la cara opuesta está el tres.")
    elif n_dado == 5:
        print("En la cara opuesta está el dos.")
    else:
        print("En la cara opuesta está el uno")
else:
    print("ERROR: Número incorrecto.")