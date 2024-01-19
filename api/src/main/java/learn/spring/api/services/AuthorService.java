package learn.spring.api.services;

import learn.spring.api.domain.entities.AuthorEntity;

import java.util.List;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();
}
