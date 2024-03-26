# Função para criar o mapa de assentos inicial
def criar_mapa_assentos(filas, cadeiras):
    return [[False for _ in range(cadeiras)] for _ in range(filas)]

# Função para exibir o mapa de assentos
def exibir_mapa_assentos(mapa):
    for fila in mapa:
        print(" ".join(["X" if assento else "O" for assento in fila]))

# Função para realizar uma reserva de assento
def reservar_assento(mapa, fila, cadeira):
    if not mapa[fila][cadeira]:
        mapa[fila][cadeira] = True
        print(f"Assento na fila {fila+1}, cadeira {cadeira+1} reservado com sucesso!")
    else:
        print(f"Assento na fila {fila+1}, cadeira {cadeira+1} já está reservado.")

# Função principal
def main():
    filas = 25
    cadeiras = 40
    
    mapa_assentos = criar_mapa_assentos(filas, cadeiras)
    
    while True:
        print("\nMapa de Assentos:")
        exibir_mapa_assentos(mapa_assentos)
        
        try:
            fila = int(input("\nInforme a fila desejada (1-25, 0 para sair): ")) - 1
            if fila == -1:
                break
            
            if fila < 0 or fila >= filas:
                print("Fila inválida. Tente novamente.")
                continue
            
            cadeira = int(input(f"Informe a cadeira desejada (1-{cadeiras}): ")) - 1
            
            if cadeira < 0 or cadeira >= cadeiras:
                print("Cadeira inválida. Tente novamente.")
                continue
            
            reservar_assento(mapa_assentos, fila, cadeira)
            
        except ValueError:
            print("Entrada inválida. Certifique-se de inserir um número válido.")

if __name__ == "__main__":
    main()

