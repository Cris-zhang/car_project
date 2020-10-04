package com.qcby.carsProject.entity.Base;

public class ReturnModel<T> {

    private int code = 200;

    private String message = "成功了!";

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void error(String message){
        this.code = 500;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReturnModel{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
