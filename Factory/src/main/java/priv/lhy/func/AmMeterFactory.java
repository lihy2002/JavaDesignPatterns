package priv.lhy.func;

import priv.lhy.entity.AMMeter;
import priv.lhy.entity.IMeter;

/**
 * author : lihy
 * date : 2018/3/19 14:09
 */
public class AmMeterFactory implements IFactory {

    public IMeter getMeter() {
        return new AMMeter();
    }
}
