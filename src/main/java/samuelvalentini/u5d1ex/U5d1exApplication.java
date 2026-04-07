package samuelvalentini.u5d1ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import samuelvalentini.u5d1ex.config.MenuConfig;
import samuelvalentini.u5d1ex.model.Menu;

@SpringBootApplication
public class U5d1exApplication {

    public static void main(String[] args) {
        SpringApplication.run(U5d1exApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
        Menu menu = ctx.getBean(Menu.class);
        System.out.println(menu);
    }

}
