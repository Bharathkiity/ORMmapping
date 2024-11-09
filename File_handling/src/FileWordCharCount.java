import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCharCount {
    public static void main(String[] args) throws IOException {
        
        File file = new File("./sample.txt");
        
        // Check if file exists, create a new file if not
        if (!file.exists()) {
            file.createNewFile();
         
        }
    
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int wordCount = 0;
        int charCount = 0;

        System.out.println("File content:");
        System.out.println();
        
        
        while ((line = br.readLine()) != null) {
            System.out.println(line); // Print the content of each line
            
            // Count characters in each line
            charCount += line.length();
            
            // Split line into words and count them
            String[] words = line.split("\n");
            wordCount += words.length;
        }

        System.out.println("\nTotal Characters: " + charCount);
        System.out.println("Total Words: " + wordCount);

        br.close();
        fr.close();
    }
}
