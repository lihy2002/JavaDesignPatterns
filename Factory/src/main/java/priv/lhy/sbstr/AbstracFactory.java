package priv.lhy.sbstr;

import priv.lhy.entity.IMeter;

/**
 * 抽象工厂模式
 * 在抽象方法中定义所有返回方法，实现类在每个方法中返回对应类型的实例，客户端可直接根据对应的方法获取实例
 * author : lihy
 * date : 2018/3/19 14:27
 */
public abstract class AbstracFactory {

    public abstract IMeter getAmMeter();

    public abstract IMeter getWaterMeter();

    public abstract IMeter getGasMeter();
}
