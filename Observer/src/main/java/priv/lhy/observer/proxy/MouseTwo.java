package priv.lhy.observer.proxy;

import priv.lhy.observer.core.EventListener;
import priv.lhy.observer.mouse.MouseEventType;

/**
 * author : lihy
 * date : 2018/5/23 11:09
 *
 * 被监听者
 */
public class MouseTwo extends EventListener implements IMouse{

    public void onClick(){
        System.out.println("单击");
    }

    public void onDoubleClick(){
        System.out.println("双击");
    }

    public void onMove(){
        System.out.println("移动");
    }

    public void onUp(){
        System.out.println("弹起");
    }

    public void onDown(){
        System.out.println("按下");
    }
}
