package com.example.utsrpll; // Ganti jika nama package kamu berbeda

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UtsrpllApplication implements CommandLineRunner {

    @Autowired
    private RuntimeService runtimeService;

    public static void main(String[] args) {
        SpringApplication.run(UtsrpllApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Memulai Proses BPMN Hello World...");
        // "Process_HelloWorld" ini harus sama dengan ID Process di Camunda Modeler
        runtimeService.startProcessInstanceByKey("Process_HelloWorld");
    }
}