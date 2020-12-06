package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.PathLab;

@RepositoryRestResource(path = "labs")
public interface PathLabRepository extends JpaRepository<PathLab, Integer> {

}
