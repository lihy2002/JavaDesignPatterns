package priv.lhy.staticProxy;

/**
 * author : lihy
 * date : 2018/3/31 10:59
 *
 * 静态代理
 * 代理类提供了对目标对象另外的访问方式;即通过代理对象访问目标对象.
 * 这样做的好处是:可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能.
 *
 * 缺点:因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.
 * 同时,一旦接口增加方法,目标对象与代理对象都要维护.
 */
//代理类 保姆
public class BabySitter implements IPerson {

    //拥有目标类的引用
    private IPerson mater;

    public BabySitter(IPerson mater){
        this.mater = mater;
    }

    //代理的方法是已知的
    @Override
    public void cleanUp() {
        System.out.println("保姆空闲中……");
        mater.cleanUp();
        System.out.println("打扫完成");
    }

    @Override
    public void cook() {
        System.out.println("保姆空闲中……");
        mater.cook();
        System.out.println("饭已做好");
    }
}
