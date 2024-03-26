from itertools import combinations

numeros = [10, 12, 16, 18, 37, 45, 43, 56, 5, 27, 32, 6, 3, 40]
comb_6_de_6 = list(combinations(numeros, 6))

print(f'Número total de combinações possíveis: {len(comb_6_de_6)}')
print('Algumas combinações:')
for comb in comb_6_de_6[:10]:  # Mostrando as primeiras 10 combinações como exemplo
    print(comb)
