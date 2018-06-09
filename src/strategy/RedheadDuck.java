package strategy;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class RedheadDuck extends AbstractDuck {

    public RedheadDuck() {
        super(new FlyNoWay(),new Squack());
    }

    /**
     * 展示方法，输出自己是什么鸭子
     */
    @Override
    public void display() {
        System.out.println("I`m a redheadDuck.");
        super.display();
    }
}
