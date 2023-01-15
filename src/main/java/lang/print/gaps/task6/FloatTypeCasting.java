package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int cba;
        if((numberToBeRounded*10)%10<5) {
            cba = (int) numberToBeRounded;
        }
        else {
            cba = (int) numberToBeRounded;
            cba+1;
        }
        System.out.println(cba);
    }
}
