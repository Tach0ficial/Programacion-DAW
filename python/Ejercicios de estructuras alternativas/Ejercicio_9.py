"""
Diseña un programa que lea un carácter de teclado y muestre por pantalla el mensaje «Es signo de puntuación» solo si el
carácter leído es un signo de puntuación, «Es una letra» si es una letra (da igual que sea mayúscula,
minúscula o acentuada), «Es un dígito» si es un dígito, «Es otro carácter» si no es ninguno de los anteriores y
«No es un carácter» si el usuario ha introducido más de un carácter.

Pista: quizás te pueda venir bien usar el método find de la clase str.
##############################################
Algoritmo:
-no es un caracter
-es una letra
-es otro caracter
-es un digito
-es un signo de puntuación

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 22/10/2020
Variables a usar: persona_1, persona_2
"""

import os

os.system("cls")

# Pide los datos.
caracter = input("Indíca un caracter: ")

# Comprobamos si es un caracter y su tipologia
if len(caracter) == 1:
    if
else:
print("No es un caracter.")