package com.example.utsrpll; // Ganti jika nama package kamu berbeda

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("helloWorld") // Nama ini WAJIB sama dengan Delegate Expression di Camunda!
public class HelloWorldDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("=========================================");
        System.out.println("HELLO WORLD! Integrasi BPMN & Spring Boot Berhasil!");
        System.out.println("=========================================");
    }
}