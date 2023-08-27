public class ArithmaticOperation{
    public static void main(String [] args){
        int num1, num2, num3, num4, sum, sub, multiply;
        double division;
        num1 = 100000000;
        num2 = 20;
        num3 = 100;
        num4 = 1000;
     

        if (num1 >num2 && num1 > num3 && num1> num4 ){
          sum = num1 + num2+num3+num4;
          System.out.println("Your Rank: Gold, and Point is: " + sum);
          System.out.println("Your largest number is: " + num1);
        }
        else if(num2>num1 && num2> num3 && num2 > num4){
           sub = (num1+num3+num4)-num1;
           System.out.println("Your Rank: Silver, and Point is:" + sub);
           System.out.println("Your largest number is: " + num2);

        }

        else if (num3> num1 && num3 > num2 && num3> num4){
            multiply = (num1+num2+num4) * num3;
            System.out.println("Wow! Your Rank: Urenium, Point is:" + multiply);
            System.out.println("Your largest number is: " + num3);
        }

        else if(num4>num1 && num4> num2 && num4> num3){
            division = (num1*num2*num3)/num4;
            System.out.println("You don't have any Rank, and Point is:"+division); 
            System.out.println("Your largest number is: " + num4);

        }
        
        else{
            System.out.println("You enter incorrect input!, Try again!.....");
        }

    }
}