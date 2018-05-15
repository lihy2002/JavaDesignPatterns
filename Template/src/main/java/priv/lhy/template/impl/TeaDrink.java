package priv.lhy.template.impl;

import priv.lhy.entity.IDrinks;
import priv.lhy.entity.Tea;
import priv.lhy.template.DrinksTemplate;

/**
 * author : lihy
 * date : 2018/5/15 9:46
 */
public class TeaDrink extends DrinksTemplate {

    private boolean isAddCondiments;

    public TeaDrink(Tea drink) {
        super(drink);
    }

    @Override
    public void boilWater() {
        System.out.println("将水烧至95度");
    }

    @Override
    public void brewing(IDrinks drink) {
        System.out.println("加入茶叶");
    }

    @Override
    public void addCondiments() {
        System.out.println("加入配料");
    }

    @Override
    public void pourInCup() {
        System.out.println("装杯");
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
