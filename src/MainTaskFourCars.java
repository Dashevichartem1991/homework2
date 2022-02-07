public class MainTaskFourCars {
    public static void main(String[] args) {
        TaskFourCars firstCar = new TaskFourCars("audi", "red");
        TaskFourCars secondCar = new TaskFourCars("bmw", "yellow");
        TaskFourCars threeCar = new TaskFourCars("kia", "gray");


        System.out.println(firstCar.getColor() + " " + firstCar.getModel());
        System.out.println(secondCar.getColor() + " " + secondCar.getModel());
        System.out.println(threeCar.getColor() + " " + threeCar.getModel());

        firstCar.setColor("blue");
        secondCar.setColor("black");
        threeCar.setColor("red");

        System.out.println(firstCar.getColor() + " " + firstCar.getModel());
        System.out.println(secondCar.getColor() + " " + secondCar.getModel());
        System.out.println(threeCar.getColor() + " " + threeCar.getModel());


    }
}
