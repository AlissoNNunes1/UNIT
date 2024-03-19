from functions import *

def main():
    while True:
        print("\n=== Sistema de Controle de Lavagens ===")
        print("1. Cadastro de Funcionários")
        print("2. Cadastro de Veículos")
        print("3. Registro de Lavagem")
        print("4. Relatório de Lavagens")
        print("0. Sair")
        
        opcao = input("Escolha uma opção: ")
        
        if opcao == '1':
            cadastrar_funcionario()
        elif opcao == '2':
            cadastrar_veiculo()
        elif opcao == '3':
            registrar_lavagem()
        elif opcao == '4':
            relatorio_lavagens()
        elif opcao == '0':
            print("Encerrando o programa...")
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()
