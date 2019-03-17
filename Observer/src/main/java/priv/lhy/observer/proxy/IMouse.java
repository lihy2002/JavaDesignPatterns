package priv.lhy.observer.proxy;


import priv.lhy.observer.core.IEventListener;


/**
 * author : lihy
 * date : 2018/5/23 14:16
 *
 * 被监听者接口
 */
public interface IMouse extends IEventListener{

    void onClick();

    void onDoubleClick();

    void onMove();

    void onUp();

    void onDown();


}
