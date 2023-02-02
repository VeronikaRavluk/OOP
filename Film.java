public class Film extends Movies{
    private String genre;

    public Film(String name, String country, double rate, int budget, String genre) {
        super(name, country, rate, budget);
        this.genre = genre;
    }

    public Film(String name, String country, String genre) {
        super(name, country);
        this.genre = genre;
    }

    @Override
    public void group(int people){
        double sale;
        if (people > 5 && people <= 10){
            sale = 0.1;
            System.out.println("Група людей: "+people);
            System.out.println("З урахуванням знижки: "+(getPrice()-(getPrice()*sale)));
        }else if (people > 10){
            sale = 0.2;
            System.out.println("Група людей: "+people);
            System.out.println("З урахуванням знижки: "+(getPrice()-(getPrice()*sale)));
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
