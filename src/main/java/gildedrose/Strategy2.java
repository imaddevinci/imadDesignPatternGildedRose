package gildedrose;

public class Strategy2 implements IStrategy {

    @Override
    public void update(Item i)
    {
        i.setSellIn(i.getSellIn()-1);
        if(i.getSellIn()==0) {
            i.setQuality(i.getQuality() - 2);
        }
    }

}
