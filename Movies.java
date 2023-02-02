public class Movies extends MoviesGroup{
    private String name;
    private String country;
    private double rate;
    private int budget;
    private int price;
    private int priceMenu = 0;
    public final int VISITORS = 250;
    public final String SITE = "veronika.com";

    public Movies(String name, String country, double rate, int budget) {
        this.name = name;
        this.country = country;
        this.rate = rate;
        this.budget = budget;
    }

    public Movies(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public void ticketCost(){
        if(budget<=1_000_000){
            price = 100;
            System.out.println("Ціна білета: " + price);
        }else if(budget<=2_500_000){
            price = 150;
            System.out.println("Ціна білета: " + price);
        }else{
            price = 200;
            System.out.println("Ціна білета: " + price);
        }
    }
    public int countSeans(){
        if(budget<=1_000_000){
            price = 100;
        }else if(budget<=2_500_000){
            price = 150;
        }else{
            price = 200;
        }
        return Math.round(budget/price/VISITORS)+1;
    }
    public void menu(String... item){
        System.out.print("Меню: ");
        for(String iteration : item){
            System.out.print(iteration + "; ");
            if (iteration.equals("попкорн(солодкий)")){
                priceMenu += 150;
            }else if (iteration.equals("попкорн(сирний)")){
                priceMenu += 150;
            }else if (iteration.equals("попкорн(солений)")){
                priceMenu += 100;
            }else if(iteration.equals("пепсі(0,3)")){
                priceMenu += 50;
            }else if(iteration.equals("пепсі(0,5)")) {
                priceMenu += 70;
            }
        }
        System.out.println();
    }
    public void sumCost(){
        System.out.println("Bартість меню: "+priceMenu);
        System.out.println("Загальна вартість: "+(price+priceMenu));
    }
    public void group(){
        System.out.println("Для вас не має знижок!");
    }

    public void subscribeCost(){
        System.out.println("Забонювати перегляд мультфільму '"+name+"' можна тут: "+ SITE);
        System.out.println("Ціна бронювання: " + 100);
    }

    @Override
    void group(int people) {

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

    public int getPriceMenu() {
        return priceMenu;
    }

    public void setPriceMenu(int priceMenu) {
        this.priceMenu = priceMenu;
    }
}
