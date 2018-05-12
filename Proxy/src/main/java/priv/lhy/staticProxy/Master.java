package priv.lhy.staticProxy;

/**
 * author : lihy
 * date : 2018/3/31 10:56
 *
 * 目标类 主人
 */
public class Master implements IPerson {

    private String name;

    public Master(String name){
        this.name = name;
    }

    @Override
    public void cleanUp() {
        System.out.println(this.name+" 需要打扫卫生");
    }

    @Override
    public void cook() {
        System.out.println(this.name+" 需要做饭");
    }
}
