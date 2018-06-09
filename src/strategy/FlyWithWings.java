package strategy;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class FlyWithWings implements FlyBehavior {

    /**
     * 飞行方法
     */
    @Override
    public void perform() {
        System.out.println("拍翅膀");
    }
}
