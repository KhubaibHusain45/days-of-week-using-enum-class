package Questions.Question96;

public class MainOne {
    public static void main(String[] args) {
        System.out.println("Days of week are: ");
        for (enumDays day : enumDays.values()) {
            System.out.println(day.name() + " is a " + day.getTypeofDay());
        }
    }
}
