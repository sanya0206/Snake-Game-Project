/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    SnakeGame(){
       super("Snake Game"); 
       add(new Board());
       pack(); //reflects changes on our java frame
      
      setLocationRelativeTo(null); //setting it to centre
      setResizable(false);
    }

    
    public static void main(String[] args) {
       new SnakeGame().setVisible(true); 
    }
    
}
