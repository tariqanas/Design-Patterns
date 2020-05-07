package com.FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of the plan for which you want the bill to be generated : \n ");
        try  {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: \n");
        int units=Integer.parseInt(br.readLine());
        Plan plan = planFactory.getPlan(planName);
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        plan.getRate();
        plan.calculateBill(units);
        br.close();
        }catch (NullPointerException npe) {
            System.out.println("Couldn't find the Plan");
        }
    }


}

