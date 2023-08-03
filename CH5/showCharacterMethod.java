 package CH5;
import java.util.*;
public class showCharacterMethod {
    public void showChar(String str, int position){
            char result = str.charAt(position);
            System.out.println(result);

    }
    public static void main(String[] args){
        showCharacterMethod sc = new showCharacterMethod();
        sc.showChar("New York", 2);


    }
}
