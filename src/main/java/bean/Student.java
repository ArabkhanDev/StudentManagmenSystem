/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import lombok.Data;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author SMART
 */
@Data
public class Student extends Person{
    
    private String schoolName;
    private double scholarship;

    @SneakyThrows
    public void foo(int a){
        if(StringUtils.isBlank(""))
        if(a > 9){
            
        }
    
    
    

    } 
    
    
}
