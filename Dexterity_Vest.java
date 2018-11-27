package edu.insightr.gildedrose;

public class Dexterity_Vest extends Item{

    public Dexterity_Vest()
    {
        this.name = "+5 Dexterity Vest";
        this.quality=25;
        this.sellIn=4;
    }

    public Dexterity_Vest(String name, int sellIn, int quality)
    {
        super(name,sellIn,quality);

    }



    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
