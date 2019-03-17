package priv.lhy.observer.core;

import lombok.Data;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * author : lihy
 * date : 2018/5/23 10:34
 *
 * 事件
 */
@Data
public class Event {

    //数据源
    private Object souce;
    //通知目标
    private Object target;
    //回调方法
    private Method callbackMethod;
    //执行时间
    private Date time;

    public Event(Object target, Method callbackMethod) {
        this.target = target;
        this.callbackMethod = callbackMethod;
    }

}
