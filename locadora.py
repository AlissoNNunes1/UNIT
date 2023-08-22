def main():
    locacoes = []
    total_quilometros = 0
    total_clientes_femininos = 0
    total_clientes_femininos_acima_7_dias = 0

    while True:
        print("========== Locadora de Veículos ==========")
        nome = input("Nome do cliente (ou SAIR para encerrar): ")
        
        if nome == "SAIR":
            break
        
        sexo = input("Sexo do cliente (F/M): ")
        placa = input("Placa do carro alugado: ")
        km_contratados = float(input("Quantidade de quilômetros contratados: "))
        dias_contratados = int(input("Quantidade de dias contratados: "))
        
        valor_total = calcular_valor_total(km_contratados, dias_contratados)
        locacao = {
            "nome": nome,
            "sexo": sexo,
            "placa": placa,
            "valor_total": valor_total
        }
        locacoes.append(locacao)
        
        total_quilometros += km_contratados
        
        if sexo == "F":
            total_clientes_femininos += 1
            if dias_contratados > 7:
                total_clientes_femininos_acima_7_dias += 1
        
        print("Locação registrada com sucesso!")
        print("=" * 40)
    
    if locacoes:
        print("========== Relatório Final ==========")
        for locacao in locacoes:
            print(f"Placa do carro: {locacao['placa']} | Valor total: R$ {locacao['valor_total']:.2f}")
        
        media_quilometros = total_quilometros / len(locacoes)
        print(f"Média de quilômetros contratados: {media_quilometros:.2f} km")
        
        print(f"Total de clientes femininos: {total_clientes_femininos}")
        print(f"Total de clientes femininos com aluguéis acima de 7 dias: {total_clientes_femininos_acima_7_dias}")
    
    print("Programa encerrado.")

def calcular_valor_total(quilometros, dias):
    valor_diaria = 70.0
    valor_kilometro = 0.10
    return (valor_diaria * dias) + (valor_kilometro * quilometros)

if __name__ == "__main__":
    main()
