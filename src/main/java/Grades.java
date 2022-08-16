public class Grades {
    public static void main(String[] args) {

        int[] grades = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        sum/= grades.length;
        System.out.println(sum);
        }

        public int[] grades;
        int size;

        public Grades() {
            this.grades = new int[10];
            this.size = 0;
        }

        public void add(int value) {
            if (this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;
        }
}







