package branch;
import java.util.Arrays;

public class If02 {
    public static void main(String[] args) {
        
        Arrays.asList(11).stream().forEach(a -> {
            if(a.intValue() % 2 == 1){
                System.out.println("number는 홀수입니다: " + a.intValue());
            }else{
                System.out.println("number는 짝수입니다: " + a.intValue());
            }
        });

        
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        if(number % 2 == 1) {
            System.out.println("홀수입니다.");
        }
        
        */
    }
}
