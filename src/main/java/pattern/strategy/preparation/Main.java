package pattern.strategy.preparation;

public class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        ainterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();
    }
}
