package priv.lhy.simple;

import priv.lhy.entity.AMMeter;
import priv.lhy.entity.GasMeter;
import priv.lhy.entity.IMeter;
import priv.lhy.entity.WaterMeter;

/**
 * 简单工厂模式
 * 缺点：
 * 客户端必须知道实现类对应的名称；传递错误则无法获取正确的实例。
 * 需要使用if或switch遍历实现类的名称，不利于修改扩展
 * author : lihy
 * date : 2018/3/19 14:41
 */
public class SimpleFactory {

    public IMeter getMeter(String name){
        IMeter meter = null;
        switch (name){
            case "ammeter" :
                meter = new AMMeter();
                break;
            case "watermeter" :
                meter = new WaterMeter();
                break;
            case "gasmeter" :
                meter = new GasMeter();
                break;
            default:
                System.out.println("Not this meter");
        }
        return meter;
    }
}
