package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.entities.concretes.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao){
        this.employerDao = employerDao;

    }
    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>
                (this.employerDao.findAll(),"Data Listelendi");
    }/*yeni bir tane SuccessDataResult oluşturup içerisinde Employer Listesini geziyoruz
     this.employerDao.findAll() bizim datamız oluyor. SuccessDataResult kısmında message kısmına ise
     burada yazdığımız mesaj gitmiş oluyor.*/

    @Override
    public Result add(Employer employer) {
       this.employerDao.save(employer);
       return new SuccessResult("Sisteme İşveren Eklendi");
    }

}
