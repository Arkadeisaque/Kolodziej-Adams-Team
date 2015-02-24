/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Player;
import java.util.Scanner;

/**
 *
 * @author Arkadiusz
 */
public class StartProgramView {
    
    String banner = "==========================="
                    +"this is Viking Quest!"
                   +"===========================";
    String playerName;
    String menu = "======================"
                    +" Main Menu:"
                    +"  1. Start New Game"
                    +"  2. Load Saved Gave"
                    +"  3. Help Menu"
                    +"  4. Quit the Game"
                  +"======================";
    
    
    public void startProgram() {
        //Display the banner screen
        this.display(banner);
        //Get the players name
        this.getName();
        //Create a new player
        Player player = new Player();
         player.setName(playerName);
        //DISPLAY a customized welcome message
        this.displayWelcomeMessage(player.getName());
        //DISPLAY the main menu
        //MainMenu mainMenu = new MainMenu();
        //MainMenu.displayMenu();   
        this.display(menu);
        
    }
    public void display(String menu) {
        System.out.println(this.banner);
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Pleae input the player name:");
        playerName = input.next();   
    }
    public void displayWelcomeMessage(String name) {
        System.out.print("==========================="
                         +"welcome" + name
                        +"===========================");
    }
}
