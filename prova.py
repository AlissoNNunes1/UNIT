def cadastrar_questoes():
    questoes = []
    
    while True:
        enunciado = input("Digite o enunciado da questão (ou SAIR para encerrar): ")
        if enunciado == "SAIR":
            break
        
        alternativas = []
        for i in range(4):
            alternativa = input(f"Digite a alternativa {chr(65 + i)}: ")
            alternativas.append(alternativa)
        
        resposta_correta = input("Digite a alternativa correta (A/B/C/D): ").upper()
        
        questao = {
            "enunciado": enunciado,
            "alternativas": alternativas,
            "resposta_correta": resposta_correta
        }
        questoes.append(questao)
        
        print("Questão cadastrada com sucesso!")
        print("=" * 40)
    
    return questoes

def realizar_prova(questoes):
    acertos = 0
    erros = 0
    
    while True:
        nome = input("Digite o nome do participante (ou SAIR para encerrar): ")
        if nome == "SAIR":
            break
        
        print(f"Olá, {nome}! Responda às seguintes questões:")
        
        for i, questao in enumerate(questoes, start=1):
            print(f"{i}) {questao['enunciado']}")
            for j, alternativa in enumerate(questao['alternativas']):
                print(f"   {chr(65 + j)}) {alternativa}")
            
            resposta = input("Qual é a resposta correta (A/B/C/D)? ").upper()
            
            if resposta == questao['resposta_correta']:
                acertos += 1
                print("Resposta correta!")
            else:
                erros += 1
                print("Resposta incorreta.")
        
        print(f"Resultado para {nome}: Acertos - {acertos} | Erros - {erros}")
        print("=" * 40)
    
    print("Programa encerrado.")

def main():
    print("===== Cadastro de Questões Objetivas =====")
    questoes = cadastrar_questoes()
    
    print("===== Realização da Prova =====")
    realizar_prova(questoes)

if __name__ == "__main__":
    main()
