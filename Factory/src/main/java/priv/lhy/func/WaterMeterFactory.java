package priv.lhy.func;

import priv.lhy.entity.IMeter;
import priv.lhy.entity.WaterMeter;

/**
 * author : lihy
 * date : 2018/3/19 14:11
 */
public class WaterMeterFactory implements IFactory {
    public IMeter getMeter() {
        return new WaterMeter();
    }
}
