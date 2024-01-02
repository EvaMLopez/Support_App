package dev.evalopez.appsupport.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${api-endpoint}")
    private String apiEndpoint;
    
    public String getApiEndpoint() {
        return apiEndpoint;
    }    
}
