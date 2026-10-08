/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplebankingapp;

import java.util.Scanner;

/**
 *
 * @author start
 */
public class SimpleBankingapp {
    
    public static int bal;
    
    public int wit;
    
    public int Newdeposit;
    
    private int age;
    
    public static  String Firstname;
    
    public static String Surname;
    
    public static  String Username;
    
    public  String Password;
    
    public String newuser;
    
    public  String Nuser;
    
    
    public int getbal(){
        
        return bal;
        
        
    }
    

  public void setbal(int newBalance){
      
        
        this.bal = newBalance;
        
        System.out.println("Users Balance:"+newBalance);
        
        
        
    }
  
 public  String getUser(){
     
     return Username;
     
     
 }
 
 public void setUser(String Newusername){
     
     
     
     
     this.Username = Newusername;
      
    System.out.println(Newusername);
           
        
     
     
 
     
 }
  static void Withdrawmoney(){
      
      Scanner Withdraw = new Scanner(System.in);
      
      SimpleBankingapp wal = new SimpleBankingapp();
      
      
      
      System.out.print("Amount:");
      int amo = Withdraw.nextInt();
      
       wal.wit = wal.bal -= amo;
      
      System.out.println("Balance:"+wal.wit);
      
      
      
      
      
  }
  public  static void Depositmoney(){
      
       Scanner Deposit = new Scanner(System.in);
       
       SimpleBankingapp tal = new SimpleBankingapp();
      
      System.out.print("Amount:");
      int amo = Deposit.nextInt();
      
       tal.Newdeposit = tal.bal += amo;
      
      
      System.out.println("Balance:"+tal.Newdeposit);
        
    
      
  }
  
  
  public   static void Createaccount(){
          
        Scanner details = new Scanner(System.in);
        
        SimpleBankingapp us = new SimpleBankingapp();
        
        System.out.print("Firstname:");
        String Firstname = details.next();
        
        
        System.out.print("Surname:");
        String Surname = details.next();
        
        
        
        
        System.out.print("Age:");
        int age = details.nextInt();
        
        
        System.out.print("Password:");
        String password = details.next();
        
        
        System.out.print("Input Balance:");
        bal = details.nextInt();
        
        Username = Firstname + Surname;
        
        System.out.println("==============================");
        
        System.out.println("Username:"+Username);
        System.out.println("Balance:"+bal);
        
        
  
  }
  
  public static void Useraccounts(){
      
      Scanner input = new Scanner(System.in);
      
      
      
      System.out.println("=========================");
      
      System.out.println(Username);
      
      System.out.println("=========================");
          
      
      
      
  }
  static void Mainmenu(){
      
        
        
        System.out.println("==============================");
        System.out.println("*****Simple Banking App*****");
        System.out.println("1.Create New Account");
        System.out.println("2.User Accounts");
        
        System.out.println("==============================");
        
        
      
      
  }
  

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        SimpleBankingapp bank = new SimpleBankingapp();
        
        LOOP: for(;;){
          Mainmenu();
      
        System.out.print("Enter User input:");
        int in = input.nextInt();
        
        switch(in){
            
            
            case 1:
                Createaccount();
                
        BOOP: for(;;){  
            
            if(in == 1){
                    
                    System.out.println("==============================");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Deposit Money");
                    System.out.println("5.Withdraw Money");
                    System.out.println("6.Go Back");
                    System.out.println("7.End");
                    System.out.println("==============================");
                    
                    System.out.print("Enter User input:");
                    int im = input.nextInt();
                    
                    
                    
        switch(im){
                    case 3:
                
             bank.setbal(bal);
             
             break;
                
                
            case 4:
                Depositmoney();
                break;
            
            case 5:
                Withdrawmoney();
                break;
            
            case 7:
               
                
                break LOOP;
            
            case 6:
                
               continue LOOP;
                
                
                 
                    
                
                
                
                
        }   
                }else{
                    
                    System.out.println("Invalid Choice");
                    
                    
                }
            }         
         
            
           
             case 2:
                Useraccounts();
                
            MOOP: for(;;){  
                if(in == 2){
                    
                    System.out.println("==============================");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Deposit Money");
                    System.out.println("5.Withdraw Money");
                    System.out.println("6.Go Back");
                    System.out.println("7.End");
                    System.out.println("==============================");
                    
                    System.out.print("Enter User input:");
                    int im = input.nextInt();
                    
                    
        switch(im){
                    case 3:
                
             bank.setbal(bal);
                break;
                
            case 4:
                Depositmoney();
                break;
            
            case 5:
                Withdrawmoney();
                break;
            
            case 7:
                break LOOP;
            
            case 6:
                
              continue LOOP;
        }
       
                }else{
                    
                    System.out.println("Done");
                    
                    
                }       
              
            
        }}
    }}}
            
       
       
        
        
        
    
    



