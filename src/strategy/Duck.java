package strategy;

import com.sun.istack.internal.NotNull;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    /**
     * 飞行方法
     */
    public void fly() {
        flyBehavior.perform();
    }

    /**
     * 叫的方法
     */
    public void quack() {
        quackBehavior.perform();
    }

    /**
     * 展示方法，输出自己是什么鸭子
     */
    public abstract void display();

    public void swim() {
        System.out.println("I`am swimming!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
