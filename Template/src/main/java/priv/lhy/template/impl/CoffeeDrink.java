package priv.lhy.template.impl;

import priv.lhy.entity.Coffee;
import priv.lhy.entity.IDrinks;
import priv.lhy.template.DrinksTemplate;


/**
 * author : lihy
 * date : 2018/5/15 9:17
 */
public class CoffeeDrink extends DrinksTemplate{

    private boolean isAddCondiments;

    public CoffeeDrink(Coffee drink) {
        super(drink);
    }

    @Override
    public void boilWater() {
        System.out.println("将水烧至80度");
    }

    @Override
    public void brewing(IDrinks drink) {
        System.out.println("放入咖啡");
    }


    @Override
    public void addCondiments() {
        System.out.println("加入糖、牛奶等配料");
    }

    @Override
    public void pourInCup() {
        System.out.println("将咖啡倒入杯中");
    }


    public boolean customerConditments(){
        return this.isAddCondiments;
    }

    public boolean isAddCondiments() {
        return isAddCondiments;
    }

    public void setAddCondiments(boolean addCondiments) {
        isAddCondiments = addCondiments;
    }
}
