package com.example.eurekateacher.easyServer;


import com.example.eurekateacher.po.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "STUDENTSERVER",fallback = StudentHystrix.class)
public interface StudentSever {

    @GetMapping("/student/select")
    //@HystrixCommand(fallbackMethod ="protect" )
    Student  select(@RequestParam("id") Long cc);

   /* default Student protect(Long id){
        return new Student();
    }*/


    @PostMapping("/student/save")
    Student saveStudent(Student student);

    @GetMapping("/student/delete")
    public void deleteStudent(@RequestParam("id") Long cc);
}
