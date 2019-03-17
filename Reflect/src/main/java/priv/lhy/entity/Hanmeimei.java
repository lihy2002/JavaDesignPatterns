package priv.lhy.entity;

import lombok.Data;

/**
 * author : lihy
 * date : 2018/4/9 10:04
 */
@Data
public class Hanmeimei implements IPersion{

    private String name;
    private String sex;
    private int age;
    private IPersion boyfriend;

    public Hanmeimei(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    private int getAge() {
        return age;
    }

    private IPersion getGirlfriend() {
        return boyfriend;
    }

    @Override
    public void eat() {
        System.out.println("Hanmeimei eat something");
    }

    @Override
    public void walk() {
        System.out.println("Hanmeimei take a walk");
    }
}
