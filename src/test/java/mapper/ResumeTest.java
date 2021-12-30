package mapper;

import com.czy.domain.Resume;
import com.czy.service.ResumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class ResumeTest {

    @Autowired
    ResumeService resumeService;

    @Test
    public void showUserResumeTest(){
        Resume resume = resumeService.showUserResume(2);
        System.out.println(resume);
    }

    @Test
    public void updateResume(){
        Integer userId = 2;
        Resume resume = new Resume();
        resume.setName("薛志一");
        resume.setPhone("123456");
        resume.setEmail("test");
        resume.setCard("123");
        resume.setLoc("上海");
        resume.setSchool("ecnu");
        resume.setMajor("software project");
        resume.setEdu_time("2018");
        resume.setEducation("benke");
        resume.setGrade("4.0");
        resume.setSelf_judge("bad");
        resumeService.updateResume(resume,userId);
    }

//    @Test
//    public void insertResume(){
//        resumeService.insertResume(3);
//    }

    @Test
    public void showResumeByJobIdTest(){
        List<Resume> resumes = resumeService.showResumeByJobId(1,1);
        System.out.println(resumes);
    }

}
