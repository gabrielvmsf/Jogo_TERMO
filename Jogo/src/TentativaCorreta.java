public class TentativaCorreta implements State {
    @Override
    public State tentativaCorreta(Palavra palavra, Partida partida) {
        return this;
    }

    @Override
    public State tentativaIncorreta(Palavra palavra, Partida partida) {
        if(!partida.verificarPossuirTentativa()){
            Resultado result = new Resultado(false, palavra, partida);
            result.retornarResultado();
        }
        return new TentativaIncorreta();
    }

    @Override
    public State resetarTentativa() {
        return new Tentativa();
    }

}
