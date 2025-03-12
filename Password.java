import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Password {
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    String myPassword = "";
    public int size;

    public Password(ArrayList<Integer> options, int size){
        this.size = size;
        int arr_size = options.size();

        for(int i = 0; i < size; i++){
            int idx = random.nextInt(arr_size);
            myPassword += new_Char(idx,options);
        }
    }
    public char new_Char(int idx, ArrayList<Integer> options){
        String special_characters = "!@#$%^&*()_+-=[]{}|;:',.<>?/";
        int choice = options.get(idx);

        if(choice == 1){
            return (char) (random.nextInt(26) + 'A');
        }else if(choice == 2){
            return (char) (random.nextInt(26) + 'a');
        }else if(choice == 3){
            return (char) (random.nextInt(10) + '0');
        }else{
            return special_characters.charAt(random.nextInt(special_characters.length()));
        }
    }
    public String getPassword() {
        return myPassword;
    }
}
