import subprocess

def listar_usuarios_windows():
    try:
        # Executa o comando 'net user' e captura a saída
        saida = subprocess.check_output(['net', 'user'], text=True)

        # Extrai a lista de usuários da saída
        usuarios = saida.split('----')[-1].strip().split()

        # Exibe os usuários
        print("Contas de usuários no sistema:")
        for usuario in usuarios:
            print(usuario)

    except Exception as e:
        print(f"Erro ao listar as contas de usuários: {e}")

listar_usuarios_windows()