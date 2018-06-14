package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class RubberDuck extends AbstractDuck {

    public RubberDuck() {
        super(new FlyWithRocket(),new MuteQuack());
    }
}
