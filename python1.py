#Crie um programa em Python que implementa uma função que retorna uma lista preenchida com valores inteiros aleatórios.
#Para cada número da lista, imprima:
#1- Se o número é múltiplo de 3
#2- Se o número é par
#3- Se o número é ímpar
import random

tam = int(input("Digite qual será o tamanho da lista: "))
lista = []
def criarlista(tam):
    for i in range(tam):
        lista.append(random.randint(1, 100))
    
    return lista

lista = criarlista(tam)
print("Os números gerados foram: ", lista)

print("-------- Resultado --------")
for numero in lista:
    if numero % 3 == 0:
        print(numero, " - o número é Multiplo de 3")
    elif numero % 2 == 0:
        print(numero, " - o número é par")
    elif numero % 2 != 0:
        print(numero, " - o número é impar")
