package tm;

import org.junit.Test;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @auther: zhangyi
 * @date: 2019/2/14
 * @Description: jdk原生新特性，新api使用示例-----
 * 注：手动调用垃圾回收也不一定会立刻执行一次回收
 */
public class ApplicationTest {

    /**
     * @Author zhangyi
     * @Description: 强引用示例
     * @Date  2019/2/14
     * @return void
     **/
    @Test
    public void test1(){

        //建立强引用
        Object object = new Object();

        Object[] objects = new Object[2];

        //手动执行Gc回收
        System.gc();

        //此时不会被回收，甚至OOM也不会被回收

        System.out.println(object);

        System.out.println(objects);

        //结束强引用

        object = null;

        objects = null;

        System.out.println(object);

        System.out.println(objects);
    }

    /**
     * @Author zhangyi
     * @Description: 弱引用
     * @Date  2019/2/14
     * @return void
     **/
    @Test
    public void test2(){

        //建立弱引用
        WeakReference<Object> weakReference = new WeakReference<>(new Object());

        System.out.println(weakReference.get());

        //手动执行Gc回收,此时已被回收
        System.gc();

        System.out.println(weakReference.get());

    }

    /**
     * @Author zhangyi
     * @Description: 软引用
     * @Date  2019/2/14
     * @return void
     **/
    @Test
    public void test3(){
        //建立软引用
        SoftReference<Object> softReference = new SoftReference<>(new Object());

        System.out.println(softReference.get());

        //手动执行Gc回收
        System.gc();

        //此时不会被回收，当且仅当内存不足时被回收
        System.out.println(softReference.get());

    }

    /**
     * @Author zhangyi
     * @Description: 虚引用，在任何时候都会被Gc回收
     * @Date  2019/2/14
     * @return void
     **/
    @Test
    public void test4(){

    }

}
