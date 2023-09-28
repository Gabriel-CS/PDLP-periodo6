#Escreva um programa para controlar uma pequena máquina registradora. Você deve solicitar ao usuário que digite
# o código do produto e a quantidade comprada. Utilize a tabela de códigos a seguir para obter o preço de cada 
# produto respectivamente: 1 -> 0,50 | 2 -> 1,00 | 3 -> 4,00 | 5 -> 7,00 | 9 -> 8,00. Seu programa deve exibir o
# total das compras depois que o usuário digitar 0. Qualquer outro código deve gerar a mensagem de erro "Código inválido".

codigo = 1
pagamento = 0.0
preco = 0.0

while (codigo != 0):
  codProduto = int(input("Código do produto (0 para sair): "))

  if(codigo == 0):
    break;

  elif(codigo == 1):
    preco = 0.50

  elif(codigo == 2):
    preco = 1.00

  elif(codigo == 3):
    preco = 4.00

  elif(codigo == 5):
    preco = 7.00

  elif(codigo == 9):
    preco = 8.00

  elif(codigo == 0):
    codProduto = 0

  else:
    print("Código inválido!")


  qtdProduto = int(input("Quantidade: "))
  pagamento += preco * qtdProduto
