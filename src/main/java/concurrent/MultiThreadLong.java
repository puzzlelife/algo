package concurrent;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/5/5 12:43
 *
 * 32位java虚拟机中运行会有数据输出
 */
public class MultiThreadLong {
    public static long t=0;
    public static class ChangeT implements Runnable{
        private long to;
        public ChangeT(long to){
            this.to=to;
        }
        @Override
        public void run() {
            while (true){
                MultiThreadLong.t=to;
                Thread.yield();
            }
        }
    }

    public static class ReadT implements Runnable{
        @Override
        public void run() {
            while (true){
                long t=MultiThreadLong.t;
                if (t!=111L && t!=-999 && t!=333L && t!= -444L){
                    System.out.println(t);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ChangeT(111L)).start();
        new Thread(new ChangeT(-999L)).start();
        new Thread(new ChangeT(333L)).start();
        new Thread(new ChangeT(-444L)).start();
        new Thread(new ReadT()).start();
    }
}
