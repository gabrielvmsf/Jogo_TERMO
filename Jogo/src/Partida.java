import java.util.Scanner;

public class Partida {
    private int qtdTentativas;
    private Jogador jogador;
    private Palavra palavra;
    private static Partida instance = null;

    private Partida(Jogador jogador) {
        this.jogador = jogador;
        this.palavra = new Palavra();
        this.qtdTentativas = 0;
    }

    public static Partida getSingleton(Jogador jogador) {
        if (instance == null) {
            instance = new Partida(jogador);
        }
        return instance;
    }

    public void mostrarRegras() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem Vindo ao jogo de palavras! Deseja visualizar regras de jogo? (1 - Sim / 2 - Não)");
        int opção = scan.nextInt();

        if (opção == 1) {
            regras();
        }
    }

    public void encerrarPartidaCasoExceda() {
        if (!verificarPossuirTentativa()) {
            System.out.println("Partida encerrada!");
            iniciarNovaPartida();
        }
    }

    public boolean verificarPossuirTentativa() {
        if (qtdTentativas < 6) {
            return true;
        } else
            return false;
    }

    public boolean iniciarNovaPartida() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIniciar nova partida?");
        System.out.println("1 - Sim\n2 - Não\n");
        int opção = scan.nextInt();

        if (opção == 1) {
            System.out.println("Iniciando nova partida!\n");
            
            qtdTentativas = 0;
            
            return true;
        } else {
            System.out.println("Encerrando jogo!");
            System.exit(0);
        }
        return false;
    }

    private void regras() {
        System.out.println(
                "Descubra a palavra certa em 6 tentativas. Depois de cada tentativa, as peças mostram o quão perto você está da solução.");
        System.out.println("Status da Posição");
        System.out.println("0 - Incorreta: A letra não faz parte da palavra");
        System.out.println("1 - Correta: A letra faz parte da palavra e está na posição correta.");
        System.out.println("2 - Parcialmente Correta: A letra faz parte da palavra mas em outra posição.");
        System.out.println("Faça suas tentativas sem o uso de acentuação!\n");
    }

    public int getQtdTentativas() {
        return this.qtdTentativas;
    }

    public void setQtdTentativas(int qtdTentativas) {
        this.qtdTentativas = qtdTentativas;
    }

    public void somarTentativa() {
        this.qtdTentativas++;
    }

    public Jogador getJogador() {
        return this.jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Palavra getPalavra() {
        return this.palavra;
    }

    public void setPalavra(Palavra palavra) {
        this.palavra = palavra;
    }

}
