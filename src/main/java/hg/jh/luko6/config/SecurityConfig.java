package hg.jh.luko6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
//              .csrf().disable() // CSRF 보호 비활성화
                .requiresChannel(channel ->
                        channel.anyRequest().requiresSecure()) // 모든 요청이 https를 통해서만.
                .authorizeRequests(authorize ->
                        authorize.anyRequest().permitAll()) // 모든 사용자 접근가능.
                .build();
    }

}