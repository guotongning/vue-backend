package com.ning.demo.vuebackend.controller;

import com.ning.demo.vuebackend.entity.Domain;
import com.ning.demo.vuebackend.entity.Result;
import com.ning.demo.vuebackend.memchche.DomainListCache;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/domain/list")
    public Result<List<Domain>> listAllDomain() {
        return new Result<>(DomainListCache.listAll());
    }

    @GetMapping("/domain/get/{id}")
    public Result<Domain> getById(@PathVariable("id") Long id) {
        return new Result<>(DomainListCache.getById(id));
    }

}
