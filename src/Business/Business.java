package Business;

public class Business{


        private String title;
        private String author;
        private double price;
        private int Year;


        public Business() {
            this.title = "Abnl Storys";
            this.author = "David Jones";
            this.price = 999.99;
            this.Year = 2030;
        }


        public Business(String title, String author, double price, int Year) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.Year = Year;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }


        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return Year;
        }

        public void setYear(int Year) {
            this.Year = Year;
        }
        public String toString(){
            return "{" + "title:" +title + " Author:" + author +" price: " + price  + " year:" + Year + "}";
        }
    }
