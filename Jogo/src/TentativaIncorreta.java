public class TentativaIncorreta implements State {
    
    @Override
    public State tentativaCorreta(Palavra palavra, Partida partida) {
        System.out.println("Tentativa Correta!");
        Resultado result = new Resultado(true, palavra, partida);
        result.retornarResultado();
        
        return new TentativaCorreta();
    }
    @Override
    public State tentativaIncorreta(Palavra palavra, Partida partida) {
        if(!partida.verificarPossuirTentativa()){
            Resultado result = new Resultado(false, palavra, partida);
            result.retornarResultado();
        }
        return this;
    }
    @Override
    public State resetarTentativa() {
        return new Tentativa();
    }

    
}
