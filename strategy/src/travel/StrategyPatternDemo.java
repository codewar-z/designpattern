package travel;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new Car());
        context.executeStrategy();

        context = new Context(new Bus());
        context.executeStrategy();
    }
}
