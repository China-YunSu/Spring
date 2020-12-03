package man.kuke.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: kuke
 * @date: 2020/12/3 - 22:36
 * @description:
 */
public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("返回结果为 " + o);
    }
}
