package com.example.hrms.api.controllers;


import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  /*@Controller ve @ResponseBody'nin birleştirilmesiden oluşan bir streotype.
@RestController datanın kendisini JSON(verileri depolamak ve farklı platformlar arasında taşımak için kullanılır)
 veya XML(metin işaretleme dili) formatı ile direkt olarak sunabiliyor.*/
@RequestMapping("/api/employers")/*Url'lerin bir sınıf veya metod tarafından map edilmesini sağlar.Sınıf üzerinde kullanıldığı
zaman o sınıfın ilgili tüm işleri yapmasını sağlar.Metot üzerinde yapıldığı zaman daha spesifik URL'lere göre işlem
yapılmasını sağlar*/
public class EmployersController {/*api isimlendirme kurallarında isimlendirme çoğul olur*/
    private EmployerService employerService;
    @Autowired
    public EmployersController(EmployerService employerService){
        this.employerService = employerService;
    }

    @GetMapping("/getall")/*bizden herhangi bir veri istenildiği zaman biz bu verileri
    @GetMapping ile sağlamış oluruz.*/
    public DataResult<List<Employer>> getAll(){
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return this.employerService.add(employer);
    }


}
