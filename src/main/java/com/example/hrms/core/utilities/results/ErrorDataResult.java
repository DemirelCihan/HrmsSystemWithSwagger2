package com.example.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult{
    public ErrorDataResult(T data, String message){
        super(data,false,message);/*super() ile data ve mesaj bilgileri alındı.*/
    }

    public ErrorDataResult(T data){
        super(data,false);/*super() ile sadece data bilgisi dönderilir*/
    }

    public ErrorDataResult(String message){
        super(null,false,message);/*super() ile sadece message bilgisi alınır/
    }

    public ErrorDataResult(){
        super(null,false);/*super ile bilgi data veya mesaj bilgisi alınmadan success değeri
        false döndürülür.*/
    }
}
