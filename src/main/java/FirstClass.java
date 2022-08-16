public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2022);
        System.out.println("Notebook.weight: " + notebook.weight);
        System.out.println("Notebook.price: " + notebook.price);
        System.out.println("Notebook.year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.setYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2021);
        System.out.println("Notebook.weight: " + heavyNotebook.weight + " " + "Notebook.price: " + heavyNotebook.price );
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.setYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2017);
        System.out.println("Notebook.weight: " + oldNotebook.weight);
        System.out.println("Notebook.price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.setYear();
    }
}