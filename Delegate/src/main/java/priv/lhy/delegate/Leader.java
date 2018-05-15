package priv.lhy.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * author : lihy
 * date : 2018/5/15 16:37
 *
 * 委派类与被委派类没有任何关系，只是有一样的方法；
 * 调用委派类的方法/属性就是调用被委派类的方法/属性；
 * 委派类就是一个受被委派类的中介；
 * 这样能够使用到被委派类的各种功能，有能很好的将被委派类保护起来
 */
public class Leader implements ITarget {

    private Map<String, Class> targetMap = new HashMap<>();

    public Leader(){
        targetMap.put("a", TargetA.class);
        targetMap.put("b", TargetB.class);
    }

    /***
     * 与被委派类有同样的方法
     * @param commond
     */
    @Override
    public void doSometing(String commond) {
        try {
            //根据指定的命令，生成被委派类
            ITarget target = (ITarget) targetMap.get(commond).newInstance();
            //调用对应的被委派类的方法
            target.doSometing(commond);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
