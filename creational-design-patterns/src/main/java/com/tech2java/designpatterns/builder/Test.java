package com.tech2java.designpatterns.builder;

public class Test {
    public static void main(String[] args) {

        //HttpClient httpClient=new HttpClient("GET","http://test.com",null,null,null,null);

        //inner class
        HttpClient httpClient=new HttpClient.HttpClientBuilder().method("GET").
        secure("user","pwd").url("http://test.com").body("{}").build();
    }
}
