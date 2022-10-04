public class ComputeEmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int wagePerHour = 20;
        int fullDayHour = 8;
        double random = Math.random();
        if (random > .5) {
            System.out.println("Employee is present");
            System.out.println("Daily wage is : " + wagePerHour * fullDayHour);
        } else {
            System.out.println("Employee is absent");
        }
    }
}