package pattern.strategy.example.caseA;

public class Axe implements Weapon {
    @Override
    public void attack() {
        System.out.println("독2 공격");
    }
}
