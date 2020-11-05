# 10. Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
# * 55% del promedio de sus tres calificaciones parciales.
# * 30% de la calificación del examen final.
# * 15% de la calificación de un trabajo final.

# Autor: Carlos Hidalgo Risco

# Pedimos las 3 calificación.
calificacion_1 = float(input("Primera calificación parcial: "))
calificacion_2 = float(input("Segunda calificación parcial: "))
calificacion_3 = float(input("Tercera calificación parcial: "))

#Calculamos el promedio de las calificaciones y hacemos el 55%.
promedio_calificaciones = ((calificacion_1 + calificacion_2 + calificacion_3) / 3) * 0.55

# Pedimos la nota del examen final y calculamos el 30%.
examen_final = float(input("Nota del examen final: ")) * 0.30

# Pedimos la nota del trabajo final y calculamos el 15%.
trabajo_final = float(input("Nota del trabajo final: ")) * 0.15

# Calculamos la nota final.
nota_final = promedio_calificaciones + examen_final + trabajo_final 

# Mostramos los resultados.
print("El promedio de tus tres calificaciones parciales es:",promedio_calificaciones)
print("Tu calificación del examen final :",examen_final)
print("Tu calificación de un trabajo final es:",trabajo_final)

print("Tu nota final del curso es:",nota_final)
