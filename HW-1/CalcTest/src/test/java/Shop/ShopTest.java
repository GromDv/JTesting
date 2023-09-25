package Shop;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тесты для класса Shop
 */
public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Shop myShop = new Shop();
        // Изначально 10 продуктов отсортированы по возрастанию цены
        myShop.setProducts(Shop.initShop(10));

        // У бедимся что список не пустой, длина 10, отсортирован по возрастанию
        assertThat(myShop.getProducts())
                .isNotEmpty()
                .hasSize(10)
                .isSortedAccordingTo(new ProductComparator());

        // Отсортируем по убыванию цены
        myShop.setProducts(myShop.sortProductsByPriceDesc());

        // Убедимся в работоспособности метода
        assertThat(myShop.getProducts()).isSortedAccordingTo(new ProductComparator().reversed());

        // Найдем самый дорогой продукт
        Product maxCost = myShop.getMostExpensiveProduct();
        // Убедимся, что он в начале списка по убыванию цены
        assertThat(myShop.getProducts().get(0)).isEqualTo(maxCost);
    }

}