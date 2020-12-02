package com.example.demo06.mapper;

import com.example.demo06.bean.Achieve;
import com.example.demo06.bean.Student;
import com.example.demo06.bean.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    List<Student> queryForList();
    Student selectByUsernameAndPassword(String name,String password);
    Student selectByUsername(String name);
    Student selectByUserId(Integer id);
    List<Achieve> getAchieves(Integer id);
    List<Subject> getSubjects(Integer id);
    int setAchieve(String name,Integer id);
    int setSubject(Integer subId,Integer stuId);
    int updateByUserId(Student student);
    int deleteAchieve(Integer idAchieves);
    int deleteSubject(Integer subId,Integer stuId);
    int changeGrade(Integer grades,Integer idsubstu);
    int register(Student student);
    int choosen(Integer id);
}
