def converter_para_celsius(temperatura):
    temperatura = temperatura.upper()  # Converter para maiúsculas para ser case-insensitive
    if 'F' in temperatura:
        # Converter de Fahrenheit para Celsius
        fahrenheit = float(temperatura.replace('F', ''))
        celsius = (fahrenheit - 32) * 5/9
        return celsius
    elif 'C' in temperatura:
        # A temperatura já está em Celsius
        return float(temperatura.replace('C', ''))
    else:
        # Se a unidade não for reconhecida, retorne None
        return None

um = input('Informe a primeira temperatura (exemplo: 32F ou 0C): ')
dois = input('Informe a segunda temperatura (exemplo: 32F ou 0C): ')

# Converter ambas as temperaturas para Celsius
temperatura_um_celsius = converter_para_celsius(um)
temperatura_dois_celsius = converter_para_celsius(dois)

if temperatura_um_celsius is None or temperatura_dois_celsius is None:
    print('Uma das temperaturas possui uma unidade desconhecida.')
else:
    if temperatura_um_celsius > temperatura_dois_celsius:
        print('A primeira temperatura é mais alta.')
    elif temperatura_um_celsius < temperatura_dois_celsius:
        print('A segunda temperatura é mais alta.')
    else:
        print('As duas temperaturas são iguais em Celsius.')
