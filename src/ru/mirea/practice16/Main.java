package ru.mirea.practice16;

public class Main {
    public static void main(String[] args) {
        OrderManager k = new OrderManager();
        Dish[] d1 = new Dish[] {new Dish(100,"Суп", "куриный"),
                new Dish(80,"Борщ", "со сметаной"),
                new Dish(150,"Стейк", "свиной"),
                new Dish(120,"Кебаб", "говяжий"),
        };
        RestaurantOrder od1 = new RestaurantOrder(d1);
        k.add(od1,1);
        k.add("1 стол",od1);
        String[] result = k.getOrders(1).dishesNames();
        for (String it: result)
            if (it != null)
                System.out.println(it);
        System.out.println(k.ordersCostSummary());
        System.out.println();
        System.out.println("  HashMap");
        System.out.println();
        String[] result2 = k.getOrders("1 стол").dishesNames();
        for (String it: result2)
            if (it != null)
                System.out.println(it);
        System.out.println(k.ordersCostSummary());
        System.out.println();
        System.out.println("Drink");
        System.out.println();
        Drink[] d2 = new Drink[] {new Drink(40,"Чай", "зеленый"),
                new Drink(50,"Кофе", "капучино"),
                new Drink(30,"Пепси", "max"),
                new Drink(40,"Чай", "черный"),
        };
        InternetOrder od2 = new InternetOrder(d2);
        String[] result3 = od2.dishesNames();
        for (String it: result3)
            if (it != null)
                System.out.println(it);
        System.out.println(od2.costTotal());
    }
}

