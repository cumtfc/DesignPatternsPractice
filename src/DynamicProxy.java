import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 接口
 */
interface Subject {
    void request();
}

/**
 * 委托类
 */
class RealSubject implements Subject {
    public void request() {
        System.out.println("====RealSubject Request====");
    }
}

/**
 * 代理类的调用处理器
 */
class ProxyHandler implements InvocationHandler {
    private Subject subject;

    public static Subject getSubjectInstance() {
        ProxyHandler handler = new ProxyHandler();
        return (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);
    }

    private ProxyHandler() {
        this.subject = new RealSubject();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("====before====");//定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作
        Object result = method.invoke(subject, args);
        System.out.println("====after====");
        return result;
    }
}

public class DynamicProxy {
    public static void main(String[] args) {
        Subject subject = ProxyHandler.getSubjectInstance();
        System.out.println(Proxy.isProxyClass(subject.getClass()));
        System.out.println(Proxy.getInvocationHandler(subject).toString());
        System.out.println(Proxy.getProxyClass(Subject.class.getClassLoader()));
        subject.request();
        System.out.println(122);
        System.out.println(122);
        System.out.println(122);
    }
}
