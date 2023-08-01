package ARRAY;
import java.util.*;
public class Minimum_Cuts_To_Cut_Chocklet_All_Pieces
{
    public static void main(String[] args)
    {

        Integer CostVer[]  = {2,1,3,1,4};
        Integer CostHor[] =  {4,1,2};

        Arrays.sort(CostVer, Collections.reverseOrder());
        Arrays.sort(CostHor, Collections.reverseOrder());


        int h = 0;//horizontal cost array pointer
        int v = 0;//vertical cost array pointer
        int vp = 1; // total vertical pieces at current movement
        int hp = 1;// total horizontal pieces at current movement

        int cost = 0;//total cost we will be finding


        while(h < CostHor.length && v < CostVer.length)
        {
            if(CostHor[h] >= CostVer[v])
            {
                // when we cut horizantally all vertical pieces get cut
                // so total cuts beocomes( horizantal cut cost) * (vertical pieces)
                cost += (CostHor[h] * vp);
                h++;
                hp++;
            }
            else
            {
                // when we cut Vertically all horizantal pieces get cut
                // so total cuts beocomes =  (Vertical  cut cost )* (horizantal pieces)
                cost += (CostVer[v] * hp);
                v++;
                vp++;


            }
        }

        while(h < CostHor.length)
        {
            cost += (CostHor[h]*vp);
            h++;
            hp++;
        }
        while(v < CostVer.length)
        {
            cost += (CostVer[v]*hp);
            v++;
            vp++;
        }

        System.out.println("Total Minimum  Cost Needed : "+ cost);

    }
}

