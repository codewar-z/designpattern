package travel;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.getToAirport();
    }
}