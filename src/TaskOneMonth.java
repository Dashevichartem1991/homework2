public enum TaskOneMonth {
    JANUARY("January",1),
    FEBRUARY("February", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5),
    JUNE("June", 6),
    JULY("July", 7),
    AUGUST("August", 8),
    SEPTEMBER("September", 9),
    OCTOBER("October", 10),
    NOVEMBER("November", 11),
    DECEMBER("December", 12),

    ;


    private final String name;
    private final Integer number;

    TaskOneMonth(String name, Integer number){
        this.name = name;
        this.number = number;
    }

    public static String getNumberByMonth(Integer someNumber){
        for (TaskOneMonth values: values()) {
            if (values.number.equals(someNumber)){
                return values.name;
            }
        }
        return null;
    }

    public static Integer getMonthByNumber(String someMonth){
        for (TaskOneMonth values: values()) {
            if(values.name.equals(someMonth)){
                return values.number;
            }

        }
        return null;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

}
