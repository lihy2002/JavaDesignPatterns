package priv.lhy.func;

import priv.lhy.entity.GasMeter;
import priv.lhy.entity.IMeter;

/**
 * author : lihy
 * date : 2018/3/19 14:12
 */
public class GasMeterFactory implements IFactory {
    public IMeter getMeter() {
        return new GasMeter();
    }
}
