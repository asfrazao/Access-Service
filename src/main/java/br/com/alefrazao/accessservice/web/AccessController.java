package br.com.alefrazao.accessservice.web;

import br.com.alefrazao.accessservice.domain.Access;
import br.com.alefrazao.accessservice.domain.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/access")
public class AccessController {


    private AccessService accessService;

    public AccessController(AccessService accessService) {
        this.accessService = accessService;
    }

    @PostMapping
    public ResponseEntity<Mono<Access>>create(@RequestBody Access access){

      //  Mono<Access> createdAccess = accessService.create(access);
        var createdAccess = accessService.create(access);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAccess);
    }

}
