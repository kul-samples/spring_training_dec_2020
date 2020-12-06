package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entity.PathLab;

@RepositoryRestResource(path = "labs")
public interface PathLabRepository extends JpaRepository<PathLab, Integer> {

	@RestResource(path = "location")
	public List<PathLab> findByLocation(String location);
}
