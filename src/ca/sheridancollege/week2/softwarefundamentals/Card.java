/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;
    
    public Card (String suit, int value){
        if ((suit.equalsIgnoreCase("Hearts")
                ||suit.equalsIgnoreCase("Diamonds")
                ||suit.equalsIgnoreCase("Spades")
                ||suit.equalsIgnoreCase("Clubs"))&& (value > 0 || value < 14)){
            this.suit = suit;
            this.value = value;
        }
        else{
            System.out.println("Card values are invalid");
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
