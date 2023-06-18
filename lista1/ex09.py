"""Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9)."""

fahrenheit = float(input(f"\nInforme a temperatura que você deseja converter de Fahrenheit para Celsius: "))

conversor = 5 * ((fahrenheit - 32) / 9)

print(f"\nA temperatura {fahrenheit:.2f} F° é equivalente a {conversor:.2f} C° !")
