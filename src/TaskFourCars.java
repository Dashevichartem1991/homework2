public class TaskFourCars {
    private String model;
    private String color;

    TaskFourCars(String model, String color){
        this.color = color;
        this.model = model;
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
