def converter_para_pm(hora):
    if hora == 12:
        return hora
    else:
        return hora + 12

def exibir_resultado(hora, minuto, periodo):
    print(f"{hora:02d}:{minuto:02d} {periodo}")

while True:
    entrada_horas = input('Informe as horas que deseja converter ou digite "sair" para sair: ')
    
    if entrada_horas.lower() == 'sair':
        break
    
    try:
        horas = int(entrada_horas)
        minutos = int(input('Agora informe os minutos: '))
        
        if 0 <= horas < 12:
            periodo = "A.M."
        else:
            periodo = "P.M."
            horas = converter_para_pm(horas)

        exibir_resultado(horas, minutos, periodo)
    
    except ValueError:
        print('Entrada inválida. Certifique-se de fornecer um número inteiro para as horas.')
