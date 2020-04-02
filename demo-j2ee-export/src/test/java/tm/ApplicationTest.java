package tm;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.junit.Test;
import tm.bean.*;
import tm.bean.spi.ITestExecute;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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

    /**
     * @Author zhangyi
     * @Description: List自带索引，容器可以重复
     * @Date  2019/2/21
     * @Param []
     * @return void
     **/
    @Test
    public void test5(){
        List<Object> arrayList  = Lists.newArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add("1212");
        System.out.println(arrayList.get(2));

        //contains方法地址(==)相同或者equals为true满足其一即可
        System.out.println(arrayList.contains(new Integer(1)));

        List<Object> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add("1212");
        System.out.println(linkedList);

        System.out.println(linkedList.contains(1));
    }

    /**
     * @Author zhangyi
     * @Description: Set无索引，且容器不可重复数据
     * @Date  2019/2/21
     * @Param []
     * @return void
     **/
    @Test
    public void test6(){

        Set<Object> set = Sets.newHashSet();

        set.add(1);
        set.add(1);
        set.add("121");

        System.out.println(set);

        System.out.println(set.contains(new Integer(1)));

    }

    /**
     * @Author zhangyi
     * @Description: HashMap相关api操作
     * @Date  2019/2/21
     * @Param []
     * @return void
     **/
    @Test
    public void test7(){
        Map<String,Integer> map = Maps.newHashMap();

        System.out.println(map.put("1",1));

        System.out.println(map.put("1",1));

    }

    /**
     * @Author zhangyi
     * @Description: 自定义类覆写equals以及hashCode
     * @Date  2019/2/22
     * @Param []
     * @return void
     **/
    @Test
    public void test8(){
        Student student1 = new Student("1",2);
        Student student2 = new Student("2",2);

        List<Object> list= Lists.newArrayList();

        list.add(new Integer(11));

        System.out.println(list.contains(new Integer(11)));

        list.add(student1);

        System.out.println(list.contains(student2));

    }

    /**
     * @Author zhangyi
     * @Description: 此时finally里面的不会执行
     * @Date  2019/2/22
     * @Param []
     * @return void
     **/
    @Test
    public void test9(){
        int a = 1;

        System.out.println("12121212");


        try {
            System.out.println("我看你有戏");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println(a / 0);
            System.out.println("你看我有戏");
        }
    }

    /**
     * @Author zhangyi
     * @Description: ConcurrentHashMap不允许key和value为空，有则npe
     * @Date  2019/2/22
     * @Param []
     * @return void
     **/
    @Test
    public void test10(){

        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap();

        concurrentHashMap.put("1",new Object());

        System.out.println(concurrentHashMap.get(null));

    }

    /**
     * @Author zhangyi
     * @Description: LinkedHashMap事例,插入顺序有序
     * @Date  2019/2/22
     * @Param []
     * @return void
     **/
    @Test
    public void test11(){

        HashMap<String,Object> hashMap = Maps.newHashMap();

        hashMap.put("1","1");
        hashMap.put("7","7");
        hashMap.put("2","2");
        hashMap.put("6","6");
        hashMap.put("4","4");
        hashMap.put("5","5");
        hashMap.put("3","3");

        System.out.println(hashMap);

        LinkedHashMap<String,Object> linkedHashMap = Maps.newLinkedHashMap();

        linkedHashMap.put("1","1");
        linkedHashMap.put("7","7");
        linkedHashMap.put("2","2");
        linkedHashMap.put("6","6");
        linkedHashMap.put("4","4");
        linkedHashMap.put("5","5");
        linkedHashMap.put("3","3");

        System.out.println(linkedHashMap);

    }

    /**
     * @Author zhangyi
     * @Description: Cloneable接口应用
     * @Date  2019/2/22
     * @Param []
     * @return void
     **/
    @Test
    public void test12(){
        Student student = new Student();

        student.setName("121212");

        try {
            Student student1 = (Student) student.clone();
            System.out.println(student1);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * @Author zhangyi
     * @Description: TreeMap api
     * @Date  2019/2/26
     * @Param []
     * @return void
     **/
    @Test
    public void test13(){
        TreeMap<String ,Object> treeMap = Maps.newTreeMap();

        System.out.println(treeMap.put("123",123));
        System.out.println(treeMap.put("123",234));
    }

    /**
     * @Author zhangyi
     * @Description: TreeSet Api
     * @Date  2019/2/26
     * @Param []
     * @return void
     **/
    @Test
    public void test14(){
        Set<Comparable> treeSet = Sets.newTreeSet();

        System.out.println(treeSet.add("123"));
        System.out.println(treeSet.add("123"));

        System.out.println(treeSet.add(new Student("123",123)));
        System.out.println(treeSet.add(new Student("123",321)));

    }

    /**
     * @Author zhangyi
     * @Description: 模拟死锁
     * @Date  2019/3/4
     * @Param []
     * @return void
     **/
    @Test
    public void test15(){
        new DeadlockBean().deadlock();
    }

    /**
     * @Author zhangyi
     * @Description: 当进程中没有了非支持性线程，
     * 则虚拟机会终止并立即终止支持性线程，此时finally中的代码不一定会执行
     * @Date  2019/4/2
     * @Param []
     * @return void
     **/
    @Test
    public void test16(){
        Thread thread = new Thread(new DaemonRunner());
        thread.setDaemon(true);
        thread.start();
    }

    /**
     * @Author zhangyi
     * @Description: 自定义匿名回调方法
     * @Date  2019/11/28
     * @return void
     **/
    @Test
    public void test17(){
        TestAsynchronous testAsynchronous = new TestAsynchronous();
        System.out.println(testAsynchronous.sendMethod("我看你有戏", new ITestExecute() {
            @Override
            public Object execute(String text) {
                return "测试匿名回调，我看你有戏";
            }
        }));
    }

    @Test
    public void test18(){
        System.out.println(Integer.toBinaryString(1+2+4+8+16));
        System.out.println(Integer.toBinaryString(5));
    }

    @Test
    public void test19(){
        Integer a = 128;

        Integer b = 128;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        String c = "1";
        String d = "1";
        System.out.println(c == d);
        System.out.println(c.equals(d));

        Integer e = 123456;

        Integer f = 123456;
        System.out.println(e == f);
        System.out.println(e.equals(f));
    }

    @Test
    public void test20(){
        for (;;){
            System.out.println("123456789");
        }
    }

    @Test
    public void test21(){
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set1.add(i);
            set1.remove(i-1);
        }

        System.out.println(set1.size());

        Set<Integer> set3 = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set3.add(i);
            set3.remove(i-1);
        }
        System.out.println(set3.size());

    }

    @Test
    public void test22(){
        Object i = 1 == 1 ? new Integer(3) : new Float(1);
        System.out.println(i);
    }

    @Test
    public void test23(){
        Map<String, Object> map = Maps.newHashMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        Set<String> keies = map.keySet();
        keies.remove("1");
    }

    @Test
    public void test24(){
        List<Object> list = Lists.newArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
    }

    @Test
    public void test25(){
        String a = new String();
        List<String> b = Lists.newArrayList();

    }

    @Test
    public void test26(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

}
