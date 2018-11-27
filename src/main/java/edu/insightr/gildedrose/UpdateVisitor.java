package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor{

    public void visit(Item i)
    {

    }
    public void visit(IVisitable o)
    {

    }

    public void visit(Dexterity_Vest o)
    {
        o.setQuality(o.getQuality()+1);
        System.out.println(o.toString());
    }

    public void visit(AgedBrie brie)
    {
        brie.setQuality(brie.getQuality()+1);
        System.out.println(brie.toString());
    }

    public void visit(Backstage o)
    {
        o.setQuality(o.getQuality()+1);
        System.out.println(o.toString());
    }

    public void visit(Conjured o)
    {
        o.setQuality(o.getQuality()+1);
        System.out.println(o.toString());
    }

    public void visit(Elixir o)
    {
        o.setQuality(o.getQuality()+1);
        System.out.println(o.toString());
    }

    public void visit(Sulfuras o)
    {
        o.setQuality(o.getQuality()+1);
        System.out.println(o.toString());
    }
}
