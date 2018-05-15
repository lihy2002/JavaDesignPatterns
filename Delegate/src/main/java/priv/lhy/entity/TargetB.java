package priv.lhy.entity;

/**
 * author : lihy
 * date : 2018/5/15 16:36
 */
public class TargetB implements ITarget {

    @Override
    public void doSometing(String commond) {
        System.out.println("targetB doing commond "+ commond);
    }
}
