public class TaskTwoBox {

    private  Integer height;
    private  Integer lenght;
    private  Integer width;


    public TaskTwoBox(Integer height, Integer lenght, Integer width) {
        this.height = height;
        this.lenght = lenght;
        this.width = width;
        if (height.equals(lenght) && height.equals(width)) {
            System.out.println("Это куб");
        }  else {
            System.out.println("Это обычная коробка");
        }
    }
    public TaskTwoBox(Integer lenght, Integer width){
        this.lenght = lenght;
        this.width = width;
        System.out.println("Это конверт");
    }







    public Integer getHeight() {
        return height;
    }

    public Integer getLenght() {
        return lenght;
    }

    public Integer getWidth() {
        return width;
    }
}
