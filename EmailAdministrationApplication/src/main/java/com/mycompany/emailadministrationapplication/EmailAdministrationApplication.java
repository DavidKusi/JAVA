/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.emailadministrationapplication;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author start
 */




public class EmailAdministrationApplication {
    
 
    static int limit = 8;
    
    static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz&*&^%$#@";
    
    static String Sales;
    
    static String Accounting;
    
    static String Development;
    
    
    
static void  MyEmail(){

    
    
    
    
    

}

   static void MyPassword(){
    
    Random ran =  new Random();
    
    StringBuilder String = new StringBuilder();
    
    for(int i = 0; i < limit; i++){
        
        int index = ran.nextInt(alphabet.length());
        
        String.append(alphabet.charAt(index));
    }
   
    
    System.out.print("Password:"+String);
}
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
         EmailAdministrationApplication Email = new EmailAdministrationApplication();
         
         System.out.print("Enter your Firstname:");
         String fname = input.nextLine();
         
         System.out.print("Enter your Surename:");
         String sname = input.nextLine();
         
         System.out.print("Department:");
         String department = input.nextLine();
         
         if(department.isEmpty()){
             
             System.out.println("Email:"+fname+"."+sname+"@"+"********"+".company.com");
             
             MyPassword();
             
             
             
         }else{
             
             System.out.println("Email:"+fname+"."+sname+"@"+department+".company.com");
             
             MyPassword();
             
             
         }
         
      /*   if(department == Sales){
             
             
             String ndepartment = fname + sname + department;
             
             
             
             
         }
         else if(department == Accounting){
        
             String ndepartment = fname + sname + department;
             
             
        
        
        
    }   else if(department == Development){
        
        
            String ndepartment = fname + sname + department;
        
        
        
    }*/
         
         
         
         
         
         
        
        
        
        
        
    }
}
