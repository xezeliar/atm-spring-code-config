package atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSourceFile("customers.txt");
    }

    @Bean
    public Bank bank(){
        return new Bank("CodeConfigBank", dataSource());
    }

    @Bean
    public ATM atm(){
        return new ATM(bank());
    }

}
