/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.inter.menu.MenuAddStudentServiceInter;

/**
 *
 * @author SMART
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void processLogic() {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter name : ");
       String name = sc.nextLine();
       
        System.out.println("enter surname : ");
       Scanner sc2 = new Scanner(System.in);
       String surname = sc2.nextLine();
       
       Student s = new Student();
       s.setName(name);
       s.setSurname(surname);
                    
        Config.instance().appendStudent(s);
       System.out.println("student added");
       
    }
    
}
