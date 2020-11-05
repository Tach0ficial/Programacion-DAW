# 15. Dadas dos variables numéricas A y B, que el usuario debe teclear, 
# se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.

# Hecho por Carlos Hidalgo Risco

# Pido 2 numeros e invierto el valor de ellos creando una nueva variable para intercambiar los valores.
A = int(input("Introduce un número(A): "))
B = int(input("Introduce otro número(B): "))

C = 0
C = A
A = B
B = C
print("El valor de A es:", A ,"y el de B es:", B)