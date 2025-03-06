package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth{

    public static void main (String[]args){
        String whatIsYourAge = JOptionPane.showInputDialog("How old are you?");
        int ages = Integer.parseInt(whatIsYourAge);
        if (ages >= 18){
            JOptionPane.showInputDialog("Who do you think the next president should be?");
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry, but you're not old enough to talk about politics");
        }
    }
}