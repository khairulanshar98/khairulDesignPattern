/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.khairulanshar.designpattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khairulanshar
 */
public class Meal implements MealInterface {

    private final List<Item> items = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public float getCost() {
        float cost = 0.0f;
        /*
        for (Item item : items) {
            cost += item.price();
        }
        */
        cost = items.stream().map((item) -> item.price()*item.count()).reduce(cost, (accumulator, amount) -> accumulator + amount);
        return cost;
    }

    @Override
    public void showItems() {
        /*
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
        
        items.stream().map((item) -> {
            System.out.print("Item : " + item.name());
            return item;
        }).map((item) -> {
            System.out.print(", Packing : " + item.packing().pack());
            return item;
        }).forEach((item) -> {
            System.out.println(", Price : " + item.price());
        });
        */
        items.stream().forEach((item) -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }

    @Override
    public int getCount() {
        int count = 0;
        
        count = items.stream().map((item) -> item.count()).reduce(count, (accumulator, _count) -> accumulator + _count);
        return count;
    }
}
