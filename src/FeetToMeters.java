/**
 * @author Tushar Balarajan
 * CSC 201-004N
 * Professor Tanes Kanchanawanchai
 */
import java.util.*;
public class FeetToMeters {
    public static double Calculate(double feet){
        double meters = (.305 * feet);
        return(meters);
    }
// This method handles the conversion calculation

    public static void main(String[] args) {
        System.out.print("Enter a value for feet: ");
        Scanner kybd = new Scanner(System.in);
        Double feet = kybd.nextDouble();
            if (feet <=0) {
            System.out.println("Please put a value greater than zero!");
            }

            else {
            double meters = Calculate(feet);
            System.out.println(feet + " feet is " + meters + " meters.");
            }
        }
    }

