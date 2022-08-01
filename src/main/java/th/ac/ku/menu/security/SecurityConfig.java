package th.ac.ku.menu.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http // chaing method calling but seprate line
                .csrf().disable()
                .authorizeRequests()
                .anyRequest()
                .authenticated();

        // Old version
//        http.setCSRF(false);
//        http.setAuthorizeRequests(true);
//        http.setAutherticated(true);
    }
}

