"""Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso
 ideal, usando a seguinte fórmula: (72.7*altura) - 58"""

altCliente = float(input("Informe a frente a sua altura, para que assim, possamos calcular o seu peso ideal: "))

calcIdeal = (72.7 * altCliente) - 58

print(f"\nBaseado na altura informada, o seu peso ideal é de {calcIdeal:.2f}Kg !")
