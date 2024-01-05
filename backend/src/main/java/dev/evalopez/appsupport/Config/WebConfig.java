package dev.evalopez.appsupport.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final AppConfig appConfig;

    @Autowired
    public WebConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(appConfig.getApiEndpoint() + "/**") 
            .allowCredentials(false)
            .allowedOrigins("http://localhost:5173")
            .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}