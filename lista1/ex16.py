import math
"""Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00. 
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total."""

print(f"""\nBem vindo ao Calculador de Tintas!\nNesse programa utilizaremos as informações oferecidas,
       para calcular quantas latas de tinta serão necessarias em um projeto.""")

tamanho = float(input(f"\nPara proseguirmos, informe a frente a medida da area em que você deseja pintar: "))

lataTinta = 18

coberturaTinta = 3

precolata = 80

calcCliente = (tamanho / (lataTinta * coberturaTinta))

arredonda = math.ceil(calcCliente)

print(f"\nBaseado na area de {tamanho:.2f} m desejados, você deverá obter {arredonda} latas de tintas!")