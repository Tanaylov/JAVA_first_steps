package ru.tasksSeminar3.task_1.T1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Oil", "Italy", 11);
        Product product2 = new Product("Corn", "Russia", 13);
        Product product3 = new Product("Potato", "Belarus", 7);
        Product product4 = new Product("Wood", "Brazil", 19);
        Product product5 = new Product("Leather", "SOA", 235);
        Product product6 = new Product("Leather", "China", 202);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        System.out.println("productList = " + productList);
        Scanner scanner = new Scanner(System.in);
        String searchProduct = scanner.nextLine();
        List<String> res = getCountriesAndSumValue(productList, searchProduct);
        System.out.println("res = " + res);
        int sum = Integer.parseInt(res.get(res.size() - 1));
        System.out.println("sum = " + sum);
    }

    /**
     * @apiNote Создаёт список из стран по искомому товару и в конце добовляет элемент ввиде суммы объёма данного товара
     * @param productList
     * @param searchProduct
     * @return List<String> из стран, последний жлемент - сумма (общий объём товара по данным странам).
     */
    private static List<String> getCountriesAndSumValue(List<Product> productList, String searchProduct) {
        List<String> countries = new ArrayList<>();
        int sumValue = 0;
        for (Product productName : productList) {
             if (productName.getName().equalsIgnoreCase(searchProduct)){
                 countries.add(productName.getCountryFrom());
                 sumValue += productName.getQuantity();
             }
        }
        countries.add(Integer.toString(sumValue));
        return countries;
    }
}