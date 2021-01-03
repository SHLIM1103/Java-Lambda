package loop;

import java.util.Arrays;

public class For {
    public static void main(String[] args) {
        Arrays.asList(2).stream().forEach(a -> {
            if(a.intValue() < 4){
                System.out.println("a의 현재값: " + a.intValue());
            }
        });
        
        
        
        
        /*
        for(int i = 0; i < 4; i++) {
            System.out.println("i의 현재값: "+i);
        }
        for(int i = 10; i < 0; i++) {
            System.out.println("실행될까?");
        }
        
        for(int i = 0; i < 4; i++);{
            System.out.println("몇번 반복될까?");
        }
        for(int i = 0; i < 4; i++) {
            System.out.println(i); // 여기는 scope니깐 문제없음
        }
        int i = 0;
        for(;i < 4; i++) {
            System.out.println(i);
        }
        */
    }
}



















