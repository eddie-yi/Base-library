package 内存泄漏问题;

/**
 * 实例1：长生命周期的对象持有短生命周期的引用，就很可能出现内存泄漏
 * 内存泄漏实例
 *   这个object实例，我们期望它只作用与method1()方法中，且其他地方不会再用到它，但是，
 *   当method1()方法执行完毕后，object对象所分配的内存不会马上被认为是可以被释放的内存
 *   ，只有再Simple类创建的对象被释放后才会被释放，严格说这就是一种内存泄漏
 */
public class 长生命周期的对象持有短生命周期的引用 {
    Object object;

    public void method1(){
        object = new Object();
        //..其他代码


        //加上这段代码可以解决此类内存泄漏问题
        object = null;
    }
}
