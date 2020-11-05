# Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
# Autor: Carlos Hidalgo Risco


minutos = float(input("Dime los minutos: "))
hora = minutos // 60
mins =minutos % 60
print(hora, "horas", mins , "minutos")

