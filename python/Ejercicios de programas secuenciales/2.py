"""
Programa Ej01Saludar.py

Proposito: Calcular el perímetro y área de un rectángulo dada su base y su altura.

Autor: Carlos Hidalgo Risco

Analisis: Tenemos que leer la base y la altura para calcular el area y el perimetro.

Variables a usar:
*base(float)
*altura(float)
*perimetro(float)
*area(float)

Algoritmo:
1. Leer el nombre
2. Escribir mensaje de saludo

"""

# Pido el dato de la base y la altura
base = float(input("Dime la base: "))   
altura = float(input("Dime la altura: "))

# Calculo el perimetro y area             
perimetro = 2 * (base + altura)
area = base * altura

# Imprimo el perimetro y area del triangulo rectangulo                             
print("El perimetro del rectángulo es : ", perimetro)
print("El area del rectángulo es : ", area)
