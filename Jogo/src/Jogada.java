import java.util.Arrays;
import java.util.Scanner;

public class Jogada {
    private String jogadaPalavra;
    private Partida partida;
    private static Jogada instance = null;

    private Jogada(Partida partida) {
        this.partida = partida;
    }

    public static Jogada getSingleton(Partida partida) {
        if (instance == null) {
            instance = new Jogada(partida);
        }
        return instance;
    }

    public boolean realizarJogada() {
        partida.encerrarPartidaCasoExceda();
        System.out.println("Realizar tentativa " + (partida.getQtdTentativas() + 1) + ":");
        Scanner scan = new Scanner(System.in);

        String jogada = scan.nextLine();
        String[] charArray = jogada.split("");

            if (charArray.length == 5) {
                partida.somarTentativa();
                this.jogadaPalavra = jogada;
                System.out.println(Arrays.toString(charArray));
                return true;
            } else {
                System.out.println("Digite uma palavra de 5 caracteres!");
        } 
        return false;
    }

    public String getJogadaPalavra() {
        return this.jogadaPalavra;
    }

    public void setJogadaPalavra(String jogadaPalavra) {
        this.jogadaPalavra = jogadaPalavra;
    }

    public Partida getPartida() {
        return this.partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
}
