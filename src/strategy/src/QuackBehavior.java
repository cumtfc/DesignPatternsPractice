package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public interface QuackBehavior extends Behavior {

    /**
     * 叫的行为
     */
    @Override
    void perform();
}
