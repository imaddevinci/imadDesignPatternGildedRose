package edu.insightr.gildedrose;

public class Elixir extends Item{

    public Elixir()
    {
        this.name = "Elixir of the Mongoose";
        this.quality=9;
        this.sellIn=10;
    }

    public Elixir(String name, int sellIn, int quality)
    {
        super(name,sellIn,quality);
    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
