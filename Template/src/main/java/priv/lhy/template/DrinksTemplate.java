package priv.lhy.template;

import priv.lhy.entity.IDrinks;

/**
 * author : lihy
 * date : 2018/5/15 8:54
 * 制作饮品模板
 */
public abstract class DrinksTemplate {

    private IDrinks drink;

    public DrinksTemplate(IDrinks drink) {
        this.drink = drink;
    }

    /**
     * 制作过程
     */
    public void prepareDrinks(){
        boilWater();
        brewing(this.drink);
        //调用钩子，是否加入配料
        if(customerConditments()){
            addCondiments();
        }
        pourInCup();
    }

    /**
     * 烧水
     */
    public abstract void boilWater();

    /**
     * 加入饮品原料
     * @param drink 饮品原料（咖啡、茶...）
     */
    public abstract void brewing(IDrinks drink);

    /**
     * 加入配料
     */
    public abstract void addCondiments();

    /**
     * 装杯
     */
    public abstract void pourInCup();


    /**
     * 钩子方法，用以判断是否执行某个步骤
     * @return
     */
    public boolean customerConditments(){
        return true;
    }

}
