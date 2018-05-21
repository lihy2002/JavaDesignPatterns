package priv.lhy.interfaceAdapter;

/**
 * author : lihy
 * date : 2018/5/16 15:16
 *
 * 接口适配器模式
 *
 * 也有称之为默认适配器模式(Default Adapter Pattern)或缺省适配器模式
 *
 * 当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），
 * 那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求，它适用于一个接口不想使用其所有的方法的情况
 */
public class InterfaceCurrentAdapter extends AbstractElectricity {

    @Override
    public int current10() {
        return 10;
    }

    @Override
    public int current5() {
        return 5;
    }

    @Override
    public int current1() {
        return 1;
    }
}
