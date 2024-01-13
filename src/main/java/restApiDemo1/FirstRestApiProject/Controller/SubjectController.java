package restApiDemo1.FirstRestApiProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restApiDemo1.FirstRestApiProject.Model.Subject;
import restApiDemo1.FirstRestApiProject.Service.SubjectService;

import java.util.List;

@RestController // whenever we want to get data from postman and display on postman then we use this controller
public class SubjectController
{

    @Autowired
    private SubjectService service;

    @GetMapping("/msg")//JUST CHECKING WHETHER EVERY THING IS WORKING PROPERLY AND THIS MESSAGE IS GETTING PRINTED ON POSTMAN OR NOT
    public String test(){
        return "WELCOME TO REST-API";
    }

    @GetMapping("/display")//WE ARE USING THIS SO THAT WE CAN DISPLAY ALL THE DATA
    public List<Subject> displayData(){
        return service.displaySubject();
    }

    @GetMapping("/display/{id}")//WE ARE USING THIS TO PRINT ONLY SPECIFIC ID DATA
    public Subject getSubjectObject(@PathVariable int id){
        return  service.getSubjectObject(id);
    }

    @PostMapping("/display/insertData")//WE ARE PROVIDING THIS MEANS WE HAVE TO PROVIDE THIS IN THE POSTMAN AS SAME AS IT IS HERE
    public void addNewData(@RequestBody Subject subject){
        service.addData(subject);
    }

    @PutMapping("/display/update/{id}")//WE ARE PROVIDING THIS MEANS WE ARE UPDATING THE DATA
    public void update(@RequestBody Subject s,@PathVariable int id){
        service.updateData(s,id);
    }

    @DeleteMapping("/display/delete/{id}")//WE ARE PROVIDING THIS MEANS WE ARE GOING TO DELETE THE DATA
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
