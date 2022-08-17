public class User {


    public int length;
    public String name;
    public int age;
    public User(String name, int age, int length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public User(String name, int age) {
    }

    public static void main(String[] args) {

        String[] User = new String[6];
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int result = 0;
        for (int i = 0; i < User.length; i++) {
            result = Integer.parseInt(String.valueOf(result + i));
        System.out.println(users[2]);
        }
    }

}
