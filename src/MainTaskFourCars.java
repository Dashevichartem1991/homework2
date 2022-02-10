public class MainTaskFourCars {
    public static void main(String[] args) {
        TaskFourCarTest firstCar = TaskFourCarTest.AUDIBLUE;


        System.out.println(firstCar.getColor() + " " + firstCar.getModel());

        firstCar.setColor("yellow");


        System.out.println(firstCar.getColor() + " " + firstCar.getModel());


    }
}
