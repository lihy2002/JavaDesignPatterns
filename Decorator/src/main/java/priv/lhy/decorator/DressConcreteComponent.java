package priv.lhy.decorator;

/**
 * author : lihy
 * date : 2018/5/21 16:11
 *
 * ConcreteComponent 具体构件
 * ConcreteComponent是最核心、最原始、最基本的接口或抽象类的实现，需要装饰的就是它
 */
public class DressConcreteComponent implements IDressComponent {

    @Override
    public void dress(){
        System.out.println("get dressed");
    }

}
