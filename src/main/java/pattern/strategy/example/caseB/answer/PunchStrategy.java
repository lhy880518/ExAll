package pattern.strategy.example.caseB.answer;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Punch");
    }
}
