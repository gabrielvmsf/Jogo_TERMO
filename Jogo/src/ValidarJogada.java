import java.util.Arrays;

public class ValidarJogada {
    private boolean tentativaCorreta;
    private int[] statusPosição = { 0, 0, 0, 0, 0 };
    private Palavra palavra;
    private Jogada jogada;

    // Status da Posição -
    // 0 - Incorreta / 1 - Correta / 2 - Parcialmente Correta

    public ValidarJogada(Jogada jogada) {
        this.jogada = jogada;
        this.tentativaCorreta = false;
        this.palavra = new Palavra();
    }

    // Verificar Status de cada posição
    public void definirStatusPosição() {
        String jogadaString = jogada.getJogadaPalavra();
        jogadaString = palavra.removeAccentsBeforeJava7(jogadaString);

        String palavraString = palavra.getpalavraEscolhida();
        palavraString = palavra.removeAccentsBeforeJava7(palavraString);

        for (int i = 0; i < statusPosição.length; i++)
            statusPosição[i] = 0;

        for (int i = 0; i < statusPosição.length; i++) {
            if (palavraString.charAt(i) == jogadaString.charAt(i) && statusPosição[i] != 1) {
                statusPosição[i] = 1;

            } else if (palavraString.charAt(i) != jogadaString.charAt(i) && statusPosição[i] != 1) {
                statusPosição[i] = 0;
            }
        }
        for (int i = 0; i < statusPosição.length; i++) {
            for (int j = 0; j < statusPosição.length; j++) {
                if (palavraString.charAt(j) == jogadaString.charAt(i) && statusPosição[j] != 1
                        && statusPosição[i] != 1 && statusPosição[i] != 2 && j != i) {
                    statusPosição[i] = 2;
                }
            }
        }
        System.out.println(Arrays.toString(statusPosição) + "\n");
    }

    public boolean alternativaCerta(){
        int qtdCorreto = 0;
        for (int i = 0; i < statusPosição.length; i++) {
            if (statusPosição[i] == 1) {
                qtdCorreto++;
            }
        }
        if(qtdCorreto == 5) return true;
        else return false;
    }

    public boolean getTentativaCorreta() {
        return this.tentativaCorreta;
    }

    public boolean isTentativaCorreta() {
        return this.tentativaCorreta;
    }

    public int[] getStatusPosição() {
        return this.statusPosição;
    }

    public Palavra getPalavra() {
        return this.palavra;
    }

    public void setStatusPosição(int[] statusPosição) {
        this.statusPosição = statusPosição;
    }

    public void setPalavra(Palavra palavra) {
        this.palavra = palavra;
    }

    public Jogada getJogada() {
        return this.jogada;
    }

    public void gerarNovaPalavra() {
        setPalavra(new Palavra());
    }
}
