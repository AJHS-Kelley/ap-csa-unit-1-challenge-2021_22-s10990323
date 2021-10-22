// <Student Name>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <Date>, <Time>, v0.0
// Debugging by challah byard
import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter UserName:");
        String userName = myScanner.nextLine();
        System.out.println("Hello fellow Hero!" + userName);

        System.out.println("\nPlease enter your weapon name:");
        String weaponName = myScanner.nextLine();
        System.out.println(weaponName + "Is a wonderful choice");

        System.out.println("\nPlease enter the monster name:");
        String monsterNanme = myScanner.nextLine();
        System.out.println(monsterNanme + "is a frightening monster!");

        System.out.println("\nHow many attacks would you like to make");
        var numberAttack = myScanner.nextInt();
        System.out.println(numberAttack + "ammount of attacks");

        System.out.println("\n Your attack power?");
        int damageDealt = myScanner.nextInt();
        System.out.println(damageDealt + "damage per attack");

        int totalDamage = numberAttack * damageDealt; 
        System.out.println("\nYour total damge was" + totalDamage);
        // It works fine
        // I love the way you worded your code
    
    }
}