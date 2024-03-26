import random

def mostrar_forca(erros):
    for i in range(erros):
        print("  O")
        print(" /|\\")
        print(" / \\")
    print()

def escolher_palavra():
    palavras = ["python", "programacao", "computador", "desenvolvimento", "openai", "inteligencia"]
    return random.choice(palavras)

def jogo_da_forca(palavra_secreta):
    palavra_atual = ['_'] * len(palavra_secreta)
    erros = 0
    tentativas = []

    print("Bem-vindo ao Jogo da Forca!")
    
    while True:
        letra = input("\nDigite uma letra: ").lower()

        if letra in tentativas:
            print("Você já tentou essa letra. Tente outra.")
            continue
        
        tentativas.append(letra)
        
        if letra in palavra_secreta:
            for i, char in enumerate(palavra_secreta):
                if char == letra:
                    palavra_atual[i] = letra
        else:
            erros += 1
            print("Letra incorreta! Você tem", 3 - erros, "tentativas restantes.")
            mostrar_forca(erros)
        
        print("Palavra atual:", ' '.join(palavra_atual))
        
        if '_' not in palavra_atual:
            print("Parabéns, você ganhou!")
            break
        
        if erros >= 3:
            print("Você perdeu! A palavra era:", palavra_secreta)
            break

palavra_secreta = escolher_palavra()
jogo_da_forca(palavra_secreta)
