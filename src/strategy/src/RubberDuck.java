package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class RubberDuck extends AbstractDuck {

    public RubberDuck() {
        super(new FlyWithRocket(),new MuteQuack());
    }

    /**
     * 展示方法，输出自己是什么鸭子
     */
    @Override
    public void display() {
        System.out.println("I`m a rubberDuck.");
        super.display();
    }
}
