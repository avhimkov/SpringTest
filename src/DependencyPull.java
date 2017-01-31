import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by adl on 31.01.2017.
 */
public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        MessageRenderer mr = ctx.getBean("rendered" , MessageRenderer.class);
        mr.render();
    }
}
