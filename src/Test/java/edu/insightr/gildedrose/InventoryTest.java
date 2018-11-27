package edu.insightr.gildedrose;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    protected  Inventory inv;
    Item[]ancienneListeDesItems;
    @BeforeEach
    void setUp() {
       inv = new Inventory();
        ancienneListeDesItems = inv.getItems();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printInventory() {
    }

    @Test
    void updateQuality() {
    }

    @Test
    public void testupdateQualityDexterityVest()throws Exception{

        Dexterity_Vest dexterity_vest = new Dexterity_Vest("+5 Dexterity Vest", -10, 20);
        Inventory inventory;
        Item[] items = new Item[]{dexterity_vest};
        inventory = new Inventory(items);

        inventory.updateQuality();

        assertEquals(18,inventory.getItems()[0].getQuality());


    }

    @Test
    public void testupdateQualityDexterityVestPos()throws Exception{

        Dexterity_Vest dexterity_vest = new Dexterity_Vest("+5 Dexterity Vest", 10, 20);
        Inventory inventory;
        Item[] items = new Item[]{dexterity_vest};
        inventory = new Inventory(items);

        inventory.updateQuality();

        assertEquals(19,inventory.getItems()[0].getQuality());


    }
    @Test
    public void testQualityAgedBrie(){
        AgedBrie aged_brie=new AgedBrie("Aged Brie", 1, 1);
        Item[]Items=new Item[]{aged_brie};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(2,newInventory.getItems()[0].getQuality());
    }

    @Test
    public void testQualityAgedBrieNegSellIn(){
        AgedBrie aged_brie=new AgedBrie("Aged Brie", -2, 4);
        Item[]Items=new Item[]{aged_brie};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(6,newInventory.getItems()[0].getQuality());
    }

    @Test
    public void testQualityAgedBrieInf50(){
        AgedBrie aged_brie=new AgedBrie("Aged Brie", -25, 49);
        Item[]Items=new Item[]{aged_brie};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(50,newInventory.getItems()[0].getQuality());
    }

    @Test
    public void testQualityElixir(){
         Elixir elixir=new Elixir("Elixir of the Mongoose", 4, 6);
        Item[]Items=new Item[]{elixir};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(5,newInventory.getItems()[0].getQuality());
    }
    @Test
    public void testQualityElixirNegSellIn(){
        Elixir elixir=new Elixir("Elixir of the Mongoose", 0, 2);
        Item[]Items=new Item[]{elixir};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }

    @Test
    public void testQualityElixirSup0(){
        Elixir elixir=new Elixir("Elixir of the Mongoose", -1, 0);
        Item[]Items=new Item[]{elixir};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }

    @Test
    public void testQualityBackstage10Days(){
        Backstage b=new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 6);
        Item[]Items=new Item[]{b};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(8,newInventory.getItems()[0].getQuality());
    }


    @Test
    public void testQualityBackstage5Days(){
        Backstage b=new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 2);
        Item[]Items=new Item[]{b};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(5,newInventory.getItems()[0].getQuality());
    }

    @Test
    public void testQualityBackstage0(){
        Backstage b=new Backstage("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        Item[]Items=new Item[]{b};
        Inventory newInventory=new Inventory(Items);
        newInventory.updateQuality();
        assertEquals(0,newInventory.getItems()[0].getQuality());
    }





    @Test
    void main() {
    }
}