public class Main {
    public static void main(String[] args) {
        int priceTicket = 999;
        int priceForMile = 20;
        int bonusMiles = priceTicket / priceForMile;

        System.out.println("Стоимость билета: " + priceTicket + " руб.");
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
