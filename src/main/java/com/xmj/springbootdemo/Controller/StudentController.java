package com.xmj.springbootdemo.Controller;

import com.xmj.springbootdemo.annotation.MyLog;
import com.xmj.springbootdemo.entity.student.Student;
import com.xmj.springbootdemo.exception.ExcelException;
import com.xmj.springbootdemo.service.StudentService;
import com.xmj.springbootdemo.util.ExcelUtil;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Describe:
 * author:谢孟杰
 * Date:2018/11/3
 * Time:16:41
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentServicel;

    @GetMapping(value = "/index")
    public String toIndex(){
        return "/index";
    }

    /*
    * @Author: xieMengJie
    * @Date: 2018/12/1 15:39
    * @Param: [request, file]
    * @return: java.lang.String
    * @Description:  报表导入
    */
    @PostMapping(value = "/submitExcel")
    @ResponseBody
    public String submitExcel(HttpServletRequest request,@RequestParam(value="uploadFile")MultipartFile file){
        try {
            FileInputStream inputStream = (FileInputStream) file.getInputStream();
            LinkedHashMap map = new LinkedHashMap();
            map.put("学生状态","dr");
            map.put("学生姓名","studentName");
            map.put("学生年龄","age");
            //String [] pk = new String[]{"p"};
            List<T> students = ExcelUtil.excelToList(inputStream,"学生明细", Student.class,map,null);
            System.out.println(students);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ExcelException e) {
            e.printStackTrace();
        }
        return "ok";
    }


    @MyLog("查询全部学生信息")
    @GetMapping(value = "/students")
    @ResponseBody
    public String findAllStudent(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println(name);
        return studentServicel.findStudentAll();
    }
    @MyLog("批量插入学生信息")
    @GetMapping(value = "/add/Students")
    @ResponseBody
    public String addStudents(HttpServletRequest request){
        return studentServicel.addStudents();
    }

    
    @GetMapping(value = "/initStudents")
    @ResponseBody
    public String initStudents(HttpServletRequest request){
        String s =request.getServletContext().getAttribute("students").toString();
        return s;
    }

    /*
    * @Author: xieMengJie
    * @Date: 2018/12/1 15:39
    * @Param: [response]
    * @return: void
    * @Description: csv导出
    */
    @GetMapping(value = "/exportstudents")
    @ResponseBody
    public void exportStudent(HttpServletResponse response){
        try {
             studentServicel.exportStudents(response);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("导出失败");
        }
    }

    /**
     * 内部类
     */
    @Controller
    public class Test001Controller{

      /*
      * @Author: xieMengJie
      * @Date: 2018/11/16 22:39
      * @Param: []
      * @return: java.lang.String
      * @Description: 
      */
        @GetMapping(value = "/studentsTest")
        @ResponseBody
        public String findAllTestStudents(){
            return studentServicel.findStudentTest001All();
        }
    }


}
