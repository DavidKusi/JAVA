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
    
    String Sales;
    
    String Accounting;
    
    String Development;
    
    private String mailbox;
    
    
    public void setmailbox(String mail){
        
        
        this.mailbox = mail;
        
        
        
    }
    
    public String getmailbox(){
        
        
        return mailbox;
        
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

             Email.setmailbox("Mail:200mb");
         
             System.out.print(Email.getmailbox());
         
             
             
             
         }else{
             
             System.out.println("Email:"+fname+"."+sname+"@"+department+".company.com");
             
             MyPassword();
             
             Email.setmailbox("Mail:200mb");
         
             System.out.print(Email.getmailbox());
         
             
             
         }
         
         
         /*
         System.out.println("*******************");
         System.out.println("1.Change password");
         System.out.println("*******************");
         
         System.out.print("Enter number:");
         String num = input.nextLine();
         
         
        if(department == Sales){
             
             
             String ndepartment = fname + sname + department;
             
             
             
             
         }
         else if(department == Accounting){
        
             String ndepartment = fname + sname + department;
             
             
        
        
        
    }   else if(department == Development){
        
        
            String ndepartment = fname + sname + department;
        
        
        
    }*/
         
         
         
         
         
         
        
        
        
        
        
    }
}
