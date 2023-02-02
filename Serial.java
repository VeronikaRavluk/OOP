public class Serial {
    private String name;
    private String country;
    private String genre;
    private double rate;
    private int budget;
    private int price;
    public final String SITE = "veronika.com";

    public Serial(String name, String country, String genre, double rate, int budget) {
        this.name = name;
        this.country = country;
        this.genre = genre;
        this.rate = rate;
        this.budget = budget;
    }

    public Serial(String name, String country, String genre) {
        this.name = name;
        this.country = country;
        this.genre = genre;
    }

    public void subscribeCost(){
        System.out.println("Забонювати перегляд серіалу '"+name+"' можна тут: "+SITE);
        System.out.println("Ціна бронювання: " + 70);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
