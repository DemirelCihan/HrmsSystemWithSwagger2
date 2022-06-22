package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.entities.concretes.abstracts.UserDao;
import com.example.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>
                (this.userDao.findAll(),"Data Listelendi");
/*Burada yapılan işlemler yeni bir SuccessDataResult değeri oluşturup User listelemekteyiz.Ardından
* SuccessDataResult içerisinde oluturduğumuz data bilgisi ve mesaj bilgilerini istemekteyiz.
* Data  bilgisi this.userDao.findAll() ile*/
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);/*constructor içerisinde this metodu ile userDao çağrılır.Ardından
        save metodu ile ekleme ve güncelleme işlemleri yapılır.Bu işlemler kullanıcdan post almak için yapılmatadır.*/
        return new SuccessResult("User Listelendi");/*yeni bir tane SuccessResult oluşturup */
    }
}
