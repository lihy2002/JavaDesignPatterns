package priv.lhy.staticProxy;

/**
 * author : lihy
 * date : 2018/5/11 9:09
 *
 * 目标类，不实现接口
 */
public class MasterNoImpl {

    private String name= "defaut";

    /**
     * 如果有有参构造函数，必须显示声明无参构造函数
     */
    public MasterNoImpl(){}

    public MasterNoImpl(String name){
        this.name = name;
    }

    public void cleanUp() {
        System.out.println(this.name+" 需要打扫卫生");
    }

    public void cook() {
        System.out.println(this.name+" 需要做饭");
    }
}
