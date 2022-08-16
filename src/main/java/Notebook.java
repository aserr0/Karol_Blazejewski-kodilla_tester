public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if (this.price > 600 && this.price <=1000) {
            System.out.println("This notebook is good price.");

        }
        else {
            System.out.println("This notebook is expensive.");
        }

    }

    public void checkWeight() {
        if (this.weight <1000) {
        System.out.println("this notebook is light");
        }
        else if (this.weight >1000 && this.weight<=1999) {
            System.out.println("this notebook is regular weight");
        }
        else {
            System.out.println("this notebook is heavy");
        }
    }
    public void setYear() {
    if (this.year == 2017 && this.price <1000 ) {
        System.out.println("this is oldNotebook ");
        }
    else if (this.year == 2021 && this.price <=1500) {
        System.out.println("this is heavyNotebook ");
        }
    else {
            System.out.println("this is newNotebook ");
        }
    }

}
