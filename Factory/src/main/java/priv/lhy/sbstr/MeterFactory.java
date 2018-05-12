package priv.lhy.sbstr;

import priv.lhy.entity.AMMeter;
import priv.lhy.entity.GasMeter;
import priv.lhy.entity.IMeter;
import priv.lhy.entity.WaterMeter;

/**
 * author : lihy
 * date : 2018/3/19 14:30
 */
public class MeterFactory extends AbstracFactory {
    public IMeter getAmMeter() {
        return new AMMeter();
    }

    public IMeter getWaterMeter() {
        return new WaterMeter();
    }

    public IMeter getGasMeter() {
        return new GasMeter();
    }
}
