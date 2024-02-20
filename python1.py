#Crie um programa em Python que implementa uma função que retorna uma lista preenchida com valores inteiros aleatórios. 
#A função deve receber como parâmetro o tamanho da lista. O tamanho deve ser informado pelo usuário via input.
import random

tam = int(input("Digite qual será o tamanho da lista: "))
lista = []
for i in range(tam):
    num = random.randint(0, 100)
    lista.append(num)
    
print("Os números gerados foram: ", lista)

print("-------- Resultado --------")
for numero in lista:
    if numero % 3 == 0:
        print(numero, " - o número é Multiplo de 3")
    elif numero % 2 == 0:
        print(numero, " - o número é par")
    elif numero % 2 != 0:
        print(numero, " - o número é impar")



