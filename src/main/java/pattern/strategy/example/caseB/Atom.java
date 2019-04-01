package pattern.strategy.example.caseB;

public class Atom extends Robot {

    public Atom(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have Strong punch and can attack with it.");
    }

    @Override
    public void move() {
        System.out.println("I can fly.");
    }
}
