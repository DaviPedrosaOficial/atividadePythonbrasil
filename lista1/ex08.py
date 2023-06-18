"""Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês."""

valorHora = float(input("Informe a frente o valor que custa sua hora trabalhada: "))

horasTrabalhadas = float(input(f"\nAgora, informe a quantidades de horas trabalhadas neste mes: "))

calcSalario = valorHora * horasTrabalhadas

print(f"\nO valor total de salario deste mes é {(calcSalario):.2f} !")

