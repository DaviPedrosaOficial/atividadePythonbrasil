"""Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a) salário bruto.
b) quanto pagou ao INSS.
c) quanto pagou ao sindicato.
d) o salário líquido.
e) calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido."""

print(f"""\nOlá, seja bem vindo ao Calcula Salário!

Neste programa te mostraremos quanto você deverá receber de salário no mês desejado.""")

valorHora = float(input("Para prosseguirmos, nos informe a seguir, qual o valor da sua hora de trabalho: "))

hrsTrabalhadas = float(input(f"\nAgora, nos informe a quantidade de horas trabalhadas no mês desejado: "))

salBruto = valorHora * hrsTrabalhadas

ir = (salBruto * 11) / 100

inss = (salBruto * 8) / 100

sindicato = (salBruto * 5) / 100

salLiquido = salBruto - ir - inss - sindicato

print(f"""\nBaseado nas informações apresentadas, seu salario deverá ser:
      
      Salario Bruto: R${salBruto:.2f}
    
      Descontos:
      - Imposto de Renda: R${ir:.2f}
      - INSS: R${inss:.2f}
      - Sindicato: R${sindicato:.2f}

      Salário Líquido: R${salLiquido:.2f}""")