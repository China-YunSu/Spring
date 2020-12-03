package man.kuke.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: kuke
 * @date: 2020/12/3 - 22:29
 * @description:
 */
public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置拦截");
    }
}
