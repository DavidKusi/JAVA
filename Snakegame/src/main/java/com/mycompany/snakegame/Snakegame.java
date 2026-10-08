/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.snakegame;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Box;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author start
 */


public class Snakegame extends JPanel implements ActionListener,KeyListener{
    
    JFrame frame = new JFrame("Snake Game");
        
    JPanel panel = new JPanel();
    
    Box player;
     
    Timer tm = new Timer(5,  this);
    
    public static int x = 100;
    
     public static int y = 100;
    
    static int velX = 0;
    
    static int velY = 0;
    
    static int rotX = 0;
    
    static int rotY = 0;
    
    public Snakegame(){
        
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        
       
        
        
                 
    }
    
    
    
    public void paintComponent(Graphics g){
        
        
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 700, 700);
        
        
        g.setColor(Color.GRAY);
        g.fillRect(x,y,35,35);
        
       
        
        
        g.setColor(Color.red);
        g.fillRoundRect(100, 25, 20, 20, 30, 40);
        
        
        g.setColor(Color.green);
        g.fillRect(-34+x, y, 35, 35);
        
        
    }
    
    
     
    public void keyTyped(KeyEvent e){
        
        
        
        
    }
    
    public void keyReleased(KeyEvent e){
        
        
    }
    
    
    public void actionPerformed(ActionEvent e){
        
        if(x < 0){
            velX = 0;
            x = 0;
        }
        if(x > 651){
            velX = 0;
            x = 651;
        }
        if(y < 0){
            velY = 0;
            y = 0;
        }
        if(y > 630){
            velY = 0;
            y = 630;
            
        }
            x = x + velX;
            
            y = y + velY;
            
            repaint();
        
    }
    public void keyPressed(KeyEvent e){
            
            int Keycode = e.getKeyCode();
            
            switch(Keycode){
                
                case KeyEvent.VK_LEFT:
                    System.out.println("Turn Left");
                    velX = -1;
                    velY = 0;
                    
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("Turn Right");
                    velX = 1;
                    velY = 0;
                    break;
                case KeyEvent.VK_UP:
                    System.out.println("Turn Up");
                    velX = 0;
                    velY = -1;
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("Turn Down");
                    velX = 0;
                    velY = 1;
                    break;
            }
                    
        }        
                
           
    public static void main(String[] args) {
        
        
            Snakegame s = new Snakegame();
          
            
            JFrame frame = new JFrame("Snake Game");
            
            frame.setTitle("Snakegame");
            frame.setSize(700,700);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(s);
            
            
            
            
                            
            
               
                              
                
    }
}
            
         


    


            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    

