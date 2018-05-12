package priv.lhy.simple;

import lombok.Data;

import java.util.List;

/**
 * author : lihy
 * date : 2018/3/29 14:42
 */
@Data
public class Prototype implements Cloneable {

    private String name;

    private int type;

    private List<String> list;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /**
         * 浅拷贝，完全复制，对象则复制引用地址
         */
        return super.clone();
    }

}
