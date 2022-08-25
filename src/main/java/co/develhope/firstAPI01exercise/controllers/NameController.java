package co.develhope.firstAPI01exercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/getName")
    public String getName(){
        return "Mattia";
    }

    @PostMapping("/reversedName/{name}")
    public StringBuilder reversedName(@PathVariable String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        return stringBuilder.reverse();
    }


}
