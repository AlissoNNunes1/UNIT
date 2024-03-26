total_prestacoes = 0
valor_total_prestacoes = 0

while True:
    valor_da_prestacao = float(input('Informe o valor da prestação (ou um valor negativo para sair):'))
    if valor_da_prestacao <= 0:
        break

    dias_em_atraso = int(input('Informe o número de dias em atraso:'))

    def ValorPagamento(valor_prestacao, dias_atraso):
        if dias_atraso <= 0:
            return valor_prestacao
        else:
            valor_final = valor_prestacao + (valor_prestacao * 0.03) + (dias_atraso * 0.001 * valor_prestacao)
            return valor_final

    valor_final = ValorPagamento(valor_da_prestacao, dias_em_atraso)
    print(f'O valor a ser pago é de R$ {valor_final:.2f}')

    total_prestacoes += 1
    valor_total_prestacoes += valor_final

print('Relatório do Dia:')
print(f'Quantidade de prestações pagas: {total_prestacoes}')
print(f'Valor total das prestações pagas: R$ {valor_total_prestacoes:.2f}')
