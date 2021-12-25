package mapper;

import com.czy.dao.StudentMapper;
import com.czy.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class StudentMapperTest {

    @Autowired
    private StudentMapper mapper;

    @Test
    public void findAllTest(){
        List<Student> studentList = mapper.findAll();
        System.out.println(studentList);
    }

    @Test
    public void insertStuTest(){
        Student student = new Student(8,"test");
        mapper.insertStudent(student);
    }

}
