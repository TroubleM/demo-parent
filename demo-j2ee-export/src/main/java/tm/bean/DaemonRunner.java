package tm.bean;

import java.util.Map;

/**
 * @auther: zhangyi
 * @date: 2019/4/2
 * @Description: 支持型线程类
 */
public class DaemonRunner implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("你看我有戏");
        }
    }

}
