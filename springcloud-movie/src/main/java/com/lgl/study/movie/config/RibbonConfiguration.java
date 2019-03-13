package com.lgl.study.movie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Custom Ribbon configuration
 * Shouldn't in {@link @ComponentScan}
 */
@Configuration
public class RibbonConfiguration {

    /**
     * Custom LB rule
     * @return {@link IRule}
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
