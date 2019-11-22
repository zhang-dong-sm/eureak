package com.example.eurekateacher.controller;


import com.example.eurekateacher.easyServer.StudentSever;
import com.example.eurekateacher.po.Student;
import com.example.eurekateacher.po.Teacher;
import com.example.eurekateacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/teacher")

public class TeacherController {
    @Autowired
    TeacherService service;

    @Autowired
    DiscoveryClient client;

    @Autowired
    StudentSever studentSever;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/select")
    public Teacher select(Long id){
        return service.select(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody  Teacher teacher){
        System.out.println(teacher);
        service.save(teacher);
    }
    @GetMapping("/seleStu")
    public  Student getStudent(Long id){
       // return restTemplate.getForEntity("http://STUDENTSERVER:2100/student/select?id="+id, Student.class).getBody();
        return  studentSever.select(id);
    }

    @PostMapping("/saveStu")
    public Student save(@RequestBody Student student){
        return studentSever.saveStudent(student);
    }

    @GetMapping("/deStu")
    public void deStu(Long id){

        studentSever.deleteStudent(id);
    }


    @GetMapping("/serverUrl")
    public Map<String, List<ServiceInstance>> getServerUrl(){
        Map<String, List<ServiceInstance>> msl = new HashMap<>();
        List<String> services = client.getServices();
        for (String service : services) {
            List<ServiceInstance> sis = client.getInstances(service);
            msl.put(service, sis);
        }
        return msl;
    }
}
