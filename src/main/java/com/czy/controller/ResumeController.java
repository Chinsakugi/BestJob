package com.czy.controller;

import com.czy.domain.Company;
import com.czy.domain.Resume;
import com.czy.domain.User;
import com.czy.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;

@RestController
@CrossOrigin
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @RequestMapping(value = "/personal",method = RequestMethod.GET)
    @ResponseBody
    public Object personal(@RequestParam(value = "session",required = false) HttpSession session){
        User user = (User) session.getAttribute("user");
        if (user==null){
            return "您当前未登录";
        }else {
            return resumeService.showUserResume(user.getId());
        }
    }

    @RequestMapping(value = "/personal",method = RequestMethod.PUT)
    @ResponseBody
    public Object updateResume(@RequestParam(value = "session",required = false) HttpSession session, @RequestBody Resume resume){
        User user = (User) session.getAttribute("user");
        if (user==null){
            return "修改失败";
        }else {
            resumeService.updateResume(resume,user.getId());
            return "修改成功";
        }
    }

    @RequestMapping(value = "/jobApply",method = RequestMethod.GET)
    @ResponseBody
    public Object getResumesByJob(@RequestParam("session") HttpSession session,@RequestParam("id") Integer jobId){
        Company company = (Company) session.getAttribute("company");
        if (company==null){
            return "error";
        }
        List<Resume> resumeList = resumeService.showResumeByJobId(company.getId(),jobId);
        return resumeList;
    }

    @RequestMapping(value = "/personal",method = RequestMethod.POST)
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
    }

}
