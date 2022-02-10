public class MainTaskThreeCollect {
    public static void main(String[] args) {
        TaskThreeCollect x = new TaskThreeCollect(5);
        System.out.println(x.getCount() + " " + x.getSomeNumber());


        x.addNumber(10);
        x.addNumber(10);
        x.addNumber(10);
        x.addNumber(10);
        x.addNumber(10);
        x.addNumber(40);



        System.out.println(x.getCount() + " " + x.getSum());

        x.calculating();


    }
}
