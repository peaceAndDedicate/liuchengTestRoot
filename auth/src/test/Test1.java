import org.junit.Test;

public class Test1 {

    private final int MAX = 2000;

    @Test
    public void contextLoads() {
        long before = System.currentTimeMillis();
        for (int i = 1; i < MAX; i++) {
            for (int j = 1; j < MAX; j++) {
                for (int k = 1; k < MAX; k++) {
                    if((i*i + j*j == k*k ) && ( i + j + k ==MAX)){
                        System.out.println("i:"+i+",j:{}"+j+",k:{}"+k);
                    }
                }
            }
        }
        long after = System.currentTimeMillis();
        System.out.println("完毕，耗时："+(after-before));
    }

    @Test
    public void contextLoads2() {
        long before = System.currentTimeMillis();
        for (int i = 1; i < MAX; i++) {
            for (int j = 1; j < MAX; j++) {
                if(i*i + j*j == (MAX-i-j)*(MAX-i-j)){
                    System.out.println("i:"+i+",j:{}"+j+",k:{}"+(MAX-i-j));
                }
            }
        }
        long after = System.currentTimeMillis();
        System.out.println("完毕，耗时："+(after-before));
    }
}