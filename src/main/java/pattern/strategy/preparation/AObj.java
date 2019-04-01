package pattern.strategy.preparation;

public class AObj {

    Ainterface ainterface;

    public AObj(){
        ainterface = new AinterfaceImpl();
    }

    public void funcAA(){

        // 위임한다.
        ainterface.funcA();
        ainterface.funcA();
//        System.out.println("AAA");
//        System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요

    }
}
