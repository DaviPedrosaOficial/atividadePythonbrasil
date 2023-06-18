"""Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7"""

print("""Olá, bem vindo(a) ao programa Peso Ideal! 
 Nesse sistema, calcularemos o seu peso ideal baseado nas informações fornecidas por vocês usuários!""")

alturaCliente = float(input(f"\nPara começarmos, nos informe a seguir a sua altura: "))

sexoCliente = input("Agora, nos informe a seguir se você é homem ou mulher biologica (para a resposta utilize H ou M): ").lower()

pesoIdeal = 0

if sexoCliente == "m":
    pesoIdeal = (62.1 * alturaCliente) - 44.7
elif sexoCliente == "h": 
    pesoIdeal = (72.7 * alturaCliente) - 58

print(f"\nBaseado na sua altura de {alturaCliente:.2f}m, o seu peso ideal é de: {pesoIdeal:.2f}Kg !")
