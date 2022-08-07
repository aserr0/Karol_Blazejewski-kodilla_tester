public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;
        System.out.println(year);
        if (year % 400 == 0) {
            System.out.println("this is leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("this is leap year");
        } else {
            System.out.println("this is not leap year");
        }
    }
}