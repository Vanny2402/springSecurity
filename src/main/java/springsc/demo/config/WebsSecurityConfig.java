package springsc.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebsSecurityConfig extends WebSecurityConfigurerAdapter{
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	            .authorizeRequests()
	                .antMatchers("/").permitAll()  // Allow accesss to /mycontroller without authentication
	                .antMatchers("/admin").hasRole("ADMIN")
	                .antMatchers("/user").hasRole("USER")
	                .anyRequest().authenticated()  // All other requests require authentication
	            .and()
	            .formLogin()
	            .and()
	            .httpBasic();  // Enable basic authentication for simplicity
	    }

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	            .withUser("admin")
	            .password("{bcrypt}$2a$12$8ZJhZ0HzolC5yjgK00V5SuE0AmeoeIa0LpROGU3kglnWe4UvKuPFK")  // Plain text password (not recommended for production)
	            .roles("ADMIN");
	        
	        auth.inMemoryAuthentication()
            .withUser("user")
            .password("{noop}user")  // Plain text password (not recommended for production)
            .roles("USER");
	    }
}