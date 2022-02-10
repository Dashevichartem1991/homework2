public enum TaskFourCarTest {
    AUDIBLUE("AUDI", "Blue"),
    AUDIRED("AUDI","Red"),
    AUDIGREEN("AUDI", "Green"),
    BMWORANGE("BMW","Orange"),
    BMWBLACK("BMW", "Black"),
    BMWVIOLET("BMW", "Violet"),
    KIAYELLOW("KIA","Yellow"),
    KIAWHITE("KIA", "White"),
    KIAGRAY("KIA", "Gray"),

    ;

    private  String model;
    private  String color;

    TaskFourCarTest(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        if(model.equalsIgnoreCase("audi") && (color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Green"))){
            this.color = color;
        }
        if(model.equalsIgnoreCase("bmw") && (color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("black") || color.equalsIgnoreCase("violet"))){
            this.color = color;
        }
        if(model.equalsIgnoreCase("kia") && (color.equalsIgnoreCase("yellow") || color.equalsIgnoreCase("white") || color.equalsIgnoreCase("gray"))){
            this.color = color;
        }
    }
}
