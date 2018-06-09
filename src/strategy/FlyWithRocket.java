package strategy;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class FlyWithRocket implements FlyBehavior {

    /**
     * 飞行方法
     */
    @Override
    public void perform() {
        System.out.println("喷射");
    }
}
