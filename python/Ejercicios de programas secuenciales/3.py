# Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
# Autor: Carlos Hidalgo Risco

# Importo el modulo de math para usar la función sqrt
import math 

# Pedimos los dato de los catetos pasandolos a float
cateto_1 = float(input("Dime el primer cateto: ")) 
cateto_2 = float(input("Dime el segundo cateto: ")) 

# Calcula la hipotenusa con la funcion math.sqrt()
hipotenusa = math.sqrt(cateto_1**2+cateto_2**2)

# Imprime el resultado de la hipotenusa
print("La hipotenusa es: ", hipotenusa ) 
