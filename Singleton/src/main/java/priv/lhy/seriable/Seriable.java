package priv.lhy.seriable;

import java.io.Serializable;

/**
 * 反序列化会破坏单例
 * author : lihy
 * date : 2018/3/21 16:01
 */
public class Seriable implements Serializable {

    /**
     * 序列化会将内存中的实例通过转换成字节码的形式转化成IO流，
     * 写入其他地方，从而永久保存信息
     *
     * 反序列化可将已持久化的字节码内容转化为IO流，
     * 通过IO流的读取，将内容转化为Java对象
     * 在转化过程中会重新创建对象
     *
     */

    public final static Seriable INSTANCE = new Seriable();

    private Seriable(){}

    public static Seriable getInstance(){
        return INSTANCE;
    }

    //反序列化时会自动调用该方法，从而实现单例
    private Object readResolve(){
        return INSTANCE;
    }
}
