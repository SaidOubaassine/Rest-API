package learn.spring.api.services.impl;

import learn.spring.api.domain.entities.AuthorEntity;
import learn.spring.api.respositories.AuthorRepository;
import learn.spring.api.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;
    public AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    @Override
    public AuthorEntity save(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
