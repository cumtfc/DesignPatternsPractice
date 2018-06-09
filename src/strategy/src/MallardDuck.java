package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class MallardDuck extends AbstractDuck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    /**
     * 展示方法，输出自己是什么鸭子
     */
    @Override
    public void display() {
        System.out.println("I`m a mallardDuck.");
        super.display();
    }
}
