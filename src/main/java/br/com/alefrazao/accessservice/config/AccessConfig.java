package br.com.alefrazao.accessservice.config;

import br.com.alefrazao.accessservice.domain.AccessRepository;
import br.com.alefrazao.accessservice.domain.AccessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccessConfig {

    @Bean
    AccessService accessService(AccessRepository accessRepository){
        return new AccessService(accessRepository);
    }

}

