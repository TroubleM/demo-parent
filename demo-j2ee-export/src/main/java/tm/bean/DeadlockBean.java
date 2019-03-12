package tm.bean;

public class DeadlockBean {

    private static String A = "A";

    private static String B = "B";

    public void deadlock(){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A){
                    try {
                        System.out.println("线程1");
                        Thread.sleep(2000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (B){
                        System.out.println("测试1");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    synchronized (A) {
                        System.out.println("线程2");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
