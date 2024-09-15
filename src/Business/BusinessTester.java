package Business;

public class BusinessTester {
    public static void main(String[] args) {
        Business textbook1 = new Business();
        System.out.println(textbook1);
        Business textbook2 = new Business();
        textbook2.setAuthor("Jason");
        textbook2.setPrice(999999.99);
        textbook2.setTitle("GravityFalls");
        textbook2.setYear(2040);
        System.out.print(textbook2);
        Business textbook3 = new Business("Story of lily", "Lilien Smith", 100.00, 2080);
        String tb3t = textbook3.getTitle();
        String tb3a = textbook3.getAuthor();
        double tb2 = textbook2.getPrice();
        int tb1 = textbook1.getYear();
        System.out.print("{" + "title:" + tb3t + " Author:" + tb3a +" price: " + tb2  + " year:" + tb1 + "}");

    }
}
