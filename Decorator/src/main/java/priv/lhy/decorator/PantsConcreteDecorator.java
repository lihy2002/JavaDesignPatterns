package priv.lhy.decorator;

/**
 * author : lihy
 * date : 2018/5/21 16:37
 *
 * 具体装饰角色B
 */
public class PantsConcreteDecorator extends DressDecorator {

    public PantsConcreteDecorator(IDressComponent man) {
        super(man);
    }

    private void pants(){
        System.out.println("put on pants");
    }

    @Override
    public void dress() {
        pants();
        super.dress();
    }
}
