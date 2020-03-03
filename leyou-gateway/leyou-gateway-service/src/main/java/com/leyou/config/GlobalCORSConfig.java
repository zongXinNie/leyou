package com.leyou.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import java.util.List;


/**
 * 跨域配置
 */
@Configuration
@ConfigurationProperties(prefix = "ly.cors")
public class GlobalCORSConfig {
    private List<String> allowedOrigins;
    private Boolean allowedCredentials;
    private List<String> allowedMethods;
    private List<String> allowedHeaders;
    private Long maxAge;
    private String filterPath;

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        allowedOrigins.forEach(corsConfiguration::addAllowedOrigin);
        corsConfiguration.setAllowCredentials(allowedCredentials);
        allowedMethods.forEach(corsConfiguration::addAllowedMethod);
        allowedHeaders.forEach(corsConfiguration::addAllowedHeader);
        corsConfiguration.setMaxAge(maxAge);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(filterPath,corsConfiguration);
        return new CorsFilter(source);
    }
}
