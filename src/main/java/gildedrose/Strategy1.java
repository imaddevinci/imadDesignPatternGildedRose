package gildedrose;

public class Strategy1 implements IStrategy {

    @Override
    public void update(Item i)
    {
        i.setSellIn(i.getSellIn()-1);
        i.setQuality(i.getQuality()-1);
    }

}
