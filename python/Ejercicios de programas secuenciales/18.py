# 18. Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

# Hecho por Carlos Hidalgo Risco

# Pido el nombre y los apellidos
nombre = str(input("Escribe tu nombre: "))
apellido1 = str(input("Escribe tu primer apellido: "))
apellido2 = str(input("Escribe tu segundo apellido: "))

print("-"*20)

# Extraigo la primera letra de cada variable. 
print("Las iniciales son: "+nombre[0]+apellido1[0]+apellido2[0])