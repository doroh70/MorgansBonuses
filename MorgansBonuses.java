/*
 * Morgan’s Department Store distributes bonuses to its salespeople after the holiday rush. 
 *Table 9-6 shows the bonuses, which are based on full weeks worked during the season and 
 *the number of positive online customer reviews. Write a program that allows a user to 
 *continuously enter values for the two bonus-determining factors and displays the 
 *appropriate bonus. Save the file as MorgansBonuses.java.
 */

/**
 *
 * @author maro
 */
import java.util.Scanner;
public class MorgansBonuses {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        MorgansBonuses test = new MorgansBonuses();
        
        double[][] bonusData = {{5.0, 9.0, 16.0, 22.0, 30.0}, {10.0, 12.0, 18.0, 24.0, 36.0},
        {20.0, 25.0, 32.0, 42.0, 53.0}, {32.0, 38.0, 45.0, 55.0, 68.0}, {46.0, 54.0, 65.0, 77.0, 90.0},
        {60.0, 72.0, 84.0, 96.0, 120.0}, {85.0, 100.0, 120.0, 140.0, 175.0}};
        
        System.out.print("Enter amount of weeks worked by employee: ");
        int weeks = input.nextInt();
        System.out.println();
        
        System.out.print("Enter amount of positive reviews for employee: ");
        int reviews = input.nextInt();
        System.out.println();
        
        switch (weeks) {
            
            case 0:
                
                MorgansBonuses.getBonus(bonusData, weeks, reviews);
                break;
                
            case 1:
                MorgansBonuses.getBonus(bonusData, weeks, reviews);
                break;
            case 2:
                MorgansBonuses.getBonus(bonusData, weeks, reviews);
                break;
            case 3:
                MorgansBonuses.getBonus(bonusData, weeks, reviews);
                break;
            case 4:
                MorgansBonuses.getBonus(bonusData, weeks, reviews);
                break;
            case 5:
                MorgansBonuses.getBonus(bonusData, weeks, reviews);
                break;
            default:
                MorgansBonuses.getBonus(bonusData, weeks, reviews);
                
        }
    }
    
    public static void getBonus(double[][] array, int weeks, int reviews){
        
        /*if(reviews> 4){
            reviews = 4;
        }*/
        System.out.println("Bonus to be awarded is "+ array[weeks][reviews]);
    }
    
    
}
