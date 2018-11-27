package edu.insightr.gildedrose;

public class AgedBrie extends Item{


        public AgedBrie()
        {

            this.name = "Aged Brie";
            this.quality=17;
            this.sellIn=10;
        }

        public AgedBrie(String name, int sellIn, int quality)
        {
            super(name,sellIn,quality);

        }

        public void accept(IVisitor visitor)
        {
            visitor.visit(this);
        }




}
