package 内存泄漏问题;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合里面的数据都设置为null，但集合内存还是存在的
 *   下面蓝色注释已经使company = null了，所以这个对象已经无用，但是此时list集合中的所有
 *   元素都不会进行垃圾回收
 *
 *   解决这个问题方法： 红色注释部分
 *                      把list集合的变量也为null 就可以进行gc了
 */
public class 集合的内存泄漏 {
    public static void main(String[] args) {
        List<Company> list = new ArrayList<>();
        int i = 0;
        for (int j = 0; j < 10; j++) {
            Company company = new Company();
            company.setName("ali");
            list.add(company);
            //蓝色代码注解开始
            company = null;
            //蓝色代码注解结束
        }
        //红色代码注释开始
        list = null;
        //红色代码注释结束
        System.gc();
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("已经测试了"+(++i)+"秒");
        }
    }

}
class Company{
    private String name;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("回收Company");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
