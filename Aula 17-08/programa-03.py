# Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dia e quantos anos ele já fumou. Considere que um fumante perde 10 minutos de vida a cada cigarro, e calcule quantos dias de vida de um fumante perderá. Exiba o total em dias.

def calcularDiasVida(qtdCigarroDia, anosDeFumo):
  diasFumo = anosDeFumo * 365
  totalCigarros = diasFumo * qtdCigarroDia
  diasPerdidos = (((totalCigarros * 10)/60)/24)
  print("Dias de vida perdidos: ", diasPerdidos)

qtdCigarroDia = int(input("Quantidade de cigarros fumados: "))
anosDeFumo = int(input("Quantidade de anos fumados: "))

calcularDiasVida(qtdCigarroDia, anosDeFumo)
