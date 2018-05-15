package priv.lhy;

import junit.framework.TestCase;
import priv.lhy.entity.Coffee;
import priv.lhy.entity.Tea;
import priv.lhy.template.impl.CoffeeDrink;
import priv.lhy.template.impl.TeaDrink;

/**
 * author : lihy
 * date : 2018/5/15 9:31
 */
public class DrinksTest extends TestCase {

    public void testCoffee(){
        CoffeeDrink cd = new CoffeeDrink(new Coffee());
        //cd.setAddCondiments(true);
        cd.setAddCondiments(false);
        cd.prepareDrinks();
    }

    public void testTea(){
        TeaDrink td = new TeaDrink(new Tea());
        //cd.setAddCondiments(true);
        td.setAddCondiments(false);
        td.prepareDrinks();
    }
}
