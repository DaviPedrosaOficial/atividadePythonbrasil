"""Faça um Programa que peça as 4 notas bimestrais e mostre a média."""

nota1 = float(input("Informe a primeira nota: "))
nota2 = float(input(f"\nInforme a segunda nota: "))
nota3 = float(input(f"\nInforme a terceira nota: "))
nota4 = float(input(f"\nInforme a quarta nota: "))

media = (nota1 + nota2 + nota3 + nota4) / 4

print(f"\nA media das notas foi {media:.2f} !")