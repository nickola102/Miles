public class Main {
    public static void main(String[] args) {
        int cost = 5_575; // стоимость авиабилета
        int mile = 20; // количество рублей для одной бонусной мили

        int bonus = cost / mile; // количество бонусных миль

        System.out.println((bonus) + "  бонусных миль");

    }

}
