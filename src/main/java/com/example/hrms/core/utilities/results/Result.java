package com.example.hrms.core.utilities.results;

public class Result {//super type
private boolean success;
private String message;

public Result(boolean success){
    this.success = success;
}
public Result(boolean success,String message){
    this(success);/*burada yazdığımız komutu 'this.success = success' şeklinde yazabiliriz
    .Yalnız yazacağımız o komut 'do not repeat yourself' kuralını ihlal ettiği için
     tercih edilmemelidir.*/
    this.message = message;

}
//dışarıdan erişim sağlamak için  getter kullanılmalıdır.
    public boolean isSuccess() /*getSuccess de kullanılabilir*/{
    return  this.success;
    }
    public String getMessage(){
    return this.message;
    }
}
