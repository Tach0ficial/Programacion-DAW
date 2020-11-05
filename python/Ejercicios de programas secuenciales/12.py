# 12. Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.

# Autor: Carlos Hidalgo Risco

# Pregunto los dos puntos
print("Introduce el primer par de numeros: ")
x1 = float(input("Primer número (x1): "))
y1 = float(input("segundo número (y1): "))

print("-"*20)

# Pregunto los dos puntos
print("Introduce el segundo par de numeros: ")
x2 = float(input("Primer número (x2): "))
y2 = float(input("segundo número (y2: "))

print("-"*20)

# Expongo los puntos dados y calculo la diferencia
print("Primer punto: ("+ str(x1) +" , "+ str(y1) +")")
print("Segundo punto: ("+ str(x2) + " , "+ str(y2) +")")

print("-"*20)

diferencia_x = x1 - x2
diferencia_y = y1 - y2
print("La diferencia entre ellos es: " + ("("+ str(abs( x1 - x2)) +" , "+ str(abs(y1 - y2)) +")"))
