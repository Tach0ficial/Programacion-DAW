# 19. Escribir un algoritmo para calcular la nota final de un estudiante, 
# considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1 
# y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.

# Hecho por Carlos Hidalgo Risco
respuesta = 1
suma = 0
while respuesta != 0:
    respuesta = int(input("Introsuce tus notas(Cuando termines introduce 0): "))
    suma = (suma + respuesta)

print("Tu resultado obtenido es: " + str(suma))