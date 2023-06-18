"""Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit."""

celsius = float(input("Informe uma temperatura em Celsius, na qual você deseje converter em Fahrenheit: "))

convFahr = ((celsius * 9) / 5) + 32


print(f"\nA temperatura {celsius:.2f} C° é equivalente a {convFahr:.2f} F° !")
