package com.mendes.project_spring.services;

import com.mendes.project_spring.entities.Category;
import com.mendes.project_spring.entities.User;
import com.mendes.project_spring.repositories.CategoryRepository;
import com.mendes.project_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    };

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    };
}
