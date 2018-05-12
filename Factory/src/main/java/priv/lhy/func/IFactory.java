package priv.lhy.func;

import priv.lhy.entity.IMeter;

/**
 * 工厂模式
 * 定义返回接口，在实现类中返回具体类型的实例，客户端根据不同的实现类获取所需的实例
 * author : lihy
 * date : 2018/3/19 14:07
 */
public interface IFactory {

    IMeter getMeter();
}
