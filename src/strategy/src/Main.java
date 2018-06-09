package strategy.src;

/**
 * @author 冯楚
 * @date 2018/6/8-19:12
 */
public class Main {

    public static void main(String[] args) {
        Duck redheadDuck = new RedheadDuck();
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        redheadDuck.display();
        mallardDuck.display();
        rubberDuck.display();
        System.out.println("========================================================");

        redheadDuck.setQuackBehavior(new Squack());
        redheadDuck.quack();
        redheadDuck.setQuackBehavior(() -> System.out.println("啦啦啦,我是一只会说话的鸭子！"));
        redheadDuck.quack();
    }

}
