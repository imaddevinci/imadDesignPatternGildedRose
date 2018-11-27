package edu.insightr.gildedrose;

public class Sulfuras extends Item {

    public Sulfuras()
    {
        this.name = "Sulfuras, Hand of Ragnaros";
        this.quality=15;
        this.sellIn=15;
    }

    public Sulfuras(String name, int sellIn, int quality)
    {
        super(name,sellIn,quality);

    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
