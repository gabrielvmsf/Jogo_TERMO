public class Resultado {
    private boolean tentativaCorreta;
    private int qtdJogadas;
    private Partida partida;
    private Palavra palavra;

    public Resultado(Boolean tentativaCorreta, Palavra palavra, Partida partida) {
        this.palavra = palavra;
        this.partida = partida;
        this.tentativaCorreta = tentativaCorreta;
        this.qtdJogadas = partida.getQtdTentativas();
    }

    public void retornarResultado() {
        if (tentativaCorreta == true)
            System.out.println("O(a) jogador(a) " + partida.getJogador().getnickname() + " acertou a palavra "
                    + palavra.getPalavraEscolhida() + " com " + qtdJogadas + " jogadas.");
        else
            System.out.println("O(a) jogador(a) " + partida.getJogador().getnickname() + " errou a palavra "
                    + palavra.getPalavraEscolhida() + " após exceder 6 jogadas.");
    }
}
