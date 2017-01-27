import java.applet.AppletContext;
import org.spingframework.context.ApplicationContext;
import org.spingframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {
    public static void main(String[] args) {
        AppletContext ctx = new ClassPathXmlApplicationContext ("META-INF/spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
