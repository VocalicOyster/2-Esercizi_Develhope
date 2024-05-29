package co.develhope.interceptor2.config;

import co.develhope.interceptor2.entities.Month;
import co.develhope.interceptor2.interceptor.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringConfig implements WebMvcConfigurer {

    @Autowired
    private MonthInterceptor monthInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(monthInterceptor);
    }
}
