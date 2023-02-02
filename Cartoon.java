public class Cartoon extends Movies{

    public Cartoon(String name, String country, double rate, int budget) {
        super(name, country, rate, budget);
    }

    public Cartoon(String name, String country) {
        super(name, country);
    }

    @Override
    public void group(int people){
        double sale;
        if (people < 3 ){
            sale = 0.1;
            System.out.println("Кількість дітей: "+people);
            System.out.println("З урахуванням знижки на їжу: "+(getPrice()-(getPriceMenu()*sale)));
        }else {
            sale = 0.2;
            System.out.println("Кількість дітей: "+people);
            System.out.println("З урахуванням знижки на їжу: "+(getPrice()-(getPriceMenu()*sale)));
        }
    }
}
