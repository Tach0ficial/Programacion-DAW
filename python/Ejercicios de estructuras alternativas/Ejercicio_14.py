"""
La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, 
ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, 
considerando lo siguiente: si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1;
y 30 céntimos si es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
Realice un algoritmo para determinar la ganancia obtenida.

##############################################

Autor: Carlos Hidalgo Risco
Fecha: 16/10/2020
Variables a usar: price_kilo,kilo,type_uva,size_uva,final_price
"""
import os
os.system("cls")

# Pide los datos
price_kilo = float(input("Introduce el precio del kilo de la uva: "))
kilo = int(input("Indica los kilos que has vendido: "))
type_uva = input("Indica el tipo de uva: ")
size_uva = input("Indica el tamaño de la uva: ")

# Calcula la ganancia de las uvas segun su tamaño y tipo.
if type_uva =="A":
    if size_uva == "1":
        price_kilo = price_kilo + 20
    else:
        price_kilo = price_kilo + 30
else:
    if size_uva == "1":
        price_kilo = price_kilo - 30
    else:
        price_kilo = price_kilo - 50

final_price = price_kilo * kilo

print(f"La ganancia es {final_price/100} euros.") 







