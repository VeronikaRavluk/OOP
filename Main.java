public class Main {
    public static void main(String[] args) {
        Action.setSeason("Осінь");
        Action.setPercent(20);
        Dispatching ds = new Dispatching();
        ds.menu(1);
        ds.menu(2);
        ds.menu(3);
        ds.menu(4);
        ds.menu(5);
        ds.menu(6);
        ds.menu(7);
    }
}