package CloneDemo;

import java.util.*;

public final class CloneTest {
    public static void main(String[] args) {
        final String s1 = "String类型测试：";
        final StringBuilder s2 = new StringBuilder("StringBuilder类型测试：");
        final StringBuffer s3 = new StringBuffer("StringBuffer类型测试：");
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                long startTime = new Date().getTime();
                for (int i = 0; i < 10000000; i++) {
                    s2.append(i);
                }
                long endTime = new Date().getTime();
                System.out.println(endTime-startTime);
            }
        });
        thread1.start();
    }
}
