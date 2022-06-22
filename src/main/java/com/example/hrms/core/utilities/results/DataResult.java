package com.example.hrms.core.utilities.results;

public class DataResult <T> extends Result{
    private T data;
    public DataResult(T data,boolean success,String message){
        super(success,message);
        this.data = data;
    }
    public DataResult(T data,boolean success){
        super(success);/*super() ile super type classtan(Result) success bilgisi alınacaktır*/
        this.data = data;
    }

    //data bilgisinin dışarıdan kullanılabilmesi için getter yazılmaktadır.
    public T getData(){
        return this.data;
    }

}
