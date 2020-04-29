package com.greenfoxacademy.basicwebshop.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItems {
    private List<ShopItem> shopItems;


    public ShopItems() {
        this.shopItems = new ArrayList<>();

        ShopItem item1 = new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5);
        ShopItem item2 = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
        ShopItem item3 = new ShopItem("Coca cola", "0,5l standard coke", 25, 0);
        ShopItem item4 = new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100);
        ShopItem item5 = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1);

        shopItems.add(item1);
        shopItems.add(item2);
        shopItems.add(item3);
        shopItems.add(item4);
        shopItems.add(item5);
    }

    public void addShopItem(ShopItem shopItem) {
        shopItems.add(shopItem);
    }

    public List<ShopItem> getShopItems() {
        return shopItems;
    }

    public List<ShopItem> onlyAvaiable() {
        return shopItems.stream()
                .filter(x -> x.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> cheapestOrder() {
        return shopItems.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    public List<ShopItem> containsNike() {
        return shopItems.stream()
                .filter(x -> x.getDescription().contains("Nike") || x.getName().contains("Nike"))
                .collect(Collectors.toList());
    }

    public String averageStock() {
        return ("The average stock: " + (shopItems.stream()
                .max(Comparator.comparing(ShopItem::getPrice))
                .get()
                .getName()));
    }

    public String mostExpensive() {
        return ("The most expensive item " + (shopItems.stream()
                .max(Comparator.comparing(ShopItem::getPrice))
                .get()
                .getName()));
    }

    public List<ShopItem> search(String searchInput) {
        return shopItems.stream()
                .filter(x -> x.getDescription().toLowerCase().contains(searchInput.toLowerCase()) ||
                x.getName().toLowerCase().contains(searchInput.toLowerCase()))
                .collect(Collectors.toList());
    }
}
