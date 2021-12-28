package mapper;

import com.czy.domain.Resume;
import com.czy.service.ResumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class ResumeTest {

    @Autowired
    ResumeService resumeService;

    @Test
    public void showUserResumeTest(){
        Resume resume = resumeService.showUserResume(1);
        System.out.println(resume);
    }

}
