public class MainTaskThreeCollect {
    public static void main(String[] args) {
        TaskThreeCollect x = new TaskThreeCollect(15);
        System.out.println(x.getCount() + " " + x.getSomeNumber());

        x.addNumber(12);
        x.addNumber(11);
        x.addNumber(11);

        System.out.println(x.getCount() + " " + x.getSomeNumber());

        x.calculating();


    }
}
