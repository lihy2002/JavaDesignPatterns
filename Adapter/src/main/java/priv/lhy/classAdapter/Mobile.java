package priv.lhy.classAdapter;

/**
 * author : lihy
 * date : 2018/5/16 10:57
 */
public class Mobile {

    public void charging(IVoltage5 voltage5){
        if(voltage5.output5()==5){
            System.out.println("5V电压，开始充电");
        }else {
            System.out.println("电压不符");
        }
    }
}
