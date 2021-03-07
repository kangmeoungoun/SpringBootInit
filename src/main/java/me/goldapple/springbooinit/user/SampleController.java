package me.goldapple.springbooinit.user;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class SampleController{
    @GetMapping("/hello")
    public EntityModel<Hello> hello(){
        Hello hello =new Hello();
        hello.setPrefix("Hey,");
        hello.setName("goldapple");

        EntityModel<Hello> helloEntityModel = EntityModel.of(hello);
        helloEntityModel.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel() );
        return helloEntityModel;
    }
}
