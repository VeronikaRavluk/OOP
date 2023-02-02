public class Dispatching implements Dispatch{
    Cartoon cartoon1 = new Cartoon("Скубі-Ду", "США", 5, 2_500_000);
    Film film1 = new Film("Кіборги","Україна", 3.5, 4_500_000, "Бойовик");
    Serial serial1 = new Serial("Слуга Народу","Україна", "Комедія",5, 2_300_000);

    Cartoon cartoon2 = new Cartoon("Джоні Тест", "США");
    Film film2 = new Film("Півтора Шпіона","США", "Бойовик");
    Serial serial2 = new Serial("Друзі","США", "Комедія");

    @Override
    public void menu(int number) {
        if (number==1){
            System.out.println("Назва мультфільму: "+cartoon1.getName());
            cartoon1.ticketCost();
            cartoon1.menu("попкорн(солений)", "пепсі(0,5)");
            cartoon1.sumCost();
            cartoon1.group();
            System.out.println("-------------------------------------------------------");
            System.out.println("Щоб заробити з продажу мультфільму потрібно "+ cartoon1.countSeans() + " сеансів");
        }else  if (number==2){
            System.out.println("Назва фільму: "+film1.getName());
            film1.ticketCost();
            film1.menu("попкорн(солодкий)");
            film1.sumCost();
            film1.group(8);
            System.out.println("-------------------------------------------------------");
            System.out.println("Щоб заробити з продажу фільму потрібно "+film1.countSeans()+" сеансів");
        }else  if (number==3){
            System.out.println("Назва серіалу: "+serial1.getName());
            System.out.println("Його можна глянути на сайті: "+serial1.SITE);
            System.out.println("-------------------------------------------------------");
        }else  if (number==4){
            System.out.println("Мультфільм вийде скоро, тому його можна глянути на сайті: " + cartoon2.SITE);
        }else  if (number==5){
            System.out.println("Фільм вийде скоро, тому його можна глянути на сайті: " + film2.SITE);
        }else  if (number==6){
            System.out.println("Cеріал вийде скоро, тому його можна глянути на сайті: " + serial2.SITE);
        }else {
            System.out.println();
            System.out.println("Помилка!");
        }
    }
}
