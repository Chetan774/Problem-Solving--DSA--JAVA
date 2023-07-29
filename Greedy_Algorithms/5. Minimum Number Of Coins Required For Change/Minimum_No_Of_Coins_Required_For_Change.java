package ARRAY;

import java.util.*;
public class Minimum_No_Of_Coins_Required_For_Change
{
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Amount : ");
        int Amount = s.nextInt();


        //Lambda Function to sort array In reverse Order - Array Should be : Integer(Wrapper Class)
        Arrays.sort(coins, Comparator.reverseOrder());
      

        int count = 0;

        ArrayList<Integer> list =  new ArrayList<>();


        for(int i  = 0; i < coins.length; i++)
        {
            if(coins[i] <= Amount)
            {
                while(coins[i] <= Amount)
                {

                    count++;
                    Amount -= coins[i];
                    list.add(coins[i]);
                }
            }
        }

        System.out.println("Coins Used : "+ list);
        System.out.println("Minimum Coins required For Change : "+ count);


    }
}
