import math

# Função para calcular a área de um retângulo
def calcular_area_retangulo():
    base = float(input("Digite a base do retângulo: "))
    altura = float(input("Digite a altura do retângulo: "))
    area = base * altura
    return area

# Função para calcular a área de um triângulo
def calcular_area_triangulo():
    base = float(input("Digite a base do triângulo: "))
    altura = float(input("Digite a altura do triângulo: "))
    area = 0.5 * base * altura
    return area

# Função para calcular a área de um círculo
def calcular_area_circulo():
    raio = float(input("Digite o raio do círculo: "))
    area = math.pi * raio**2
    return area

# Função principal que exibe o menu e calcula a área com base na escolha do usuário
def main():
    while True:
        print("\nEscolha o tipo de objeto para calcular a área:")
        print("1 - Retângulo")
        print("2 - Triângulo")
        print("3 - Círculo")
        print("0 - Sair")
        
        escolha = int(input("Digite o número da opção desejada: "))
        
        if escolha == 1:
            area = calcular_area_retangulo()
            print(f"A área do retângulo é: {area}")
        elif escolha == 2:
            area = calcular_area_triangulo()
            print(f"A área do triângulo é: {area}")
        elif escolha == 3:
            area = calcular_area_circulo()
            print(f"A área do círculo é: {area}")
        elif escolha == 0:
            print("Encerrando o programa.")
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()
