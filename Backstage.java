package edu.insightr.gildedrose;

public class Backstage extends Item{

    public Backstage()
    {
        this.name = "Backstage passes to a TAFKAL80ETC concert";
        this.quality=12;
        this.sellIn=17;
    }

    public Backstage(String name, int sellIn, int quality)
    {
        super(name,sellIn,quality);

    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
