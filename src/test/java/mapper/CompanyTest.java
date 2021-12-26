package mapper;

import com.czy.domain.Company;
import com.czy.service.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class CompanyTest {

    @Autowired
    CompanyService companyService;

    @Test
    public void findAllCompanyTest(){
        List<Company> companyList = companyService.findAllCompany();
        System.out.println(companyList);
    }

    @Test
    public void loginTest(){
        Company company = companyService.login("byteDance","123456");
        System.out.println(company);
    }

    @Test
    public void findCompanyByIdTest(){
        Company company = companyService.findCompanyById(1);
        System.out.println(company);
    }

}
