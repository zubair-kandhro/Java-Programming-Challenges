public class EnergyDrinkConsumption {
    public static void main(String[] args){

        int customers = 12467;
        double purchaseOneOrMore = customers * 0.14;
        double purchaseCitrusFlavored = customers * 0.64;
        System.out.printf("The approximate number of customers who purchase one or more drinks: %.0f", purchaseOneOrMore);
        System.out.println();
        System.out.printf("The approximate number of customers who prefer citrus-flavored energy drinks: %.0f", purchaseCitrusFlavored);
    }
}
