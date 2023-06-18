import math
"""Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, 
que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. 
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias."""

print(f"""\nBem vindo ao Calculador de Tinta 2.0!
      Neste programa o auxiliaremos na obra, o auxiliando a comprar o número adequado de latas de tinta,
      gastando o mínimo possível.""")

tamanho = float(input(f"\nPara prosseguirmos, nos informe a frente, quantos metros quadrados você deseja pinta: "))

folga = tamanho + ((tamanho * 10 ) / 100)

cobertura18L = 18 * 6

cobertura3L = 3.6 * 6

preco18L = 80

preco3L = 25

latas18L = 0

latas3L = 0

calcTamanho = folga

while calcTamanho > 0:
    if calcTamanho > cobertura3L:
        if ((math.ceil(calcTamanho / cobertura3L)) * preco3L) < ((math.ceil(calcTamanho / cobertura18L)) * preco18L):
            latas3L += 1
            calcTamanho -= cobertura3L
        else:
            latas18L += 1
            calcTamanho -= cobertura18L
    elif calcTamanho <= cobertura3L:
       latas3L += 1
       calcTamanho -= cobertura3L
    else:
       latas3L += 1
       calcTamanho -= cobertura3L
       break


print(f"""\nLevando em consideração a quantidade de metros que precisam ser pintadas: {tamanho:.2f} metros
      
      Poderemos ter os seguintes cenarios:
      
      Concluindo a obra com apenas latas de 18 litros (Considerando 10% de folga no tamanho a pintar): 
      - Número de latas: {(math.ceil(folga / cobertura18L)):.2f}
      - Preço Total: R${((math.ceil(folga / cobertura18L)) * preco18L):.2f}

      Concluindo a obra com apenas latas de 3,6 litros (Considerando 10% de folga no tamanho a pintar):
      - Número de latas: {(math.ceil(folga / cobertura3L)):.2f}
      - Preço Total: R${((math.ceil(folga / cobertura3L)) * preco3L):.2f}

      Concuindo a obra misturando galões de 18 litros e 3,6 litros (Considerando 10% de folga no tamanho a pintar):
      - Número de latas de 18 litros: {latas18L}
      - Número de latas de 3,6 litros: {latas3L}
      - Preço Total: {((latas18L * preco18L) + (latas3L * preco3L)):.2f}  
             - Latas de 18 litros: R${(latas18L * preco18L):.2f}
             - Latas de 3,6 litros: R${(latas3L * preco3L):.2f}""")

