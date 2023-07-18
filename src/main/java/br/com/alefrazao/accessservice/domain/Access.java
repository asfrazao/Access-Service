package br.com.alefrazao.accessservice.domain;

import java.time.LocalDateTime;



public record Access(
        Long id, String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updatedAt) {

}
