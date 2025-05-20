package Questions.Question96;

public enum enumDays {
    MONDAY("week day"),
    TUESDAY("week day"),
    WEDNESDAY("week day"),
    THURSDAY("week day"),
    FRIDAY("week day"),
    SATURDAY("weekend"),
    SUNDAY("weekend");

    private String typeofDay;

    enumDays(String typeofDay) {
        this.typeofDay = typeofDay;
    }
    public String getTypeofDay() {
        return typeofDay;
    }
}
