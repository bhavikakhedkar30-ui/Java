package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Selling Price Of Product: ");
        double sellingPrice = in.nextDouble();
        System.out.print("Enter Cost Price Of Product: ");
        double CostPrice = in.nextDouble();

        if(sellingPrice > CostPrice){
            double profit = sellingPrice - CostPrice;
            System.out.println("Profit of: " +profit);
            if(sellingPrice > CostPrice){ // HOMEWORK
                double PP = (profit / CostPrice) *100;
                System.out.print(" With Profit % of : " + PP+"%");
            }
        }
        else if (sellingPrice< CostPrice) {
            double loss = CostPrice - sellingPrice;
            System.out.println("Loss of " + loss);
            if(CostPrice > sellingPrice){ // HOMEWORK
                double LP = (loss / CostPrice) *100;
                System.out.print(" With loss % of : " + LP+"%");
            }

        }
        else{
            if(sellingPrice == CostPrice){
                System.out.println("No Profit and No loss");
            }
        }
    }
}
