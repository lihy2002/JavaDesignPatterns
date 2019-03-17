package priv.lhy.observer.mouse;

import priv.lhy.observer.core.Event;

/**
 * author : lihy
 * date : 2018/5/23 11:05
 *
 * 观察者
 * 回调响应
 */
public class MouseEvenCallback {

    public void onClick(Event e) {
        System.out.println("触发鼠标单击");
    }

    public void onDoubleClick(Event e) {
        System.out.println("触发鼠标双击");
    }

    public void onMove(Event e) {
        System.out.println("触发鼠标移动");
    }

    public void onUp(Event e) {
        System.out.println("触发鼠标弹起");
    }

    public void onDown(Event e) {
        System.out.println("触发鼠标按下");

    }
}