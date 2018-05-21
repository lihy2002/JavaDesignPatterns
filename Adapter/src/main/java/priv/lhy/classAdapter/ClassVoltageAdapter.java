package priv.lhy.classAdapter;

/**
 * author : lihy
 * date : 2018/5/16 10:50
 *
 * 需要被适配的类、接口、对象（我们有的），简称 src（source）
 * 最终需要的输出（我们想要的），简称 dst (destination，即Target)
 * 适配器称之为 Adapter
 *
 * 类适配器模式
 * Adapter类，通过继承 src类，实现 dst 类接口，完成src->dst的适配
 */
public class ClassVoltageAdapter extends Voltage220 implements IVoltage5 {

    @Override
    public int output5() {
        int src = output220();
        System.out.println("适配器转换电压");
        int dst = src / 44;
        System.out.println("输出电压: " + dst);
        return dst;
    }
}
