import pandas as pd
from datetime import datetime

funcionarios_df = pd.DataFrame(columns=['Nome', 'CPF', 'DataNascimento'])
veiculos_df = pd.DataFrame(columns=['Placa', 'Marca', 'Modelo', 'Ano'])
lavagens_df = pd.DataFrame(columns=['PlacaVeiculo', 'CPFFuncionario', 'DataLavagem', 'Hora', 'TipoLavagem', 'ValorCobrado'])

def cadastrar_funcionario():
    nome = input("Digite o nome do funcionário: ")
    cpf = input("Digite o CPF do funcionário: ")
    data_nascimento = input("Digite a data de nascimento do funcionário (formato: DD/MM/AAAA): ")
    
    global funcionarios_df
    funcionarios_df = pd.concat([funcionarios_df, pd.DataFrame({'Nome': [nome], 'CPF': [cpf], 'DataNascimento': [data_nascimento]})], ignore_index=True)
    print("Funcionário cadastrado com sucesso!")

def cadastrar_veiculo():
    placa = input("Digite a placa do veículo: ")
    marca = input("Digite a marca do veículo: ")
    modelo = input("Digite o modelo do veículo: ")
    ano = input("Digite o ano do veículo: ")
    
    global veiculos_df
    veiculos_df = pd.concat([veiculos_df, pd.DataFrame({'Placa': [placa], 'Marca': [marca], 'Modelo': [modelo], 'Ano': [ano]})], ignore_index=True)
    print("Veículo cadastrado com sucesso!")

def registrar_lavagem():
    placa = input("Digite a placa do veículo: ")
    cpf = input("Digite o CPF do funcionário responsável: ")
    data_lavagem = datetime.now().strftime('%d/%m/%Y')
    hora = datetime.now().strftime('%H:%M:%S')
    tipo_lavagem = input("Digite o tipo de lavagem (simples ou completa): ").lower()
    valor_cobrado = 50.00 if tipo_lavagem == 'simples' else 100.00
    
    global lavagens_df
    lavagens_df = pd.concat([lavagens_df, pd.DataFrame({'PlacaVeiculo': [placa], 'CPFFuncionario': [cpf], 'DataLavagem': [data_lavagem], 'Hora': [hora], 'TipoLavagem': [tipo_lavagem], 'ValorCobrado': [valor_cobrado]})], ignore_index=True)
    print("Lavagem registrada com sucesso!")

def relatorio_lavagens():
    relatorio = lavagens_df.merge(veiculos_df, left_on='PlacaVeiculo', right_on='Placa').merge(funcionarios_df, left_on='CPFFuncionario', right_on='CPF')
    print("=== Relatório de Lavagens ===")
    print(relatorio[['DataLavagem', 'Hora', 'Placa', 'Modelo', 'Nome', 'TipoLavagem', 'ValorCobrado']])
