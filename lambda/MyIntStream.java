package lambda;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {
    
    // 1. 
    public List<Integer> rangeTest(int a, int b) {
        /* (step 1) 클래식 자바
        public List<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            ls.add(i)
        }
        
        (step 2) Arrays 사용
        Arrays.asList(new Integer[]{1,2,3,4});
        */

        // (step 3) IntStream
        return  IntStream.range(a, b).boxed().collect(Collectors.toList());
    }

    public static boolean evenNumber(int i) {
        return i % 2 == 0 ;
    }

    public static boolean oddNumber(int i) {
        return i % 2 != 0 ;
    }

    // 2. allMatch()
    public boolean allMatchEvenTest(int a) {
        return IntStream.of(a).allMatch(MyIntStream::evenNumber);
    }

    public int randomNum(int a, int b) {
        return (int)((Math.random() * b) + a);
    }

    public Map<String, Object> returnMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        
        return map;
    }

    // 3. of()
    public List<Integer> ofBoxTest() {
        return IntStream.of(1, 2, 3, 4).boxed().collect(Collectors.toList());
    }

    // 4. 
    public List<Integer> concatTest() {
        return Stream.concat(IntStream.of(1, 2).boxed(), Stream.of(3)).collect(Collectors.toList());
    }

    // 5. 
    public List<Integer> collectTest() {
        return IntStream.range(1, 11).parallel().filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
    }

    //6. 
    public double averageTest(int a, int b) {
        //return IntStream.range(a, b).average().orElseThrow(RuntimeException::new);
        return IntStream.range(a, b).average().orElse(-1); //위의 간략한 표기법 (결과값은 같다.)
    }

    // 7. 
    public List<Integer> builderTest() {
        return IntStream.builder().add(1).add(2).add(3).build().boxed().collect(Collectors.toList());
    }

    // 8.
    public IntSummaryStatistics summaryStatisticsTest(int a, int b, int c, int d) {
        return IntStream.concat(IntStream.range(a, b), IntStream.range(c, d)).summaryStatistics();
    }

    // 9.
    public long countTest(int a, int b) {
        return IntStream.range(a, b).count();
    }

    // 10.
    public List<Integer> distinctTest() {
        return IntStream.of(4, 3, 1, 8, 1, 5, 4, 6, 3).distinct().boxed().collect(Collectors.toList());
    }
    
    // 11. 
    public long emptyTest() {
        return IntStream.empty().count();
    }

    // 12.
    public int findFirstTest() {
        return IntStream.of(91,45,33).findFirst().orElse(-1);
    }

    // 13.
    public List<Integer> flatMapTest() {
        return IntStream.of(2,3,5,7).flatMap(MyIntStream::iter).boxed().collect(Collectors.toList());
    }
    private static IntStream iter(int i){
        return IntStream.iterate(i,j -> j + i).limit(5);
    }

    // 14. 
    public List<Integer> generateTest() {
        return IntStream.generate(() -> (int)(Math.random() * 100)).limit(5).boxed().collect(Collectors.toList());
    }

    // 15.
    public List<Integer> iterateTest() {
        return IntStream.iterate(10, i -> i + 5).limit(5).boxed().collect(Collectors.toList());
    }

    // 16.
    public List<Integer> mapTest(int a, int b) {
        return IntStream.range(a, b).map(i -> i * 2).boxed().collect(Collectors.toList());
    }

    // 17.
    public int maxTest() {
        return IntStream.range(1, 398).max().orElse(-1);
    }

    // 18.
    public boolean peekTest() {
        return IntStream.iterate(1, i -> 1 + 5).limit(5).peek(System.out::println).noneMatch(i -> i % 3 == 0);
    }

    // 19.
    public List<Integer> rangeClosedTest() {
        return IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());
    }

    // 20. 
    public int reduceTest(int x, int y) {
        return IntStream.rangeClosed(x, y).reduce(0, (a, b) -> a + b);
    }
    
    // 21.
    public List<Integer> sequentialTest() {
        return IntStream.rangeClosed(1, 5).sequential().boxed().collect(Collectors.toList());
    }

    // 22. 
    public List<Integer> parallelTest() {
        return IntStream.rangeClosed(1, 5).parallel().boxed().collect(Collectors.toList());
    }

    // 23.
    public List<Integer> skipTest() {
        return IntStream.rangeClosed(1, 5).skip(3).boxed().collect(Collectors.toList());
    }

    // 24.
    public List<Integer> sortTest() {
        return IntStream.of(3, 1, 5, 4, 2).sorted().boxed().collect(Collectors.toList());
        /*
        return  IntStream.generate(() -> (int)(Math.random() * 100)).limit(5).peek(System.out::println).sorted().boxed().collect(Collectors.toList());
         */
    }

    public static void main(String... args) {
        MyIntStream mi = new MyIntStream();
        System.out.println("01번 테스트 결과: " + mi.rangeTest(1,5));
        System.out.println("Random: " + mi.randomNum(1, 101));
        System.out.println("02번 테스트 결과: " + mi.allMatchEvenTest(2));
        mi.ofBoxTest().forEach(System.out::println); 
        mi.concatTest().forEach(System.out::println);
        System.out.println("05번 테스트 결과: " + mi.collectTest());
        System.out.println("06번 테스트 결과: " + mi.averageTest(1, 6));
        System.out.println("07번 테스트 결과: " + mi.builderTest());
        System.out.println("08번 테스트 결과: " + mi.summaryStatisticsTest(1, 4, 17, 25));
        System.out.println("09번 테스트 결과: " + mi.countTest(1, 86));
        System.out.println("10번 테스트 결과: " + mi.distinctTest());
        System.out.println("11번 테스트 결과: " + mi.emptyTest());
        System.out.println("12번 테스트 결과: " + mi.findFirstTest());
        System.out.println("13번 테스트 결과: " + mi.flatMapTest());
        System.out.println("14번 테스트 결과: " + mi.generateTest());
        System.out.println("15번 테스트 결과: " + mi.iterateTest());
        System.out.println("16번 테스트 결과: " + mi.mapTest(1, 8));
        System.out.println("17번 테스트 결과: " + mi.maxTest());
        System.out.println("18번 테스트 결과: " + mi.peekTest());
        System.out.println("19번 테스트 결과: " + mi.rangeClosedTest());
        System.out.println("20번 테스트 결과: " + mi.reduceTest(1, 10));
        System.out.println("21번 테스트 결과: " + mi.sequentialTest());
        System.out.println("22번 테스트 결과: " + mi.parallelTest());
        System.out.println("23번 테스트 결과: " + mi.skipTest());
        System.out.println("24번 테스트 결과: " + mi.sortTest());
    }
}