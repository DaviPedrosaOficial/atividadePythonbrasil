"""Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
 calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
"""
tamanho = int(input(f"\nInforme a frente o tamanho do arquivo em MB para que possamos calcular o tempo de download do mesmo: "))

velocidade = int(input("Agora informe a velocidade da rede em MBps: "))

print(f"\nO arquivo durará {((tamanho / velocidade) / 60):.2f} minutos para completar o download!")