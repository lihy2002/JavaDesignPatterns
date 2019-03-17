package priv.lhy.observer.mouse;

import priv.lhy.observer.core.EventListener;

/**
 * author : lihy
 * date : 2018/5/23 11:09
 *
 * 被观察者
 */
public class Mouse extends EventListener{

    public void onClick(){
        System.out.println("单击");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void onDoubleClick(){
        System.out.println("双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void onMove(){
        System.out.println("移动");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void onUp(){
        System.out.println("弹起");
        this.trigger(MouseEventType.ON_UP);
    }

    public void onDown(){
        System.out.println("按下");
        this.trigger(MouseEventType.ON_DOWN);
    }
}
