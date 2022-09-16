package be.intecbrussel;

import java.util.Random;

public class ProductFactory {

    private ProductSorter productSorter;
    private String[] foodProducts = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face Cream", "Vitamins", "Eye Drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair Dryer", "Vacuum", "Mixer", "Washing Machine", "Dishwasher"};
    private boolean[] uniqueIDProblemSolver;

    public ProductFactory(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }

    public void createProducts(int amount) {
        uniqueIDProblemSolver = new boolean[150];
        int counter = 0;
        Random random = new Random();
        while (counter != amount) {
            int intForProductSort = random.nextInt(3);
            int intForProductType = random.nextInt(5);
            int intForProductID = random.nextInt(1,150);
            while (uniqueIDProblemSolver[intForProductID]){
                intForProductID = random.nextInt(1,150);
            }
            uniqueIDProblemSolver[intForProductID] = true;

            switch (intForProductSort) {
                case 0:
                    productSorter.sortProduct(new FoodProduct(foodProducts[intForProductType], intForProductID));
                    break;
                case 1:
                    productSorter.sortProduct(new HealthProduct(healthProducts[intForProductType], intForProductID));
                    break;
                case 2:
                    productSorter.sortProduct(new ElectricProduct(electricProducts[intForProductType], intForProductID));
                    break;
                default:
                    System.out.println("bruh");
            }
            counter++;
        }
    }

    public ProductSorter getProductSorter() {
        return productSorter;
    }

    public void setProductSorter(ProductSorter productSorter) {
        this.productSorter = productSorter;
    }
}
