/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author hgibs
 */
public class Opinionator {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        System.out.println("I can't decide what animal I like best.");
        System.out.println("I know! Random can decide FOR ME!");
        
        int x  = randomizer.nextInt(5);
        System.out.println("The number was chosen was: " +  x);
        
        switch(x){
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1: 
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Woolu mammoth are DEFINETLY the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            case 4:
                System.out.println("Cockatoos are just too awesome!");
                break;
            case 5: 
                System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
                break;
            default:
                System.out.println("Koola bears are the only choice!");
                break;
//              Exercise did not orginally include  default break satement


        }
        System.out.println("Thanks Random, maybe YOU'RE the best!");
        
    }
    
}
