package priv.lhy.interfaceAdapter;

/**
 * author : lihy
 * date : 2018/5/16 15:10
 *
 * 并为实现接口中每个方法提供一个默认实现
 */
public abstract class AbstractElectricity implements IElectricity {

    @Override
    public int voltage220() {
        return 0;
    }

    @Override
    public int voltage110() {
        return 0;
    }

    @Override
    public int voltage5() {
        return 0;
    }

    @Override
    public int current10() {
        return 0;
    }

    @Override
    public int current5() {
        return 0;
    }

    @Override
    public int current1() {
        return 0;
    }
}
