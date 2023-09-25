package Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Shop {
    private List<Product> products;

    /**
     * Метод инициализирует список продуктов
     * @param num - заданное число продуктов
     * @return
     */
    public static List<Product> initShop(int num) {
        //Random rnd = new Random();
        String[] names = new String[] {"prod1","prod2","prod3","prod4","prod5","prod6","prod7","prod8","prod9","prod10"};
        Integer[] costs = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        List<Product> mylist = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            //mylist.add(new Product(names[rnd.nextInt(10)],rnd.nextInt(100,200)));
            mylist.add(new Product(names[i],costs[i]));
        }
        return mylist;
    }


    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Метод должен вернуть отсортированный по возрастанию по цене список продуктов
     * @return
     */
    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        Collections.sort(products, new ProductComparator());
        return products;
    }

    /**
     * Метод возвращает отсортированный по убыванию цены список продуктов
     * @return
     */
    public List<Product> sortProductsByPriceDesc() {
        // Допишите реализацию метода самостоятельно
        Collections.sort(products, new ProductComparator().reversed());
        return products;
    }

    /**
     * Метод должен вернуть самый дорогой продукт
     * @return
     */
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        products = sortProductsByPriceDesc();
        return products.get(0);
    }

}