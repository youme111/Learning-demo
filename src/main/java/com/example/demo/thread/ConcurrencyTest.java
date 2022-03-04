package com.example.jucdemo.demoTest;

/**
 * 测试不同数据量级并发和串行的执行效率
 */
public class ConcurrencyTest {
    /**
     * 10000l  concurrency :1ms,b=-10000
     *         serial:0ms,b=-10000,a=50000
     *
     * 100000l  concurrency :2ms,b=-100000
     *          serial:2ms,b=-100000,a=500000
     *
     * 1000000l concurrency :4ms,b=-1000000
     *          serial:4ms,b=-1000000,a=5000000
     *
     * 10000000l concurrency :7ms,b=-10000000
     *           serial:9ms,b=-10000000,a=50000000
     *
     * 低于十万级并发比串行慢
     * 百万级二者差不多 （慢的原因：线程有创建和上下文切换的开销）
     * 超过百万级并发快
     * 亿级并发约快一倍
     */
    private static final long count = 100000000l;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        thread.join();
        System.out.println("concurrency :" + time + "ms,b=" + b);
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms,b=" + b + ",a=" + a);
    }
}

