package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public interface FlyBehavior extends Behavior {

    /**
     * 飞行方法
     */
    @Override
    void perform();

}
