package com.example.hrms.core.utilities.results;

public class SuccessResult extends Result {
    public SuccessResult(){
        super(true);/*işlme sonucunun başarıyla tamamladığını dönderecektir*/
    }
    public SuccessResult(String message){
        super(true,message);/*işlem sonucunu başarılı bir şekilde dönderip mesaj verecektir.*/

    }
}
