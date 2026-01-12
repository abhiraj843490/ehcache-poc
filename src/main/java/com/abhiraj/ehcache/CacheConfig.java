package com.abhiraj.ehcache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@Slf4j
public class CacheConfig {
    public CacheConfig(){
        log.info("Enabling cache");
    }
}
