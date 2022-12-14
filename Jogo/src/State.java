public interface State {
    public State tentativaCorreta(Palavra palavra, Partida partida);

    public State tentativaIncorreta(Palavra palavra, Partida partida);

    public State resetarTentativa();
}
