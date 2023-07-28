import java.util.Scanner;
public class LetterCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        System.out.print("Enter a character: ");
        String string1 = sc.next();

        int counter=0;
        char letter = string1.charAt(0);

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == letter)
                counter++;
        }
        System.out.println(counter + " times " + letter + " appears in this string.");
    }
}
