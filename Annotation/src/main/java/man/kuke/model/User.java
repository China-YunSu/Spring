package man.kuke.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: kuke
 * @date: 2020/12/3 - 20:10
 * @description:
 */

/**
 * xml用来管理  bean
 * 注解负责属性注入
 * 使用注解需要开启注解支持
 * //<!--    包扫描-->
 *     <context:component-scan base-package="man.kuke.model"/>
 * <!--    注解开启-->
 *     <context:annotation-config/>
 */
@Component
@Scope("singleton")
public class User {
    @Value("kuke")
    public String name;
}
