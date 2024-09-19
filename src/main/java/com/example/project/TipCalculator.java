package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        // Calculaing all variables printed
        double totalTip = (percent * cost) / 100; // dividing by 100 to account for percentage
        double totalBill = cost + totalTip;
        double pretipPer = cost / people;
        double tipPer = totalTip / people;
        double totalCostPer = totalBill / people;

        // Rounding method found here: https://stackoverflow.com/questions/8825209/rounding-decimal-points
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        totalBill = Math.round(totalBill * 100.0) / 100.0;
        pretipPer = Math.round(pretipPer * 100.0) / 100.0;
        tipPer = Math.round(tipPer * 100.0) / 100.0;
        totalCostPer = Math.round(totalCostPer * 100.0) / 100.0;

                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + totalTip + "\n");
        result.append("Total Bill with tip: " + "$" + totalBill + "\n");
        result.append("Per person cost before tip: " + "$" + pretipPer + "\n");
        result.append("Tip per person: " + "$" + tipPer + "\n");
        result.append("Total cost per person: " + "$" + totalCostPer + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        //try different values for people, percent, and cost to test your program before running test cases
        System.out.println(calculateTip(people, percent, cost));
    }
}
        
