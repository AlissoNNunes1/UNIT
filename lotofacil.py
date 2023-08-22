import random

while True:
    quantidade_dezenas = int(input('Digite a quantidade de dezenas a marcar (entre 15 e 18): '))

    if 15 <= quantidade_dezenas <= 18:
        break
    else:
        print("Quantidade de dezenas inválida. Digite novamente.\n")

print(f"Você escolheu marcar {quantidade_dezenas} dezenas na primeira aposta.")

num_primeira_aposta  =set()
while len(num_primeira_aposta) < quantidade_dezenas :
    
    num = int(input('Informe os numeros da primeira aposta (dezenas de 01 a 25,sem repetição)'))
    
    if num < 1 or num > 25:
        print("Dezena inválida. Digite um número de 01 a 25.")
    elif num in num_primeira_aposta:
        print("Número repetido. Digite outro número.")
    else:
        num_primeira_aposta.add(num)

num_primeira_aposta = list(num_primeira_aposta)
print("Números da primeira aposta:", num_primeira_aposta)

supresinha1 = random.sample(range(1,26), 18)
supresinha2 = random.sample(range(1,26), 18)
resultado = random.sample (range(1,26), 15)
print(f'\n Aposta 1: {sorted(num_primeira_aposta)} ')
print(f'\n Supresinha 1:{sorted(supresinha1)}')
print(f'\n Supresinha 2:{sorted(supresinha2)}')
print(f'\n resultado:{sorted(resultado)} ')
print(f'\n Dezenas acertadas na Aposta 1: {len(list(set(num_primeira_aposta).intersection(resultado)))} ')
print(f'\n Dezenas acertadas na Supresinha 1:{len(list(set(supresinha1).intersection(resultado)))}')
print(f'\n Dezenas acertadas na Surpresinha 2: {len(list(set(supresinha2).intersection(resultado)))} ')
