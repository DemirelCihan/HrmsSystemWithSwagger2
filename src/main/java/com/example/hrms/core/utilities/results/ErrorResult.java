package com.example.hrms.core.utilities.results;

public class ErrorResult extends Result{
    public ErrorResult(){
       super(false);/*işlem sonucunun başarısız olduğunu dönderecektir.*/
    }
    public ErrorResult(String message){
        super(false,message);/*işlme sonucunun başarısız olduğunu ve mesaj bilgisini
        döndürecektir.*/
    }

}
