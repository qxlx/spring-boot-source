import org.junit.jupiter.api.Test;
import org.qxlx.application.AppConfig;
import org.qxlx.application.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

/**
 * @author qxlx
 * @date 2024/11/18 21:57
 */
public class Test1 {

    @Test
    public void testGetPerson () {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(AppConfig.class);
        Person bean = ioc.getBean(Person.class);
        Assert.notNull(bean);
    }

}
