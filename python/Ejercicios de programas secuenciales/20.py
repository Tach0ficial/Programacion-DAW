# 20. Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) 
# después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).

# Hecho por Carlos Hidalgo Risco

e2 = float(input("Cuantos monedas de 2 euros tienes: "))
e1 = float(input("Cuantos monedas de 2 euros tienes: "))
c50 = float(input("Cuantos monedas de 50 céntimos tienes: "))
c20 = float(input("Cuantos monedas de 20 céntimos tienes: "))
c10 = float(input("Cuantos monedas de 10 céntimos tienes: "))

euros = (e2*2)+e1
print("euros:",euros)
centimos = (c50 * 50) + (c10 * 10) + (c20 * 20)
print("centimos:",centimos)

centimos_euros = '{:06.2f}'.format(centimos_euros)
centimos_euros_totales = centimos_euros / 100
print("centimos_euros:",centimos_euros)
centimos_totales = centimos - centimos_euro
total_euros = euros + centimos_euros

print("euros totales:",total_euros)
print("centimos totales:",centimos_totales)

