package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class MallardDuck extends AbstractDuck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }
}
