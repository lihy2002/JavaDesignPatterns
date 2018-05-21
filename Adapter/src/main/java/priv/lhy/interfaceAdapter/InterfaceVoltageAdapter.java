package priv.lhy.interfaceAdapter;

/**
 * author : lihy
 * date : 2018/5/16 15:12
 */
public class InterfaceVoltageAdapter extends AbstractElectricity {

    @Override
    public int voltage220() {
        return 220;
    }

    @Override
    public int voltage110() {
        return 110;
    }

    @Override
    public int voltage5() {
        return 5;
    }
}
