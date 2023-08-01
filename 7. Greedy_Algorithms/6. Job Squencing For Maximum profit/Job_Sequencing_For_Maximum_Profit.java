package ARRAY;

import java.util.*;

public class Job_Sequencing_For_Maximum_Profit
{
    public static class job
    {
        int deadline;
        int profit;
        int id;
              job(int i, int d, int p)
              {
                  id = i;
                  deadline = d;
                  profit = p;
              }

    }
    public static void main(String[] args)
    {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30},{5,80}};

        ArrayList<job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++)
        {
            jobs.add(new job(i,jobsInfo[i][0], jobsInfo[i][1]));
        }

        // sorting in Deceding order of profit  obj2-obj1
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit - obj1.profit);



        ArrayList<Integer> seq = new ArrayList<>();

        int time  = 0;
        int TotalProfit = 0;

        for(int i = 0; i < jobsInfo.length;i++)
        {
            job curr = jobs.get(i);
            if(curr.deadline > time)
            {
                TotalProfit += curr.profit;
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Total Jobs Done : "+ seq.size());
        System.out.println("Ids of Jobs Done : "+seq);

        System.out.println("Total Maximum profit : "+ TotalProfit);
    }
}
