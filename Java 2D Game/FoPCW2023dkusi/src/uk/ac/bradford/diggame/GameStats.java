/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.bradford.diggame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SystemColor;

/**
 *
 * @author dkusi
 */
public class GameStats {
    
    public String text;
    public Font font;
    public double x,y;
    ;
    
    public GameStats(String text, Font font, int x , int y){
        
        this.font = font;
        this.text = text;
        this.x = x;
        this.y = y;
        
        
        
    }

  

    public GameStats(int text, Font font, int x , int y){
        
        this.font = font;
        this.text = "" + text;
        this.x = x;
        this.y = y;
        
        
        
    }
 
    
    
    public void draw(Graphics2D g2){
        
        g2.setColor(Color.BLACK);
        g2.setFont(font);
        g2.drawString(text, (float)x, (float)y);
    }
    

    }

    

