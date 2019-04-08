package synchronizedThreadTest;

public class ContributeTest {

    static final int size=10;

    public static void main(String[] args) {
        //각각 기부
        long startAt = System.currentTimeMillis();

        Contributor[] crs = new Contributor[size];

        for(int loop=0 ; loop<size ; loop++){
            Contribution group = new Contribution();
            crs[loop] = new Contributor(group, " Contributor"+loop);
        }
        for(int loop=0 ; loop<size ; loop++){
            crs[loop].start();
        }

        long endAt = System.currentTimeMillis();
        long howTime = endAt - startAt;
        System.out.println("ContributeTest="+howTime);
    }
    // 0.002
    // 0.002
    // 0.003
}
