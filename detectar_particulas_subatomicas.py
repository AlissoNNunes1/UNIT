def criar_dicionario():
    particulas = {}
    
    while True:
        nome = input('Informe o nome da partícula (ou "sair" para encerrar): ')
        
        if nome.lower() == 'sair':
            break
        
        try:
            probabilidade = float(input('Informe a probabilidade (0-1) de detectar a partícula: '))
        except ValueError:
            print('Valor de probabilidade inválido. Tente novamente.')
            continue
        
        if probabilidade < 0 or probabilidade > 1:
            print('A probabilidade deve estar no intervalo de 0 a 1. Tente novamente.')
            continue
        
        particulas[nome] = probabilidade
        
    return particulas

def partcula_menos_provavel(particulas):
    if not particulas:
        return []
    
    menor_probabilidade = min(particulas.values())
    
    menos_provaveis = [particula for particula, probabilidade in particulas.items() if probabilidade == menor_probabilidade]
    
    return menos_provaveis

if __name__ == "__main__":
    dicionario_particulas = criar_dicionario()
    
    menos_provaveis = partcula_menos_provavel(dicionario_particulas)
    
    if menos_provaveis:
        if len(menos_provaveis) == 1:
            print(f"A partícula menos provável de ser observada é: {menos_provaveis[0]}")
        else:
            print("As partículas menos prováveis de serem observadas são:")
            for part in menos_provaveis:
                print(part)
    else:
        print("Nenhuma partícula foi inserida.")
