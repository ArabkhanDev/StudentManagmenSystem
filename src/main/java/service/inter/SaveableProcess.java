/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.inter;

import bean.Config;

/**
 *
 * @author SMART
 */
public interface SaveableProcess extends Process{
     public default void process(){
        processLogic();
        Config.save();
       
    }
     
     
}
