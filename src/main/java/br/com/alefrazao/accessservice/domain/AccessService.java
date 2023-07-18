package br.com.alefrazao.accessservice.domain;

import reactor.core.publisher.Mono;

public class AccessService {

    private AccessRepository accessRepository;

    public AccessService(AccessRepository accessRepository) {
        this.accessRepository = accessRepository;
    }

    public Mono<Access> create(Access access){
        return accessRepository.save(access);

    }


}
