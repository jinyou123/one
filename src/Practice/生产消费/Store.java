package Practice.生产消费;

public class Store {
    final int MAX_COUNT =50;//最大容量
    int currentCount;//当前容量

    //入库
    public void in(){
        System.out.println("入库前库存量"+currentCount);
        currentCount++;
        System.out.println("入库后库存量"+currentCount);

    }
    //出库
    public void out(){
        System.out.println("出库前库存量"+currentCount);
        currentCount--;
        System.out.println("出库后库存量"+currentCount);

    }
}
