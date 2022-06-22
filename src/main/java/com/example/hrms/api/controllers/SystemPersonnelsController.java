package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.SystemPersonnelService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/systemPersonnels")
public class SystemPersonnelsController {
    private SystemPersonnelService systemPersonnelService;
    @Autowired
    public SystemPersonnelsController(SystemPersonnelService systemPersonnelService){
        this.systemPersonnelService = systemPersonnelService;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemPersonnel>> getAll(){
     return this.systemPersonnelService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemPersonnel systemPersonnel){
        return this.systemPersonnelService.add(systemPersonnel);
    }
}
