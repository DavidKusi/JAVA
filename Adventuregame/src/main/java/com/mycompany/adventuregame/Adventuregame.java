/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adventuregame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author start
 */
public class Adventuregame {
    
    

    public static void main(String[] args) {
        JFrame frame = new JFrame();
       
        JPanel panel = new JPanel();
        
        JTextField text = new JTextField();
        
        JLabel label = new JLabel();
        
        JLabel dead15 = new JLabel();
        
        JLabel dead30 = new JLabel();
        
        JLabel Health = new JLabel();
        
        JLabel Weaponname = new JLabel();
        
        JLabel Weapon = new JLabel();
        
        JLabel Desc = new JLabel();
        
        JLabel Gaurd = new JLabel();
        
        JLabel What = new JLabel();
        
        JLabel Talk2 = new JLabel();
        
        JLabel Talk3 = new JLabel();
        
        JLabel Talk4 = new JLabel();
        
        JLabel Talk5 = new JLabel();
        
        JLabel Stab = new JLabel();
        
        JLabel Strike = new JLabel();
        
        JLabel Parry = new JLabel();
        
        JLabel Hit = new JLabel();
        
        JLabel Game = new JLabel();
        
        JLabel Dead = new JLabel();
        
        JLabel Over = new JLabel();
        
        JLabel Is = new JLabel();
        
        JLabel dodge = new JLabel();
        
        JLabel hat = new JLabel();
        
        JLabel dh = new JLabel ();
        
        JLabel Stab1 = new JLabel();
        
        JLabel Win = new JLabel();
        
        JLabel Health15 = new JLabel();
        
        JLabel Health30 = new JLabel();
        
        JButton button = new JButton();
        
        JButton Talk = new JButton();
        
        JButton Attack = new JButton();
        
        JButton Leave = new JButton();
        
        JButton Dagger = new JButton();
        
        JButton leave1 = new JButton();
        
        JButton leave2 = new JButton();
        
        JButton Kill = new JButton();
        
        JButton Berries = new JButton();
        
        JButton Continue = new JButton();
        
        JButton attackhob = new JButton();
        
        JButton Continue1 = new JButton();
        
        JButton Continue2 = new JButton();
        
       
        
        frame.setTitle("ForestHunt");
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
       
        
        
        
        panel.setBackground(Color.BLACK);
        panel.setSize(700,700);
        panel.setVisible(true);
        panel.setLayout(null);
        panel.add(label);
        panel.add(Health);
        panel.add(button);
        panel.add(Weaponname);
        panel.add(Weapon);
        panel.add(Desc);
        panel.add(Gaurd);
        panel.add(What);
        panel.add(Talk);
        panel.add(Attack);
        panel.add(Leave);
        panel.add(Talk2);
        panel.add(Talk3);
        panel.add(Talk4);
        panel.add(Talk5);
        panel.add(Dagger);
        panel.add(leave1);
        panel.add(Kill);
        panel.add(Stab);
        panel.add(Parry);
        panel.add(Strike);
        panel.add(Hit);
        panel.add(Continue);
        panel.add(Game);
        panel.add(Dead);
        panel.add(Over);
        panel.add(Is);
        panel.add(Berries);
        panel.add(leave2);
        panel.add(attackhob);
        panel.add(dodge);
        panel.add(hat);
        panel.add(dh);
        panel.add(Stab1);
        panel.add(Continue1);
        panel.add(Continue2);
        panel.add(Win);
        panel.add(dead15);
        panel.add(dead30);
        panel.add(Health15);
        panel.add(Health30);
        
        button.setBackground(Color.BLACK);
        button.setBounds(600,450,100,50);
        button.setText("START");
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setForeground(Color.WHITE);
        
        button.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
        
        
        label.setText("HP:");
        label.setBounds(100,10,100,100);
        label.setVisible(true);
        label.setLayout(null);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        
        Health.setText("15");
        Health.setBounds(230,10,100,100);
        Health.setVisible(true);
        Health.setLayout(null);
        Health.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Health.setForeground(Color.WHITE);
        
        Weaponname.setText("Weapon:");
        Weaponname.setBounds(800,10,170,100);
        Weaponname.setVisible(true);
        Weaponname.setLayout(null);
        Weaponname.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Weaponname.setForeground(Color.WHITE);
        
        Weapon.setText("Dagger");
        Weapon.setBounds(1030,10,130,100);
        Weapon.setVisible(true);
        Weapon.setLayout(null);
        Weapon.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Weapon.setForeground(Color.WHITE);
        //
        Desc.setText("You are at the gate of a small desolate town.");
        Desc.setBounds(100,100,800,200);
        Desc.setVisible(true);
        Desc.setLayout(null);
        Desc.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Desc.setForeground(Color.WHITE);
        
        Gaurd.setText("A guard is standing by the entrance of the gate.");
        Gaurd.setBounds(100,200,800,200);
        Gaurd.setVisible(true);
        Gaurd.setLayout(null);
        Gaurd.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Gaurd.setForeground(Color.WHITE);
        
        What.setText("What do you do?");
        What.setBounds(100,300,800,200);
        What.setVisible(true);
        What.setLayout(null);
        What.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        What.setForeground(Color.WHITE);
        
        Talk.setBackground(Color.BLACK);
        Talk.setBounds(450,450,450,50);
        Talk.setText("Talk to the gaurd");
        Talk.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Talk.setForeground(Color.WHITE);
        
        Attack.setBackground(Color.BLACK);
        Attack.setBounds(450,500,450,50);
        Attack.setText("Attack the gaurd");
        Attack.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Attack.setForeground(Color.WHITE);
        
        Leave.setBackground(Color.BLACK);
        Leave.setBounds(450,550,450,50);
        Leave.setText("Leave");
        Leave.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Leave.setForeground(Color.WHITE);
        
        
        
        
        
        
        
        
        if(button == e.getSource()){
            
            button.setVisible(false);
        }
        
        }
    });
        
        Talk.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        Talk2.setText("Halt!..... This town is restricted.");
        Talk2.setBounds(100,100,800,200);
        Talk2.setVisible(true);
        Talk2.setLayout(null);
        Talk2.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Talk2.setForeground(Color.WHITE);
        
        Talk3.setText("A Monster is lurking around this area.");
        Talk3.setBounds(100,200,800,200);
        Talk3.setVisible(true);
        Talk3.setLayout(null);
        Talk3.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Talk3.setForeground(Color.WHITE);
        
        Talk4.setText("LEAVE NOW!");
        Talk4.setBounds(100,300,800,200);
        Talk4.setVisible(true);
        Talk4.setLayout(null);
        Talk4.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Talk4.setForeground(Color.WHITE);
        
        Talk5.setText("What do you do?");
        Talk5.setBounds(100,400,800,200);
        Talk5.setVisible(true);
        Talk5.setLayout(null);
        Talk5.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Talk5.setForeground(Color.WHITE);
        
        Dagger.setText("Attack with Dagger");
        Dagger.setBounds(450,550,450,50);
        Dagger.setVisible(true);
        Dagger.setLayout(null);
        Dagger.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Dagger.setForeground(Color.WHITE);
        Dagger.setBackground(Color.BLACK);
        
        leave1.setText("Leave");
        leave1.setBounds(450,600,450,50);
        leave1.setVisible(true);
        leave1.setLayout(null);
        leave1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        leave1.setForeground(Color.WHITE);
        leave1.setBackground(Color.BLACK);
        
        Kill.setText("Secret Option");
        Kill.setBounds(450,650,450,50);
        Kill.setVisible(true);
        Kill.setLayout(null);
        Kill.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Kill.setForeground(Color.WHITE);
        Kill.setBackground(Color.BLACK);
        
        
            
            
              if(Talk == e.getSource()){
            
            Talk.setVisible(false);
            button.setVisible(false);
            Desc.setVisible(false);
            Gaurd.setVisible(false);
            What.setVisible(false);
            Attack.setVisible(false);
            Leave.setVisible(false);
            
            
        
        }
        
        }
            
            
        
            
        });
        
         Dagger.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e){
            
        dead30.setText("HP:");
        dead30.setBounds(100,10,100,100);
        dead30.setVisible(true);
        dead30.setLayout(null);
        dead30.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        dead30.setForeground(Color.WHITE);
        
        Health30.setText("0"+" "+"(-30)");
        Health30.setBounds(230,10,120,100);
        Health30.setVisible(true);
        Health30.setLayout(null);
        Health30.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Health30.setForeground(Color.WHITE);
        
        Stab.setText("Player performs Stab");
        Stab.setBounds(100,100,800,200);
        Stab.setVisible(true);
        Stab.setLayout(null);
        Stab.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Stab.setForeground(Color.WHITE);
        
        Parry.setText("Gaurd parries.....");
        Parry.setBounds(100,200,800,200);
        Parry.setVisible(true);
        Parry.setLayout(null);
        Parry.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Parry.setForeground(Color.WHITE);
        
        Strike.setText("Gaurd performs Strike");
        Strike.setBounds(100,300,800,200);
        Strike.setVisible(true);
        Strike.setLayout(null);
        Strike.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Strike.setForeground(Color.WHITE);
        
        Hit.setText("Player is hit.....");
        Hit.setBounds(100,400,800,200);
        Hit.setVisible(true);
        Hit.setLayout(null);
        Hit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Hit.setForeground(Color.WHITE);
        
        Continue.setText("Continue");
        Continue.setBounds(450,600,450,50);
        Continue.setVisible(true);
        Continue.setLayout(null);
        Continue.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Continue.setForeground(Color.WHITE);
        Continue.setBackground(Color.BLACK);
            
            
            if(Dagger == e.getSource()){
            
            Talk2.setVisible(false);
            Talk3.setVisible(false);
            Talk4.setVisible(false);
            Talk5.setVisible(false);
            Dagger.setVisible(false);
            leave1.setVisible(false);
            Kill.setVisible(false);
            label.setVisible(false);
            Health.setVisible(false);
            
            
        
        }
        
        
            
        }
        
         });
        
         
         Attack.addActionListener(new ActionListener(){
         
        public void actionPerformed(ActionEvent e){
            
            
        dead30.setText("HP:");
        dead30.setBounds(100,10,100,100);
        dead30.setVisible(true);
        dead30.setLayout(null);
        dead30.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        dead30.setForeground(Color.WHITE);
        
        Health30.setText("0"+" "+"(-30)");
        Health30.setBounds(230,10,120,100);
        Health30.setVisible(true);
        Health30.setLayout(null);
        Health30.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Health30.setForeground(Color.WHITE);
        
        Stab.setText("Player performs Stab");
        Stab.setBounds(100,100,800,200);
        Stab.setVisible(true);
        Stab.setLayout(null);
        Stab.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Stab.setForeground(Color.WHITE);
        
        Parry.setText("Gaurd parries.....");
        Parry.setBounds(100,200,800,200);
        Parry.setVisible(true);
        Parry.setLayout(null);
        Parry.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Parry.setForeground(Color.WHITE);
        
        Strike.setText("Gaurd performs Strike");
        Strike.setBounds(100,300,800,200);
        Strike.setVisible(true);
        Strike.setLayout(null);
        Strike.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Strike.setForeground(Color.WHITE);
        
        Hit.setText("Player is hit.....");
        Hit.setBounds(100,400,800,200);
        Hit.setVisible(true);
        Hit.setLayout(null);
        Hit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Hit.setForeground(Color.WHITE);
        
        Continue.setText("Continue");
        Continue.setBounds(450,600,450,50);
        Continue.setVisible(true);
        Continue.setLayout(null);
        Continue.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Continue.setForeground(Color.WHITE);
        Continue.setBackground(Color.BLACK);
            
            
            if(Attack == e.getSource()){
            
            Talk.setVisible(false);
            button.setVisible(false);
            Desc.setVisible(false);
            Gaurd.setVisible(false);
            What.setVisible(false);
            Attack.setVisible(false);
            Leave.setVisible(false);
            label.setVisible(false);
            Health.setVisible(false);
            
            
            
        
        }
        
        
            
        }
        
         });
          Continue.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        Game.setText("Game Over");
        Game.setBounds(400,30,650,650);
        Game.setVisible(true);
        Game.setLayout(null);
        Game.setFont(new Font("Times New Roman", Font.PLAIN, 120));
        Game.setForeground(Color.WHITE);
        
        Dead.setText("Player is Dead");
        Dead.setBounds(590,100,650,650);
        Dead.setVisible(true);
        Dead.setLayout(null);
        Dead.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Dead.setForeground(Color.WHITE);
        
        
        
        
        
       
        if(Continue == e.getSource()){
            
            Stab.setVisible(false);
            Parry.setVisible(false);
            Strike.setVisible(false);
            Continue.setVisible(false);
            Dagger.setVisible(false);
            leave1.setVisible(false);
            Kill.setVisible(false);
            Health.setVisible(false);
            Weapon.setVisible(false);
            Hit.setVisible(false);
            label.setVisible(false);
            Weaponname.setVisible(false);
            Desc.setVisible(false);
            Gaurd.setVisible(false);
            leave2.setVisible(false);
            Health30.setVisible(false);
            dead30.setVisible(false);
            Health15.setVisible(false);
            dead15.setVisible(false);
            
            
            
        
        }
            
            
        }
          });
          
        Kill.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        Over.setText("Game Over");
        Over.setBounds(400,30,650,650);
        Over.setVisible(true);
        Over.setLayout(null);
        Over.setFont(new Font("Times New Roman", Font.PLAIN, 120));
        Over.setForeground(Color.WHITE);
        
        Is.setText("Player killed himself");
        Is.setBounds(550,100,650,650);
        Is.setVisible(true);
        Is.setLayout(null);
        Is.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Is.setForeground(Color.WHITE);
        
        if(Kill == e.getSource()){
            
            Stab.setVisible(false);
            Parry.setVisible(false);
            Strike.setVisible(false);
            Continue.setVisible(false);
            Dagger.setVisible(false);
            leave1.setVisible(false);
            Kill.setVisible(false);
            Health.setVisible(false);
            Weapon.setVisible(false);
            Hit.setVisible(false);
            label.setVisible(false);
            Weaponname.setVisible(false);
            Talk2.setVisible(false);
            Talk3.setVisible(false);
            Talk4.setVisible(false);
            Talk5.setVisible(false);
            Desc.setVisible(false);
            Gaurd.setVisible(false);
            What.setVisible(false);
            Health15.setVisible(false);
            Health30.setVisible(false);
            
            
            
        
        }
        
        }
        });
        
        Leave.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        Desc.setText("You leave");
        Desc.setBounds(100,100,800,200);
        Desc.setVisible(true);
        Desc.setLayout(null);
        Desc.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Desc.setForeground(Color.WHITE);
        
        Gaurd.setText("You enter a Forest");
        Gaurd.setBounds(100,200,800,200);
        Gaurd.setVisible(true);
        Gaurd.setLayout(null);
        Gaurd.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Gaurd.setForeground(Color.WHITE);
        
        Strike.setText("There is some rustling in the bushes");
        Strike.setBounds(100,300,800,200);
        Strike.setVisible(true);
        Strike.setLayout(null);
        Strike.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Strike.setForeground(Color.WHITE);
        
        Hit.setText("A Hobgoblin comes out");
        Hit.setBounds(100,400,800,200);
        Hit.setVisible(true);
        Hit.setLayout(null);
        Hit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Hit.setForeground(Color.WHITE);
        
        What.setText("What do you do?");
        What.setBounds(100,500,800,200);
        What.setVisible(true);
        What.setLayout(null);
        What.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        What.setForeground(Color.WHITE);
        
        attackhob.setText("Attack the Hobgoblin");
        attackhob.setBounds(450,550,450,50);
        attackhob.setVisible(true);
        attackhob.setLayout(null);
        attackhob.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        attackhob.setForeground(Color.WHITE);
        attackhob.setBackground(Color.BLACK);
        
        leave2.setText("Leave");
        leave2.setBounds(450,600,450,50);
        leave2.setVisible(true);
        leave2.setLayout(null);
        leave2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        leave2.setForeground(Color.WHITE);
        leave2.setBackground(Color.BLACK);
        
        Berries.setText("Eat berries from bush");
        Berries.setBounds(450,650,450,50);
        Berries.setVisible(true);
        Berries.setLayout(null);
        Berries.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Berries.setForeground(Color.WHITE);
        Berries.setBackground(Color.BLACK);
        
        
        
        if(Leave == e.getSource()){
            
            Talk.setVisible(false);
            button.setVisible(false);
            
            
           
            Attack.setVisible(false);
            Leave.setVisible(false);
            
            
        
        }
        
        
        }
        });
        
         leave1.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        Desc.setText("You leave");
        Desc.setBounds(100,100,800,200);
        Desc.setVisible(true);
        Desc.setLayout(null);
        Desc.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Desc.setForeground(Color.WHITE);
        
        Gaurd.setText("You enter a Forest");
        Gaurd.setBounds(100,200,800,200);
        Gaurd.setVisible(true);
        Gaurd.setLayout(null);
        Gaurd.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Gaurd.setForeground(Color.WHITE);
        
        Strike.setText("There is some rustling in the bushes");
        Strike.setBounds(100,300,800,200);
        Strike.setVisible(true);
        Strike.setLayout(null);
        Strike.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Strike.setForeground(Color.WHITE);
        
        Hit.setText("A Hobgoblin comes out");
        Hit.setBounds(100,400,800,200);
        Hit.setVisible(true);
        Hit.setLayout(null);
        Hit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Hit.setForeground(Color.WHITE);
        
        What.setText("What do you do?");
        What.setBounds(100,500,800,200);
        What.setVisible(true);
        What.setLayout(null);
        What.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        What.setForeground(Color.WHITE);
        
        attackhob.setText("Attack the Hobgoblin");
        attackhob.setBounds(450,550,450,50);
        attackhob.setVisible(true);
        attackhob.setLayout(null);
        attackhob.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        attackhob.setForeground(Color.WHITE);
        attackhob.setBackground(Color.BLACK);
        
        leave2.setText("Leave");
        leave2.setBounds(450,600,450,50);
        leave2.setVisible(true);
        leave2.setLayout(null);
        leave2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        leave2.setForeground(Color.WHITE);
        leave2.setBackground(Color.BLACK);
        
        Berries.setText("Eat berries from bush");
        Berries.setBounds(450,650,450,50);
        Berries.setVisible(true);
        Berries.setLayout(null);
        Berries.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Berries.setForeground(Color.WHITE);
        Berries.setBackground(Color.BLACK);
        
        
        
        if(leave1 == e.getSource()){
            
            Talk2.setVisible(false);
            Talk3.setVisible(false);
            Talk4.setVisible(false);
            Talk5.setVisible(false);
            Dagger.setVisible(false);
            leave1.setVisible(false);
            Kill.setVisible(false);
            
            
        
        }
        
        
        }
        });
        Berries.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        dead15.setText("HP:");
        dead15.setBounds(100,10,100,100);
        dead15.setVisible(true);
        dead15.setLayout(null);
        dead15.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        dead15.setForeground(Color.WHITE);
        
        Health15.setText("0"+" "+"(-15)");
        Health15.setBounds(230,10,120,100);
        Health15.setVisible(true);
        Health15.setLayout(null);
        Health15.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Health15.setForeground(Color.WHITE);
        
 
        Desc.setText("Player is Poisened");
        Desc.setBounds(100,100,800,200);
        Desc.setVisible(true);
        Desc.setLayout(null);
        Desc.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Desc.setForeground(Color.WHITE);
        
        Gaurd.setText("Player collapses");
        Gaurd.setBounds(100,200,800,200);
        Gaurd.setVisible(true);
        Gaurd.setLayout(null);
        Gaurd.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Gaurd.setForeground(Color.WHITE);
        
        Continue.setText("Continue");
        Continue.setBounds(450,600,450,50);
        Continue.setVisible(true);
        Continue.setLayout(null);
        Continue.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Continue.setForeground(Color.WHITE);
        Continue.setBackground(Color.BLACK);
            
            
        if(Berries == e.getSource()){
            
            Talk.setVisible(false);
            button.setVisible(false);
            leave1.setVisible(false);
            Berries.setVisible(false);
            Dagger.setVisible(false);
            Strike.setVisible(false);
            Hit.setVisible(false);
            What.setVisible(false);
            Attack.setVisible(false);
            Leave.setVisible(false);
            attackhob.setVisible(false);
            Health.setVisible(false);
            
            
        
        }
            
        }
        });
            
        leave2.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        dead15.setText("HP:");
        dead15.setBounds(100,10,100,100);
        dead15.setVisible(true);
        dead15.setLayout(null);
        dead15.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        dead15.setForeground(Color.WHITE);
        
        Health15.setText("0"+" "+"(-15)");
        Health15.setBounds(230,10,120,100);
        Health15.setVisible(true);
        Health15.setLayout(null);
        Health15.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Health15.setForeground(Color.WHITE);
        
        Desc.setText("Hobgoblin backstabs you");
        Desc.setBounds(100,100,800,200);
        Desc.setVisible(true);
        Desc.setLayout(null);
        Desc.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Desc.setForeground(Color.WHITE);
        
        Gaurd.setText("Player collapses");
        Gaurd.setBounds(100,200,800,200);
        Gaurd.setVisible(true);
        Gaurd.setLayout(null);
        Gaurd.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Gaurd.setForeground(Color.WHITE);
        
        Continue.setText("Continue");
        Continue.setBounds(450,600,450,50);
        Continue.setVisible(true);
        Continue.setLayout(null);
        Continue.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Continue.setForeground(Color.WHITE);
        Continue.setBackground(Color.BLACK);
            
            
        if(leave2 == e.getSource()){
            
            Berries.setVisible(false);
            Strike.setVisible(false);
            Hit.setVisible(false);
            What.setVisible(false);
            Dagger.setVisible(false);
            attackhob.setVisible(false);
            leave2.setVisible(false);
            Health.setVisible(false);
            label.setVisible(false);
            
        
        }
            
        }
        });
       attackhob.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        label.setText("HP:");
        label.setBounds(100,10,100,100);
        label.setVisible(true);
        label.setLayout(null);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        
        Health.setText("15");
        Health.setBounds(230,10,100,100);
        Health.setVisible(true);
        Health.setLayout(null);
        Health.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Health.setForeground(Color.WHITE);
            
        
        
        Stab1.setText("Player performs Stab");
        Stab1.setBounds(100,100,800,200);
        Stab1.setVisible(true);
        Stab1.setLayout(null);
        Stab1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Stab1.setForeground(Color.WHITE);
        
        dodge.setText("Hobgoblin dodges");
        dodge.setBounds(100,200,800,200);
        dodge.setVisible(true);
        dodge.setLayout(null);
        dodge.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        dodge.setForeground(Color.WHITE);
        
        Stab.setText("Player performs Stab");
        Stab.setBounds(100,300,800,200);
        Stab.setVisible(true);
        Stab.setLayout(null);
        Stab.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Stab.setForeground(Color.WHITE);
        
        hat.setText("Hobgoblin is hit");
        hat.setBounds(100,400,800,200);
        hat.setVisible(true);
        hat.setLayout(null);
        hat.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        hat.setForeground(Color.WHITE);
        
        dh.setText("Hobgoblin is dead");
        dh.setBounds(100,500,800,200);
        dh.setVisible(true);
        dh.setLayout(null);
        dh.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        dh.setForeground(Color.WHITE);
        
        Continue1.setText("Continue");
        Continue1.setBounds(450,600,450,50);
        Continue1.setVisible(true);
        Continue1.setLayout(null);
        Continue1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Continue1.setForeground(Color.WHITE);
        Continue1.setBackground(Color.BLACK);
            
            
        if(attackhob == e.getSource()){
            
            Talk.setVisible(false);
            button.setVisible(false);
            leave1.setVisible(false);
            Berries.setVisible(false);
            Dagger.setVisible(false);
            Strike.setVisible(false);
            Hit.setVisible(false);
            What.setVisible(false);
            Attack.setVisible(false);
            Leave.setVisible(false);
            leave2.setVisible(false);
            attackhob.setVisible(false);
            Gaurd.setVisible(false);
            Desc.setVisible(false);
            
            
            
        
        }
            
        }
        });
       
       Continue1.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
        
        Stab1.setText("You return to the Town");
        Stab1.setBounds(100,100,800,200);
        Stab1.setVisible(true);
        Stab1.setLayout(null);
        Stab1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Stab1.setForeground(Color.WHITE);
        
        dodge.setText("Gaurd approaches you");
        dodge.setBounds(100,200,800,200);
        dodge.setVisible(true);
        dodge.setLayout(null);
        dodge.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        dodge.setForeground(Color.WHITE);
        
        Stab.setText("You have defeated the Monster");
        Stab.setBounds(100,300,800,200);
        Stab.setVisible(true);
        Stab.setLayout(null);
        Stab.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        Stab.setForeground(Color.WHITE);
        
        hat.setText("Well done");
        hat.setBounds(100,400,800,200);
        hat.setVisible(true);
        hat.setLayout(null);
        hat.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        hat.setForeground(Color.WHITE);
        
        Continue2.setText("Continue");
        Continue2.setBounds(450,600,450,50);
        Continue2.setVisible(true);
        Continue2.setLayout(null);
        Continue2.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        Continue2.setForeground(Color.WHITE);
        Continue2.setBackground(Color.BLACK);
        
         if(Continue1 == e.getSource()){
            
            Talk.setVisible(false);
            button.setVisible(false);
            leave1.setVisible(false);
            Berries.setVisible(false);
            Dagger.setVisible(false);
            Strike.setVisible(false);
            Hit.setVisible(false);
            What.setVisible(false);
            Attack.setVisible(false);
            Leave.setVisible(false);
            leave2.setVisible(false);
            attackhob.setVisible(false);
            Gaurd.setVisible(false);
            Desc.setVisible(false);
            dh.setVisible(false);
            Continue1.setVisible(false);
            
        
        }
        
        }
       });
       
        Continue2.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            
        Win.setText("You Win");
        Win.setBounds(450,30,650,650);
        Win.setVisible(true);
        Win.setLayout(null);
        Win.setFont(new Font("Times New Roman", Font.PLAIN, 110));
        Win.setForeground(Color.WHITE);
          
            
           if(Continue2 == e.getSource()){
            
            
            
            dh.setVisible(false);
            Stab.setVisible(false);
            dodge.setVisible(false);
            hat.setVisible(false);
            Continue2.setVisible(false);
            Health.setVisible(false);
            Weapon.setVisible(false);
            Weaponname.setVisible(false);
            Stab1.setVisible(false);
            label.setVisible(false);
            
            
        
        }
        
         
            
            
            
        }
            
        });
        label.setText("ForestHunt");
        label.setBounds(450,30,650,650);
        label.setVisible(true);
        label.setLayout(null);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 90));
        label.setForeground(Color.WHITE);
          
        
        
        
        
            
        
        
        
       
    
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
