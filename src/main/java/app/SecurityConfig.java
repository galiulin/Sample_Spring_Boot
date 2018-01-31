package app;

import sample_bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public MyBean getMyBean(){
        return new MyBean();
    }
}
