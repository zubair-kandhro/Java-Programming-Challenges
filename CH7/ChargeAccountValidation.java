package CH7;

import java.util.Scanner;

public class ChargeAccountValidation {
    int[] arr = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231,
                6545231, 3852085, 7576651, 7881200, 4581002};
    public boolean isValid(int num){
        boolean isvalid =false;
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                 isvalid  = true;
                return isvalid;
            }

        }
        return isvalid;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ChargeAccountValidation n = new ChargeAccountValidation();

        System.out.print("Enter a charge account number: ");
        int num = sc.nextInt();
        if(n.isValid(num)){
            System.out.println("The number is valid");
        }
        else{
            System.out.println("The number is invalid");
        }

    }
}
