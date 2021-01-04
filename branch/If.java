package branch;

import java.util.Arrays;

public class If {
    public static void main(String[] args) {
        Arrays.asList(-5).forEach(a -> {
            if(a.intValue() > 0) {
                System.out.println("number: "+ a.intValue());
            }else {
                System.out.println("number는 0 이하입니다.");
            }
        });

        /*
        int number = 3;
        if(number > 0) {
            System.out.println("number: "+number);
        }else {
            System.out.println("number는 0 이하입니다.");
        }
        */
    }
}