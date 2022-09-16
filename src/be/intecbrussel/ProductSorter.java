package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductSorter {

    private List<Product> products;
    private List<FoodProduct> foodProducts;
    private List<HealthProduct> healthProducts;
    private List<ElectricProduct> electricProducts;

    public ProductSorter() {
        electricProducts = new ArrayList<>();
        healthProducts = new ArrayList<>();
        foodProducts = new ArrayList<>();
        products = new ArrayList<>();
    }


    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public void sortProduct(Product product) {

        products.add(product);

        if (product instanceof FoodProduct) {
            foodProducts.add((FoodProduct) product);
        }
        if (product instanceof HealthProduct) {
            healthProducts.add((HealthProduct) product);
        }
        if (product instanceof ElectricProduct) {
            electricProducts.add((ElectricProduct) product);
        }

    }

    public void printAmountOfProducts() {
        System.out.println("\nYou have " + products.stream().count() + " in your productslist.\n");
//        products.sort(Comparator.comparing(Product::getProductID));
//        System.out.println(products.toString());
        //added sorting and print to check for duplicates
    }

}
