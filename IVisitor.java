package edu.insightr.gildedrose;

public interface IVisitor {

    void visit(Item i);
    void visit(IVisitable vis);
    void visit(Dexterity_Vest dexterity);
    void visit(AgedBrie brie);
    void visit(Backstage backstage);
    void visit(Conjured conjured);
    void visit(Elixir elixir);
    void visit(Sulfuras sulfuras);
}
