package pattern.strategy.example.caseB.answer;

public class WalkingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("I am Only Walk");
    }
}
