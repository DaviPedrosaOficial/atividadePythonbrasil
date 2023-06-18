"""Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a) o produto do dobro do primeiro com metade do segundo .
b) a soma do triplo do primeiro com o terceiro.
c) o terceiro elevado ao cubo."""

numeroInteiro1 = int(input("Informe um numero inteiro: "))

numeroInteiro2 = int(input("Agora, informe um segundo numero inteiro: "))

numeroReal = float(input("E para finalizar, informe um numero real: "))

a = (numeroInteiro1 * 2) * (numeroInteiro2 / 2)

b = (numeroInteiro1 * 3) + numeroReal

c = numeroReal ** 3

print(f"\nEntão vamos lá para os resultados!\nPara os numeros responderemos aos seguintes exercícios: ")

print(f"\na) O produto do dobro do primeiro numero ('{numeroInteiro1}') com metade do segundo ('{numeroInteiro2}'), que é = {a}")
print(f"b) A soma do triplo do primeiro ('{numeroInteiro1}') com o terceiro ('{numeroReal}'), que é = {b}")
print(f"c) O terceiro ('{numeroReal}') elevado ao cubo, que é = {c}")
