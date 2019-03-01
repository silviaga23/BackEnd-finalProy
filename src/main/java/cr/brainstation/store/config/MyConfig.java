package cr.brainstation.store.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/v1/product");
                registry.addMapping("/v1/user/register");
                registry.addMapping("/v1/user/login");
                registry.addMapping("/v1/user/purchase");


            }
        };
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
