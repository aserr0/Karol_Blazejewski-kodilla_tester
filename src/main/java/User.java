import java.util.Random;

public class User {


    public int length;
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumbers = random.nextInt(5000) + 1;

        String[] User = new String[6];
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int result = 0;
        float totalAge = 187;

        for (int i = 0; i < 1; i++) {
            result = Integer.parseInt(String.valueOf(result + i));
            System.out.println(users[0].name + " age" + " " + users[0].age);
            System.out.println(users[1].name + " age" + " " + users[1].age);
            System.out.println(users[2].name + " age" + " " + users[2].age);
            System.out.println(users[3].name + " age" + " " + users[3].age);
            System.out.println(users[4].name + " age" + " " + users[4].age);
            System.out.println(users[5].name + " age" + " " + users[5].age);
            System.out.println(users[0].age + users[1].age + users[2].age + users[3].age + users[4].age + users[5].age + " " + "total age of users ");

            totalAge /= users.length;
            System.out.println("avg total age of all users" + " " + totalAge);

            for (i = 0; i <= 0; i++) {
                int x = randomNumbers();
                {
                    System.out.println(randomNumbers);
                }
                if (i <= 30) {
                    System.out.println("number is lower than 30" + " " + x);
                } else {
                    System.out.println("number is higher than 30" + " " + x);
                }
            }
        }
    }

    private static int randomNumbers() {
        return 0;
    }
}