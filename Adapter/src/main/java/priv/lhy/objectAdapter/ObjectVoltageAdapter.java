package priv.lhy.objectAdapter;

import priv.lhy.classAdapter.IVoltage5;
import priv.lhy.classAdapter.Voltage220;

/**
 * author : lihy
 * date : 2018/5/16 11:06
 *
 * 对象适配器模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，不继承src类，而是持有src类的实例，以解决兼容性的问题。
 * 即：持有 src类，实现 dst 类接口，完成src->dst的适配。
 *
 * 根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系，因此大部分结构型模式都是对象结构型模式。
 */
public class ObjectVoltageAdapter implements IVoltage5 {

    private Voltage220 voltage220;

    public ObjectVoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        int dst = 0;
        if (null != voltage220) {
            int src = voltage220.output220();
            System.out.println("适配器转换电压");
            dst = src / 44;
            System.out.println("输出电压: " + dst);
        }
        return dst;
    }
}
