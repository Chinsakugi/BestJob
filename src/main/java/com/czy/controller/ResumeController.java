package com.czy.controller;

import com.czy.domain.Company;
import com.czy.domain.Record;
import com.czy.domain.Resume;
import com.czy.domain.User;
import com.czy.service.CompanyService;
import com.czy.service.JobService;
import com.czy.service.ResumeService;
import com.czy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;

    @Autowired
    JobService jobService;

    @GetMapping("/personal")
    @ResponseBody
    public Object personal(@RequestParam(value = "session",required = false) String phone){
        User user = userService.findUserByPhone(phone);
        if (user==null){
            return "您当前未登录";
        }else {
            return resumeService.showUserResume(user.getId());
        }
    }//3

    @PutMapping("/personal")
    @ResponseBody
    public Object updateResume(@RequestParam(value = "session",required = false) String phone, @RequestBody Resume resume){
        User user = userService.findUserByPhone(phone);
        System.out.println(resume);
        System.out.println(user);
        System.out.println(phone);
        if (user==null){
            return "修改失败";
        }else {
            resumeService.updateResume(resume,user.getId());
            return "修改成功";
        }
    }//4

    @GetMapping("/jobApply")
    @ResponseBody
    public Object getResumesByJob(@RequestParam("session") String username,@RequestParam("id") Integer jobId){
        Company company = companyService.findCompanyByUsername(username);
        if (company==null){
            return "未登录";
        }
        List<Map<Object, Object>> resultList = new ArrayList<>();
        List<Resume> resumeList = resumeService.showResumeByJobId(company.getId(),jobId);
        for (Resume resume : resumeList){
            Map<Object, Object> temp = new HashMap<>();
            temp.put("id",resume.getId());
            temp.put("userId",resume.getUserId());
            temp.put("name",resume.getName());
            temp.put("phone",resume.getPhone());
            temp.put("email",resume.getEmail());
            temp.put("card",resume.getCard());
            temp.put("loc",resume.getSchool());
            temp.put("school",resume.getSchool());
            temp.put("major",resume.getMajor());
            temp.put("edu_time",resume.getEdu_time());
            temp.put("education",resume.getEducation());
            temp.put("grade",resume.getGrade());
            temp.put("company",resume.getCompany());
            temp.put("work_time",resume.getWork_time());
            temp.put("work_position",resume.getWork_position());
            temp.put("work_description",resume.getWork_description());
            temp.put("project",resume.getProject());
            temp.put("project_position",resume.getProject_position());
            temp.put("project_time",resume.getProject_time());
            temp.put("project_description",resume.getProject_description());
            temp.put("self_judge",resume.getSelf_judge());
            //添加状态信息
            Record record = jobService.findRecordByUserIdAndJobId(resume.getUserId(),jobId);
            temp.put("deliveryTime",record.getDeliveryTime());
            temp.put("evaluationTime",record.getEvaluationTime());
            temp.put("interviewTime",record.getInterviewTime());
            temp.put("stopTime",record.getStopTime());
            temp.put("offerTime",record.getOfferTime());
            resultList.add(temp);
        }
        return resultList;
    }//14

    @GetMapping("/personal1")
    @ResponseBody
    public void upload(@RequestParam MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String filename = file.getOriginalFilename();
        String upload = request.getServletContext().getRealPath("upload/");

        File fileDir = new File(upload);
        File[] files = fileDir.listFiles();
        for (File f : files){
            f.delete();
        }

        String path = upload+filename;
        File filePath = new File(path);
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filePath));
        outputStream.write(file.getBytes());
        outputStream.flush();
        outputStream.close();
    }//5

}
