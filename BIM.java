
package bim;

import java.util.Scanner;

public class BIM {


    public static void main(String[] args) {
        System.out.println("please enter your weight and height");
        Scanner input1 = new Scanner(System .in);
        Scanner input2 =new Scanner(System.in);
        double weight, height;
        weight = input1.nextDouble();
        height = input2.nextDouble();
   double BIM = weight/(height*height);
        System.out.println(BIM);
        if(BIM<=18.5){
            System.out.println("Your are underweight");
        }
     else if (BIM<=25){
            System.out.println("Your are normal");
    }else if (BIM<=30){
            System.out.println("Your are overweight");
    }else{
            System.out.println("obese");
    }
    }
}

    
    

