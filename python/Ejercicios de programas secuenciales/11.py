# Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

# Autor: Carlos Hidalgo Risco
import math

# Pido los dos numeros
numero_1 = float(input("Dime un número: "))
numero_2 = float(input("Dime otro número: "))

# Calaculo el mayor y menor
mayor = max(numero_1, numero_2)
menor = min(numero_1, numero_2)
    
# Calcula la diferencia y lo muestro
diferencia = mayor - menor
print ("La diferencia es:",diferencia)
