"""Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário."""

base = float(input("Informe a frente o tamanho da base do quadrado desejado: "))

altura = float(input(f"\nAgora informe a altura do mesmo: "))

calcArea = base * altura

print(f"\nBaseado nas informações fornecidas, o dobro da area de seu quadrado é {(calcArea * 2):.2f} !")