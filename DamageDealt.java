// <Student Name>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <Date>, <Time>, v0.0
import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter UserName:");
        String userName = myScanner.nextLine();
        System.out.println("Hello fellow Hero!" + userName);

        System.out.println("Please enter your weapon name:");
        String weaponNanme = myScanner.nextLine();
        String weaponName;
        System.out.println(weaponName + "Is a wonderful choice");

        System.out.println("Please enter the monster name:");
        String monsterNanme = myScanner.nextLine();
        String monsterame;
        System.out.println(monsterNanme + "is a frightening monster!");

        System.out.println("How many attacks would you like to make");
        int numberAttack = myScanner.nextInt();
        System.out.println(numberAttack + "ammount of attacks");

        System.out.println("How many attacks would you like to make");
        int damageDealt = myScanner.nextInt();
        System.out.println(damageDealt + "damage per attack");

        int totalDamage; 
        var toalDamage = numberAttack * damageDealt; 
        System.out.println("Your total damge was" + totalDamage);

       
    
    }
}