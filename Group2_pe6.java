import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Group2_pe6 {
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = input.nextLine();
        
        File file = new File(fileName + ".txt");
        
        if(!file.exists()){
        System.out.println("The file " + fileName + ".txt does not exist.");
        System.exit(0);
                }
        
        Scanner fileInput = new Scanner(file);
        
        System.out.println("Enter a single character: ");
        String charInputString = input.nextLine();
        charInputString = charInputString.toLowerCase();
        char character = charInputString.charAt(0);
        
        String line; 
        
        int counter = 0;
        
        while(fileInput.hasNext()){
                    line = fileInput.nextLine();
                    line = line.toLowerCase();
        for(int i = 0; i <line.length(); i++){
        if(line.charAt(i) == character){
                            counter += 1;
                        }
                    }
                }
        
        System.out.println("The character " + character + " appears in the file " + counter + " times.");
        System.out.println("test")
                fileInput.close();
                
	}
}