package priv.lhy.classAdapter;

/**
 * author : lihy
 * date : 2018/5/16 10:44
 *
 *
 * 可使用 @Deprecated 注释提示使用者此类不推荐使用
 */
public class Voltage220 {

    public int output220() {
        int src = 220;
        System.out.println("输出电压: " + src);
        return src;
    }
}
