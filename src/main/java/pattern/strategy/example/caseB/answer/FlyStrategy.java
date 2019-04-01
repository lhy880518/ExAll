package pattern.strategy.example.caseB.answer;

public class FlyStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("I am Only Fly");
    }
}
