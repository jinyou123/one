package Practice.生产消费;

public class Test {
    public static void main(String[] args) {
        //造一间仓库
        Store store = new Store();

        //生产商
        Producer p1 = new Producer( store );
        p1.start();
        Producer p2 = new Producer( store );
        p2.start();
        Producer p3 = new Producer( store );
        p3.start();

        //消费者
        Customer c1 = new Customer( store );
        c1.start();
        Customer c2 = new Customer( store );
        c2.start();
    }
}
