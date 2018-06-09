package strategy;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class Quack implements QuackBehavior {

    /**
     * 叫的行为
     */
    @Override
    public void perform() {
        System.out.println("呱呱呱");
    }
}
