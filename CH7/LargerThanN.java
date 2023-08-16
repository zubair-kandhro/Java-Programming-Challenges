package CH7;

public class LargerThanN {

    public void larger(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > num){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        LargerThanN num = new LargerThanN();

        int[] val = {1,2,3,4,5};
        num.larger(val, 3);
    }
}
