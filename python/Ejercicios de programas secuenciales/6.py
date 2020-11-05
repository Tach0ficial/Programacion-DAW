# Calcular la media de tres números pedidos por teclado.
# Autor: Carlos Hidalgo Risco

# Pido los tres numeros.
numero_1 = float(input("Dime un número: "))
numero_2 = float(input("Dime otro número: "))
numero_3 = float(input("Dime otro número: "))

# Calculo la media
media = (numero_1 + numero_2 + numero_3) / 3

# Imprime el resultado
print("La media de :", numero_1,",",numero_2,"y",numero_3,"es: ", media)