package strategy;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public interface Duck {

    /**
     * 飞行方法
     */
    void fly();

    /**
     * 叫的方法
     */
    void quack();

    /**
     * 展示方法
     */
    void display();

    /**
     * 游泳方法
     */
    void swim();

    /**
     * 设置飞行行为
     * @param flyBehavior FlyBehavior接口实现类
     */
    void setFlyBehavior(FlyBehavior flyBehavior);

    /**
     * 设置叫的行为
     * @param quackBehavior QuackBehavior接口实现类
     */
    void setQuackBehavior(QuackBehavior quackBehavior);

}
