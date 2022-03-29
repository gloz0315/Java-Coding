import java.util.Scanner;

public class Main_1259 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            String word = input.next();
            String word_reverse = "";

            StringBuilder reverse = new StringBuilder(word);
            word_reverse = reverse.reverse().toString();

            if(word.charAt(0) != '0'){
                if(word.equals(word_reverse)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }else{
                System.exit(0);
            }
        }
    }
}
