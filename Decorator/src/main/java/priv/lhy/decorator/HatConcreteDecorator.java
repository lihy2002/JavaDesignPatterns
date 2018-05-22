package priv.lhy.decorator;

/**
 * author : lihy
 * date : 2018/5/21 16:17
 *
 * 具体装饰角色A
 * 把最核心的、最原始的、最基本的东西装饰成其他东西
 */
public class HatConcreteDecorator extends DressDecorator {


    public HatConcreteDecorator(IDressComponent peason) {
        super(peason);
    }

    private void hat(){
        System.out.println("bring a hat");
    }

    @Override
    public void dress() {
        hat();
        super.dress();
    }

}
