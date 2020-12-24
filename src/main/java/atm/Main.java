package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext obj = new AnnotationConfigApplicationContext(ATMConfig.class);
        AtmUI atmUI = obj.getBean(AtmUI.class);
        atmUI.run();

    }
}
