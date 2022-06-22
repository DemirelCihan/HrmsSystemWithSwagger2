package com.example.hrms.core.utilities.results;

public class SuccessDataResult <T> extends DataResult{

    public SuccessDataResult(T data,String message){
    super(data,true,message);/*super() ile data bilgisi ve mesaj alınır*/
}
public SuccessDataResult(T data){
        super(data,true);/*super() ile sadece data bilgisi alınır*/
}
public SuccessDataResult(String message){
        super(null,true,message);/*super() ile sadece mesaj bilgisi alınır*/

}
public SuccessDataResult(){
        super(null,true); /*super() ile herhangi bir bilgi alınmadan true dönderilir.*/
}
}
