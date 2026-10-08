/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplecalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author start
 */





public abstract class Simplecalculator extends JFrame implements ActionListener {
    
       static JFrame frame;
       
       static JPanel panel; 
       
       static JTextField text; 
       
       static JButton button;
       
       static JButton button2;
       
       static JButton button3;
       
       static JButton button4;
       
       static JButton button5;
       
       static JButton button6;
       
       static JButton button7;
       
       static JButton button8;
       
       static JButton button9;
       
       static JButton button10;
       
       static JButton button11;
       
       static JButton button12;
       
       static JButton button13;
       
       static JButton button14;
       
       static JButton button15;
       
       static JButton button16;
       
       static JButton button17;
       
       static JRadioButton radio;
       
       static JRadioButton radio1;
       
       static ButtonGroup group;
       
       static double total;
       
       static int val1 ;
            
       static int val2;
       
       static String val3;
       
       static int num;
            
       static String d = ".";
       
       
            
       static  char operator;
            
           
     
 

     
       
       
    public static void main(String[] args) {
        
       frame = new JFrame();
       
       panel = new JPanel();
       
       text = new JTextField();
       
       button = new JButton();
       
       
       button2 = new JButton();
       
       button3 = new JButton();
       
       button4 = new JButton();
       
       button5 = new JButton();
       
       button6 = new JButton();
       
       button7 = new JButton();
       
       button8 = new JButton();
       
       button9 = new JButton();
       
       button10 = new JButton();
       
       button11 = new JButton();
       
       button12 = new JButton();
       
       button13 = new JButton();
       
       button14 = new JButton();
       
       button15 = new JButton();
       
       button16 = new JButton();
       
       button17 = new JButton();
       
       radio = new JRadioButton();
       
       radio1 = new JRadioButton();
       
       group = new ButtonGroup();
    
       
       frame.add(panel);
       frame.setSize(270,320);
       frame.setVisible(true);
       frame.setTitle("Calculator");
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       panel.setBackground(Color.white);
       panel.setVisible(true);
       panel.setLayout(null);
       panel.add(text);
       panel.add(button);
       panel.add(button2);
       panel.add(button3);
       panel.add(button4);
       panel.add(button5);
       panel.add(button6);
       panel.add(button7);
       panel.add(button8);
       panel.add(button9);
       panel.add(button10);
       panel.add(button11);
       panel.add(button12);
       panel.add(button13);
       panel.add(button14);
       panel.add(button15);
       panel.add(button16);
       panel.add(button17);
       panel.add(radio);
       panel.add(radio1);
       
       text.setBounds(10,20, 240, 40);
       text.setVisible(true);
       text.setLayout(null);
       text.setBackground(Color.white);
       text.setFont(new Font("Consolas",Font.PLAIN,35));
       
       
       
       button.setBounds(10, 240, 115, 35);
       button.setText("0");
       button.setVisible(true);
       button.setLayout(null);
       button.setBackground(Color.WHITE);
 
       button2.setBounds(140, 240, 110, 35);
       button2.setText("=");
       button2.setVisible(true);
       button2.setLayout(null);
       button2.setBackground(Color.WHITE);
       
       button3.setBounds(10, 200, 50, 35);
       button3.setText("1");
       button3.setVisible(true);
       button3.setLayout(null);
       button3.setBackground(Color.WHITE);
       button3.setActionCommand("1");
       
       button4.setBounds(75, 200, 50, 35);
       button4.setText("2");
       button4.setVisible(true);
       button4.setLayout(null);
       button4.setBackground(Color.WHITE);
       button4.setActionCommand("2");
       
       button5.setBounds(140, 200, 50, 35);
       button5.setText("3");
       button5.setVisible(true);
       button5.setLayout(null);
       button5.setBackground(Color.WHITE);
       button5.setActionCommand("3");
       
       button6.setBounds(10, 160, 50, 35);
       button6.setText("4");
       button6.setVisible(true);
       button6.setLayout(null);
       button6.setBackground(Color.WHITE);
       button6.setActionCommand("4");
       
       button7.setBounds(75, 160, 50, 35);
       button7.setText("5");
       button7.setVisible(true);
       button7.setLayout(null);
       button7.setBackground(Color.WHITE);
       button7.setActionCommand("5");
       
       button8.setBounds(140, 160, 50, 35);
       button8.setText("6");
       button8.setVisible(true);
       button8.setLayout(null);
       button8.setBackground(Color.WHITE);
       button8.setActionCommand("6");
       
       button9.setBounds(10, 120, 50, 35);
       button9.setText("7");
       button9.setVisible(true);
       button9.setLayout(null);
       button9.setBackground(Color.WHITE);
       button9.setActionCommand("7");
       
       button10.setBounds(75, 120, 50, 35);
       button10.setText("8");
       button10.setVisible(true);
       button10.setLayout(null);
       button10.setBackground(Color.WHITE);
       button10.setActionCommand("8");
       
       button11.setBounds(140, 120, 50, 35);
       button11.setText("9");
       button11.setVisible(true);
       button11.setLayout(null);
       button11.setBackground(Color.WHITE);
       button11.setActionCommand("9");
       
       button12.setBounds(200, 120, 50, 35);
       button12.setText("-");
       button12.setVisible(true);
       button12.setLayout(null);
       button12.setBackground(Color.WHITE);
       button12.setActionCommand("-");
       
       button13.setBounds(200, 160, 50, 35);
       button13.setText("*");
       button13.setVisible(true);
       button13.setLayout(null);
       button13.setBackground(Color.WHITE);
       button13.setActionCommand("*");
       
       button14.setBounds(200, 200, 50, 35);
       button14.setText("/");
       button14.setVisible(true);
       button14.setLayout(null);
       button14.setBackground(Color.WHITE);
       button14.setActionCommand("/");
       
       button15.setBounds(75, 80, 50, 35);
       button15.setText("%");
       button15.setVisible(true);
       button15.setLayout(null);
       button15.setBackground(Color.WHITE);
       
       button16.setBounds(140, 80, 50, 35);
       button16.setText("C");
       button16.setVisible(true);
       button16.setLayout(null);
       button16.setBackground(Color.WHITE);
       
       button17.setBounds(200, 80, 50, 35);
       button17.setText("+");
       button17.setVisible(true);
       button17.setLayout(null);
       button17.setBackground(Color.WHITE);
       
       radio.setBounds(10, 95, 50, 20);
       radio.setText("OFF");
       radio.setVisible(true);
       radio.setLayout(null);
       radio.setBackground(Color.WHITE);
       
       
       
       
       radio1.setBounds(10, 75, 50, 20);
       radio1.setText("ON");
       radio1.setVisible(true);
       radio1.setLayout(null);
       radio1.setBackground(Color.WHITE);
       radio1.doClick();
       
       group.add(radio);
       group.add(radio1);
       
       
       
       
       
           
    
    
    button4.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
           if(text.getText().isEmpty()){
               
               text.setText(button4.getText());
               val1 = 2;
              
              }else{
           text.setText(text.getText() + button4.getText());
           val2 = 2;
           
    }
          
           
        }
    });
    
    
    
       button5.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
            
            if(text.getText().isEmpty()){
                
                text.setText(button5.getText());
                val1 = 3;
            }else{
                    
                    text.setText(text.getText() + button5.getText());
                    val2 = 3;
                    
                }
            
                
                
    }
    });
       
    button.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
           if(text.getText().isEmpty()){
                
                text.setText(button.getText());
                val1 = 0;
               }else{
                    
                    text.setText(text.getText() + button.getText());
                    val2 = 0;
           }
           
        } 
    
        
    });
       
    button6.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
           if(text.getText().isEmpty()){
                
                text.setText(button6.getText());
                val1 = 4;
           }else{
                    
                    text.setText(text.getText() + button6.getText());
                    val2 = 4;
            
           }
           
    
           
    }
    });
       
       
     button7.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
           if(text.getText().isEmpty()){
                
                text.setText(button7.getText());
                val1 = 5;
            }else{
                    
                    text.setText(text.getText() + button7.getText());
                    val2 = 5;
           }
         
        }     
    
    });
        
    button8.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
           
           if(text.getText().isEmpty()){
                
                text.setText(button8.getText());
                val1 = 6;
               
            }else{
                    
                    text.setText(text.getText() + button8.getText());
                    val2 = 6;
            
           }
          
        }
           
    
    });
    
    button9.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
           
           if(text.getText().isEmpty()){
               
                text.setText(button9.getText());
                val1 = 7;
               }else{
                    
                    text.setText(text.getText() + button9.getText());
                    val2 = 7;
               
           }
           
        }
               
          
           
    
    });
    
    
    button10.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
           if(text.getText().isEmpty()){
                
                text.setText(button10.getText());
                val1 = 8;
               }else{
                    
                    text.setText(text.getText() + button10.getText());
                    val2 = 8;
               
           }
               
               
          
           
    }
    });
    
     button3.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
           if(text.getText().isEmpty()){
                
                text.setText(button3.getText());
                val1 = 1;
               }else{
                    
                    text.setText(text.getText() + button3.getText());
                    val2 = 1;
               
           }
               
               
          
           
    }
    });
    button11.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
           if(text.getText().isEmpty()){
                
                text.setText(button11.getText());
                val1 = 9 ;
                
          
            }else{
                    
                    text.setText(text.getText() + button11.getText());
                    val2 = 9;   
               
            
            
           }
           
          
               
        }  
           
    
    });
    
    button12.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
           
                
               
                operator = '-';
                text.setText(button12.getText());
                
                
            
           
           
              
               
               
               
            
               
               
          
           
    }
    });
    
    button13.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
                
                
                operator = '*';
                text.setText(button13.getText());
                
                
            
           
           
              
               
               
               
               
          
           
    }
    });
    
    
    button14.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
           
            
                
                
                operator = '/';
                text.setText(button14.getText());
                
                
            
            
           
               
               
               
               
               
            
               
          
           
    }
    });
    
    button17.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
            
           
                
                
                operator = '+';
                text.setText(button17.getText());
                
                
            
           
                
            
           
               
               
              
               
            
               
               
          
           
    }
    });
     button15.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
            
           
                
                
                operator = '%';
                text.setText(button15.getText());
                
                
            
           
                
            
           
               
               
              
               
            
               
               
          
           
    }
    });
     
     button2.addActionListener(new ActionListener(){
        
       @Override
        public void actionPerformed(ActionEvent e){
            
            
                
            
            switch(operator){
                
                case '+':
                
                total = val1 + val2;
                
                break;
            
                case '-':
                
                total = val1 - val2;
                
                break;
                
                case '/':
            
                total = val1 / val2;
                
                break;
                
                case '*':
                    
                total = val1 * val2;
                
                break;
                
                case '%':
                    
                total = total / 100;
                
                break;
                
           
                
        
                
            }
            
                
               String result = Double.toString(total);
                text.setText(result);
                
                
               
            
            }
            
           
            
            
            
            
            
            
             
     });
            
           
     
        
  radio.addActionListener(new ActionListener(){
        
       @Override
       
       public void actionPerformed(ActionEvent e){
           
          
               text.setText("------------");
               button.setEnabled(false);
               button2.setEnabled(false);
               button3.setEnabled(false);
               button4.setEnabled(false);
               button5.setEnabled(false);
               button6.setEnabled(false);
               button7.setEnabled(false);
               button8.setEnabled(false);
               button9.setEnabled(false);
               button10.setEnabled(false);
               button11.setEnabled(false);
               button12.setEnabled(false);
               button13.setEnabled(false);
               button14.setEnabled(false);
               button15.setEnabled(false);
               button16.setEnabled(false);
               button17.setEnabled(false);
               
               
          
          
            
            
       }
       
       
       
   });
    
    radio1.addActionListener(new ActionListener(){
        
       @Override
       
       public void actionPerformed(ActionEvent e){
           
           
               text.setText("");
               button.setEnabled(true);
               button2.setEnabled(true);
               button3.setEnabled(true);
               button4.setEnabled(true);
               button5.setEnabled(true);
               button6.setEnabled(true);
               button7.setEnabled(true);
               button8.setEnabled(true);
               button9.setEnabled(true);
               button10.setEnabled(true);
               button11.setEnabled(true);
               button12.setEnabled(true);
               button13.setEnabled(true);
               button14.setEnabled(true);
               button15.setEnabled(true);
               button16.setEnabled(true);
               button17.setEnabled(true);
           
          
            
            
       }
       
       
       
       
       
   });
    
    
    button16.addActionListener(new ActionListener(){
        
       @Override
       
       public void actionPerformed(ActionEvent e){
       
            
           text.setText("");
           
       
       
       }
       
       });
    
    
    
    
    
    }
   
           
       
     }
                 
