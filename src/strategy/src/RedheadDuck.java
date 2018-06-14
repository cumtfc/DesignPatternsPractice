package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class RedheadDuck extends AbstractDuck {

    public RedheadDuck() {
        super(new FlyNoWay(),new Squack());
    }
}
