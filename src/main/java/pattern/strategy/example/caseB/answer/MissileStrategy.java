package pattern.strategy.example.caseB.answer;

public class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Missile");
    }
}
