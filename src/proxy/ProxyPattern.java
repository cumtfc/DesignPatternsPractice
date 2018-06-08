package proxy;

/**
 * 抽象对象角色
 */
interface IMacBook {
    void buyIt();
}

/**
 * 目标对象角色
 */
class HangKangMacBook implements IMacBook {
    @Override
    public void buyIt() {
        System.out.println("Ok，buy buy buy!");
    }
}
/**
 * 代理对象角色
 */
class ProxyMacBook implements IMacBook {
    @Override
    public void buyIt() {
        HangKangMacBook mac = new HangKangMacBook();
        mac.buyIt();
    }

}

/**
 * 客户端
 */
public class ProxyPattern {
    public static void main(String[] args) {
        IMacBook macBook = new ProxyMacBook();
        macBook.buyIt();
    }
}
