public class Action {
    private static String season;
    private static int percent;

    private static void discount(String season){
        if(season.equals("Літо")){
            System.out.println("Літні знижки: " + getPercent() +"%");
        }else if(season.equals("Осінь")){
            System.out.println("Осінні знижки: " + getPercent() +"%");
        }else if(season.equals("Весна")){
            System.out.println("Весняні знижки: " + getPercent() +"%");
        }else {
            System.out.println("Зимові знижки: " + getPercent() +"%");
        }
    }

    public static void getDiscount(String season){
        discount(season);
    }

    public static String getSeason() {
        return season;
    }

    public static void setSeason(String season) {
        Action.season = season;
    }

    public static int getPercent() {
        return percent;
    }

    public static void setPercent(int percent) {
        Action.percent = percent;
    }
}
