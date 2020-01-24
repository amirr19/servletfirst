package ir.maktab;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("hey, app started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("app had stopped");
    }
}
