/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import lombok.SneakyThrows;

/**
 *
 * @author SMART
 */

public class Teacher extends Person{
    @WritingStyle
    private String tSchoolName;
    private double teacherSalary;
    private Student[] teacherStudents;
    
    @SneakyThrows
    public void foo(int a){
        if(a > 9){
            throw new Exception();
        }
    }

    
    
    
    
    
    
}
