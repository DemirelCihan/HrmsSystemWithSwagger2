package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.SystemPersonnelService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.entities.concretes.abstracts.SystemPersonnelDao;
import com.example.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SystemPersonnelManager implements SystemPersonnelService {

   private SystemPersonnelDao systemPersonnelDao;

   @Autowired
   public SystemPersonnelManager (SystemPersonnelDao systemPersonnelDao){
       this.systemPersonnelDao = systemPersonnelDao;
   }

    @Override
    public DataResult<List<SystemPersonnel>> getAll() {
        return new SuccessDataResult<List<SystemPersonnel>>
                (this.systemPersonnelDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("System Personnel Listeye Eklendi");
    }
}
