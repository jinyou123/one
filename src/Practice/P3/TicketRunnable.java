package Practice.P3;

public class TicketRunnable implements Runnable {

    private int num = 50;//票源

    //同步语句块：粒度细
    public void run() {
        while (num > 0) {
            synchronized (this) {
                //限制最后一张票时，同时进入循环等待的线程
                if(num>0){
                    System.out.println( "售票员【" + Thread.currentThread().getName() + "】售出票号NO." + num );
                    num--;
                }

            }

        }

    }
    //同步方法：粒度粗（范围广）
    /*public  synchronized  void run() {
        while (num > 0) {
            System.out.println("售票员【"+Thread.currentThread().getName()+"】售出票号NO."+num);
            num--;
        }

    }*/

}
