package gildedrose;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private Item[] items;
    private List<IStrategy> listStrategy;

    public Item[] getItems() {
        return items;
    }

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Conjured Mana Cake", 3, 6)
        };

        listStrategy = new LinkedList<>();

        Strategy1 s1 = new Strategy1();
        Strategy2 s2 = new Strategy2();
        Strategy3 s3 = new Strategy3();

        listStrategy.add(s1);
        listStrategy.add(s2);
        listStrategy.add(s3);

    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }

    public void updateInventory()
    {
        for(int i = 0; i < items.length; i++)
        {
            String nom = items[i].getName();
            switch (nom)
            {
                case "+5 Dexterity Vest":
                    System.out.println(items[i].toString());
                    listStrategy.get(0).update(items[i]);
                    System.out.println(items[i].toString());
                    break;

                case "Aged Brie":
                    System.out.println(items[i].toString());
                    listStrategy.get(2).update(items[i]);
                    System.out.println(items[i].toString());
                    break;

                case "Elixir of the Mongoose":
                    System.out.println(items[i].toString());
                    listStrategy.get(0).update(items[i]);
                    System.out.println(items[i].toString());
                    break;

                case "Sulfuras, Hand of Ragnaros":
                    System.out.println(items[i].toString());
                    listStrategy.get(1).update(items[i]);
                    System.out.println(items[i].toString());
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
                    System.out.println(items[i].toString());
                    listStrategy.get(1).update(items[i]);
                    System.out.println(items[i].toString());
                    break;

                case "Conjured Mana Cake":
                    System.out.println(items[i].toString());
                    listStrategy.get(0).update(items[i]);
                    items[i].toString();
                    break;

                default:
                    break;
            }
        }
    }


    public void updateQuality() {
    /*for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != "Aged Brie"
                    && items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                if (items[i].getQuality() > 0) {
                    if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            } else {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);
                    if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                        if (items[i].getSellIn() < 0){//ADD
                            items[i].setQuality(0);
                        }
                    }
                }
            }
            if (items[i].getName() == "Sulfuras, Hand of Ragnaros") { //2 errors update
                items[i].setSellIn(items[i].getSellIn() - items[i].getSellIn());
            }
            if (items[i].getSellIn() < 0) {
                if (items[i].getName() != "Aged Brie") {
                    if (items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getQuality() > 0) {
                            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                                items[i].setQuality(items[i].getQuality() - 1);
                            }
                        }
                    } else {
                        items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }
            if(items[i].getName().indexOf("Conjured") != -1){   //ADD
                if(items[i].getQuality() > 0){
                    items[i].setQuality(items[i].getQuality() - 1);
                    if(items[i].getSellIn() < 0){
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            }
        }*/

    }

    public void updateSellin()
    {
        for(int i = 0; i < items.length; i++)
        {
            items[i].setSellIn(items[i].getSellIn() - 1);
        }
    }



    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.updateInventory();
    }
}
