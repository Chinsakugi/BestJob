package mapper;

import com.czy.dao.JobDao;
import com.czy.domain.Job;
import com.czy.domain.Record;
import com.czy.service.JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class JobTest {

    @Autowired
    JobService jobService;

    @Autowired
    JobDao jobDao;

    @Test
    public void findJobByCompanyIdTest(){
        List<Job> jobList = jobService.findJobList(1);
        System.out.println(jobList);
    }

    @Test
    public void findAllJob(){
        List<Job> jobList = jobDao.findAllJob();
        System.out.println(jobList);
    }

    @Test
    public void findJobByCompanyNameAndJobCategoryTest(){
        List<Job> jobList = jobService.findJobByCompanyNameAndJobCategory("字节");
        System.out.println(jobList);
    }

    @Test
    public void findByMultiConditionTest(){
        List<Job> jobList = jobService.findByMultiCondition("深圳","工程师",null,null,null,null);
        System.out.println(jobList);
    }

    @Test
    public void findRecordByUserIdTest(){
        List<Record> recordList = jobService.findRecordByUserId(1);
        System.out.println(recordList);
    }

//    @Test
//    public void insetRecordTest(){
//        jobService.insertRecord(2,3);
//        List<Record> recordList = jobService.findRecordByUserId(2);
//        System.out.println(recordList);
//    }

    @Test
    public void findJobByCompanyTest(){
        List<Job> jobList = jobService.findJobByCompany(1);
        System.out.println(jobList);
    }

//    @Test
//    public void insertJobTest(){
//        jobService.insertJob("test","test","test","test","test",
//                             "test","test",1,"test");
//    }

//    @Test
//    public void deleteJobTest(){
//        jobService.deleteJob(10,1);
//    }

//    @Test
//    public void updateJobTest(){
//        jobService.updateJob(18,"2222",null,null,null,null,null,null
//                            ,2,null);
//    }

    @Test
    public void findRecordByUserIdAndJobIdTest(){
        Record record = jobService.findRecordByUserIdAndJobId(2,2);
        System.out.println(record);
    }
}
