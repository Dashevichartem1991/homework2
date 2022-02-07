public class TaskThreeCollect {
    private Integer someNumber;
    private Integer count = 1;


    TaskThreeCollect(Integer someNumber){
        this.someNumber = someNumber;
        this.count = count;
    }

    public Integer addNumber(Integer number){
        someNumber += number;
        count++;
        return null;
    }
    public void calculating(){
        System.out.println("Среднее значение = " + (Double.valueOf(someNumber) / Double.valueOf(count)));

    }

    public Integer getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(Integer someNumber) {
        this.someNumber = someNumber;
    }

    public Integer getCount() {
        return count;
    }
}
