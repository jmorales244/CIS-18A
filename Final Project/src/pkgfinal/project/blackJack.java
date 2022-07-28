package pkgfinal.project;

import java.security.SecureRandom;

public class blackJack {
    
    static class defineCard{
        public String[] suit; //Suit of the card (hearts, spades, etc..)
        public String[] face;     //Faces of cards (jacks, queens, kings)
        public int[] cardValue;
        
        public int[] deck = new int[53]; //Deck of cards has 53 cards in total
    }
    /**
     * 
     * @param chips Menu will prompt user the kind of job he has and will be given an amount of money they can bet with
     * @return the amount of money or chips that they have won at the end of the game
     */
    static public int getBlackJack(int chips, int difficulty){
        
        int win = 0, new_Suit = 0;
        String[] suit = new String[] { "Ace", "Two", "Three", "Four", 
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };     //Suit of the card (hearts, spades, etc..)
        String[] face = new String[] { "Diamonds", "Clubs", "Hearts", "Spades" };     //Faces of cards (jacks, queens, kings)
        int[] cardValue = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
        SecureRandom randomGenerator = new SecureRandom();
        
       
        //Fun nice greetings depending on the difficulty chosen (Depending how much money you have)
        String[] greetings = new String[] {"Welcome to blackjack! ... You probably would only bet 5 chips huh..", //hard
            "Another broke guy losing all his money... Welcome to Blackjack!", // hard
            "Trying to get rich quick huh? Well, welcome to Blackjack!", // medium
            "The wife finally let you off leash? Welcome to Blackjack!", // nedium
            "You left your kids for a game of Blackjack? Priorities huh? Welcome to Blackjack!", // medium
            "Another rich guy thinking he can't lose! Just wait till you lose half your annual income in 5 seconds... Welcome to Blackjack!", // easy
            "Sad lonely life brings you here huh? What a surprise! *Sarcasm* \nWelcome to Blackjack!"}; // easy
         //Easy mode
        if ( difficulty == 1 ){
            int randomGreeting = 5 + randomGenerator.nextInt(6); //Range between index array 5 & 6
            System.out.println(greetings[randomGreeting]);
        }
        //Medium mode
        else if ( difficulty == 2 ){
            int randomGreeting = 2 + randomGenerator.nextInt(4); //Range between index array 2 to 4
            System.out.println(greetings[randomGreeting]);           
        }
        //Hard mode
        else if ( difficulty == 3 ) {
            int randomGreeting = 0 + randomGenerator.nextInt(1); // Range between index array of 0 and 1
            System.out.println(greetings[randomGreeting]);           
        } 
        
        defineCard card = new defineCard();
        //for every integer, it can appear 52 times in a deck of cards
        for (int i = 0; i < 52; i++){
            card.face[i] = face[i % 13];
            card.suit[i] = suit[new_Suit];
            card.cardValue[i] = cardValue[i % 13];
            //because there are 13 cards per suit, change after every 13 cards
            if ((i + 1) % 13 == 0)
                new_Suit++;
        }
        
        int a, b; // variables for 2 cards in blackjack
        for (int x = 0; x < 200; x++){
            do{
                a = 0 + randomGenerator.nextInt(52);
                b = 0 + randomGenerator.nextInt(52);
            }while( a ==  b );
            
        }
        
        
        return chips;
    }
    
}
 