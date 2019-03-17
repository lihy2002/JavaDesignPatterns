package priv.lhy.entity;

import lombok.Data;

/**
 * author : lihy
 * date : 2018/4/9 9:56
 */
@Data
public class Lilee extends Student {

    private String name;
    private String sex;
    private int age;
    private Hanmeimei girlfriend;

    public Lilee() {
        this.name = "li";
        this.sex = "male";
        this.age = 25;
        this.girlfriend = new Hanmeimei("hanmeimei", "famale", 20);
    }

    public Lilee(String name, String sex, int age, Hanmeimei girlfriend) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.girlfriend = girlfriend;
    }

    private int getAge() {
        return age;
    }

    private Hanmeimei getGirlfriend() {
        return girlfriend;
    }

    @Override
    public void learn() {
        System.out.println("learn konwledge");
    }

    @Override
    public void eat() {
        System.out.println("go to dining hall");
        super.eat();
    }

    private void play() {
        System.out.println("play PC games");
    }

    private void play2gril(IPersion gril) {
        System.out.println(getName() + " play with gril");
        System.out.println(girlfriend.getName() + " very angry");
    }

}
