package edu.insightr.gildedrose;

public class Conjured extends Item{

    public Conjured()
    {
        this.name = "Conjured Mana Cake";
        this.quality=7;
        this.sellIn=19;
    }

    public Conjured(String name, int sellIn, int quality)
    {
        super(name,sellIn,quality);

    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
