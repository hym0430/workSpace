package com.xmj.springbootdemo.entity.student;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.pk_student
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    private String pkStudent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.dr
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    private String dr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.student_name
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    private String studentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.pk_student
     *
     * @return the value of student.pk_student
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public String getPkStudent() {
        return pkStudent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.pk_student
     *
     * @param pkStudent the value for student.pk_student
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public void setPkStudent(String pkStudent) {
        this.pkStudent = pkStudent == null ? null : pkStudent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.dr
     *
     * @return the value of student.dr
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public String getDr() {
        return dr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.dr
     *
     * @param dr the value for student.dr
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.student_name
     *
     * @return the value of student.student_name
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.student_name
     *
     * @param studentName the value for student.student_name
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbggenerated Sat Nov 03 16:30:19 CST 2018
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}