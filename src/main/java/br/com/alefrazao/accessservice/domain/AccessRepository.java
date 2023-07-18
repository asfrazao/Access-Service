package br.com.alefrazao.accessservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccessRepository extends ReactiveCrudRepository<Access, Long> {


}




