package be.intecbrussel;

public class App {
    public static void main(String[] args) {

        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);
        productFactory.createProducts(100);

        productSorter.printAmountOfProducts();

        System.out.println(productSorter.getFoodProducts().toString());
        System.out.println(productSorter.getHealthProducts().toString());
        System.out.println(productSorter.getElectricProducts().toString());


    }
}
