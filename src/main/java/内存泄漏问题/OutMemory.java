package 内存泄漏问题;

/**
 * 内存泄漏： 指程序中动态分配内存给临时对象，但对象不会被GC回收，它始终占用内存。即被分配的
 *           对象可达但已无用
 *      内存泄漏常见的原因是： 长生命周期的对象持有短生命周期对象的引用，而导致的内存泄漏
 * 内存溢出： 指程序运行过程中，无法申请到足够的内存而导致的一种错误，内存溢出通常发生于OLD段
 *           或perm段垃圾回收后，仍然无内存空间容纳新java对象的情况
 *  解决方法：
 *      （1） 可以使用Runtime.getRuntime().freeMemory()进行内存泄漏查询
 */
public class OutMemory {
    public static void main(String[] args) {
        System.out.println("free内存："+Runtime.getRuntime().freeMemory()/1024/1024);
        String[] aaa= new String[2000000];
        for (int i = 0; i < 2000000; i++) {
            aaa[i] = new String("aaa");
        }
        System.out.println("free内存:"+Runtime.getRuntime().freeMemory()/1024/1024);
    }
}
