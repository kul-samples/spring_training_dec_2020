package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PathLab;
import com.example.demo.repo.PathLabRepository;

@RestController
public class PathLabController {

	@Autowired
	private PathLabRepository repo;
	
	
	@GetMapping(path = "/api/v1/labs/{id}")
	public CollectionModel<PathLab> getAll(@PathVariable("id") int id){
		
		
		 List<PathLab> list =repo.findAll();
		 
		 for(PathLab eachItem : list) {
		 Link selfLink = WebMvcLinkBuilder.linkTo(PaymentController.class)
                 .slash("/api/v1/payments/"+id).withSelfRel();
       
      eachItem.add(selfLink);
		 }
		 
		 Link link = WebMvcLinkBuilder.linkTo(PathLabController.class)
				 .withSelfRel();
	       CollectionModel<PathLab> result =
	        CollectionModel.of(list, link);
	       
	       return result;

      
        }
      

		 
		
	
	
}
