package learn.spring.api.services;

import learn.spring.api.domain.entities.AuthorEntity;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);
}
