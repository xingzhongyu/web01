package com.example.demo06.controller;

import com.example.demo06.bean.Achieve;
import com.example.demo06.bean.RespBean;
import com.example.demo06.bean.Student;
import com.example.demo06.bean.Subject;
import com.example.demo06.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @GetMapping("/studentsList")
    public  List<Student> list(){
        return  studentMapper.queryForList();
    }
    @GetMapping("/students")
    public Student getStudent(@PathParam("username")String username){
        return studentMapper.selectByUsername(username);
    }
    @PostMapping("/login")
    public RespBean login(@RequestParam("username") String username, @RequestParam("password") String password){
        Student student=studentMapper.selectByUsernameAndPassword(username,password);
        System.out.println(student);
        if (student!=null){
            if ("admin".equals(student.getStudentname())){
                return new RespBean("admin","登录成功");
            }
            return new RespBean("success","登录成功");
        }else {
            return  new RespBean("error","登录失败");
        }
    }
    @GetMapping("/information")
    public Student information(@PathParam("id") Integer id){
        return  studentMapper.selectByUserId(id);
    }
    @GetMapping("/achieves")
    public List<Achieve> getAchieves(@PathParam("id") Integer id){
        return  studentMapper.getAchieves(id);
    }
    @GetMapping("/subjects")
    public List<Subject> subjects(@PathParam("id") Integer id){
        return studentMapper.getSubjects(id);
    }
    @PostMapping("/achieves")
    public  RespBean setAchieve(@RequestParam("name") String name,@RequestParam("id") Integer id){
        Integer num=studentMapper.setAchieve(name,id);
        return new RespBean("success",num+"");
    }
    @PostMapping("/subjects")
    public RespBean setSubject(@RequestParam("subId")Integer subId,@RequestParam("stuId")Integer stuId){
            Integer num=studentMapper.setSubject(subId,stuId);
            return new RespBean("success",num+"");
    }
    @PutMapping("/students")
    public RespBean updateByUserId(@RequestBody Student student){
            Integer num=studentMapper.updateByUserId(student);
            return new RespBean("success",num+"");
    }
    @DeleteMapping("/achieves")
    public RespBean deleteAchieve(@RequestParam("idAchieve") Integer idAchieve){
        int num=studentMapper.deleteAchieve(idAchieve);
        return new RespBean("success",num+"");
    }
    @DeleteMapping("/subjects")
    public RespBean deleteSubject(@RequestParam("subId") Integer subId,@RequestParam("stuId") Integer stuId){
        int num=studentMapper.deleteSubject(subId,stuId);
        return new RespBean("success",num+"");
    }
}
