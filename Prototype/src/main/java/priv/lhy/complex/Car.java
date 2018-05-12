package priv.lhy.complex;

import java.io.*;

/**
 * author : lihy
 * date : 2018/3/29 15:18
 */

public class Car implements Cloneable, Serializable{

    private String light;

    private String glasses;

    private Wheel whlles;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone2Serializable(){
        //利用序列号和反序列化实现深拷贝
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return oi.readObject();

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public Wheel getWhlles() {
        return whlles;
    }

    public void setWhlles(Wheel whlles) {
        this.whlles = whlles;
    }
}
