package config;

import org.owasp.validator.html.AntiSamy;
import org.owasp.validator.html.Policy;
import org.owasp.validator.html.PolicyException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;

@Configuration
public class CommonTestConfig {

    @Bean
    public AntiSamy antiSamy() throws PolicyException {
        return new AntiSamy(Policy.getInstance());
    }

    @Bean
    public EmbeddedDatabase buildH2() {

    }

}
