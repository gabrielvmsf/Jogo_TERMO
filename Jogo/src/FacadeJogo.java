public class FacadeJogo {

    private Jogada jogada;
    private Jogador jogador;
    private Partida partida;
    private ValidarJogada validarJogada;
    private State tentativa;

    public FacadeJogo(String nome) {
        this.jogador = new Jogador(nome);
        this.partida = Partida.getSingleton(jogador);
        this.jogada = Jogada.getSingleton(partida);
        this.validarJogada = new ValidarJogada(jogada);
        this.tentativa = new Tentativa();
    }

    public void iniciarJogo() {
        partida.mostrarRegras();
        realizarEValidarJogada();
    }

    private void realizarEValidarJogada() {
        while (partida.verificarPossuirTentativa() && !validarJogada.alternativaCerta()) {
            if (jogada.realizarJogada() == true) {
                validarJogada.definirStatusPosição();
                verificarTentativa();
            }
        }
        começarNovoJogo();
    }

    private void verificarTentativa() {
        if (validarJogada.alternativaCerta()) {
            System.out.println("Tentativa correta!");
            tentativa = tentativa.tentativaCorreta(validarJogada.getPalavra(), partida);
            começarNovoJogo();
        } else
            tentativa = tentativa.tentativaIncorreta(validarJogada.getPalavra(), partida);
    }

    private void começarNovoJogo() {
        if (partida.iniciarNovaPartida()) {
            tentativa = tentativa.resetarTentativa();
            partida.setQtdTentativas(0);
            validarJogada = new ValidarJogada(jogada);
            iniciarJogo();
        }
    }
}
