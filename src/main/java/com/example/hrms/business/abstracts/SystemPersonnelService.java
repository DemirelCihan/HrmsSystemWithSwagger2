package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {

    DataResult<List<SystemPersonnel>> getAll();

    Result add(SystemPersonnel systemPersonnel);

}
