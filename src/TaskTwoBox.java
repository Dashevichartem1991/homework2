public class TaskTwoBox {

    private final Integer height;
    private final Integer lenght;
    private final Integer width;

    TaskTwoBox(Integer height, Integer lenght, Integer width){
        this.height = height;
        this.lenght = lenght;
        this.width = width;

    }
    public void definition(){
        if(height.equals(lenght) && height.equals(width)){
            System.out.println("Это куб");
        } else if(height == 0){
            System.out.println("Это конверт");
        }else{
            System.out.println("Это обычная коробка");
        }
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
