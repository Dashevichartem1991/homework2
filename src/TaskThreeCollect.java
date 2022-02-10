public class TaskThreeCollect {
    private Integer someNumber;
    private Integer count = 0;
    private Integer[] memory = new Integer[5];
    private Integer sum;



    TaskThreeCollect(Integer someNumber){
        this.someNumber = someNumber;


    }

    public Integer addNumber(Integer number){
        count++;

        if(count <= 4) {
            memory[count] = number;
        }else{
            count = 0;
            memory[count] = number;

        }


        return null;
    }
    public void calculating(){
        sum = 0;
        for (int i = 0; i < memory.length; i++) {

            sum += memory[i];
            System.out.println(sum);
        }
        System.out.println("Среднее значение = " + (Double.valueOf(sum) / 5));

    }

    public Integer getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(Integer someNumber) {
        this.someNumber = someNumber;
    }

    public Integer[] getMemory() {
        return memory;
    }

    public Integer getSum() {
        return sum;
    }

    public Integer getCount() {
        return count;
    }
}
