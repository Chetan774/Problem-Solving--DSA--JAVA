

import java.util.*;

public class Max_Activity_Selection_Greedy
{
    public static void main(String args[])
    {
        int start[] = {0,1,3,5,5,8};
        int end[]  = {6,2,4,7,9,9};

        int Activity[][] = new int[start.length][3];

        for(int i = 0; i < start.length;i++)
        {
            Activity[i][0] = i;
            Activity[i][1] = start[i];
            Activity[i][2] = end[i];
        }

        Arrays.sort(Activity, Comparator.comparingDouble(o ->o[2]));

        ArrayList<Integer> ans = new ArrayList<>();//to add index of selected activity

         int maxNoActivity  = 1;
        int lastEnd = Activity[0][2];
        ans.add(Activity[0][0]);



        for(int i = 0; i< end.length; i++)
        {
            if(Activity[i][1] >= lastEnd)
            {
                maxNoActivity++;
                lastEnd = Activity[i][2];
                ans.add(Activity[i][0]);
            }
        }


        System.out.println("Max No Of Activities : "+ maxNoActivity);

        System.out.println(ans);

    }
}
