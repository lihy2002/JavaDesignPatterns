package priv.lhy.simple;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import priv.lhy.entity.IMeter;

import java.io.File;

/**
 * 使用配置文件与反射生成实例，客户端无需对应操作
 * author : lihy
 * date : 2018/3/19 15:53
 */
public class SimpleFactory2 {

    public IMeter getMeter() {
        //读取配置文件
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
        File xml = new File(Thread.currentThread().getContextClassLoader().getResource("").getPath() + "applicationContext.xml");
        IMeter meter = null;
        try {
            SAXReader reader = new SAXReader();
            Document doc = reader.read(xml);
            Element root = doc.getRootElement();
            Element bean = root.element("bean");

            //反射生成实例
            String className = bean.attributeValue("class");
            meter = (IMeter) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return meter;

    }
}
