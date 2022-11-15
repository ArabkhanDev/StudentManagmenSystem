/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.inter.menu.MenuAddTeacherServiceInter;

/**
 *
 * @author SMART
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter{

    @Override
    public void processLogic() {
        System.out.println("enter name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("enter surname : ");
        Scanner sc2 = new Scanner(System.in);
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("teacher added");
        
    }
}
