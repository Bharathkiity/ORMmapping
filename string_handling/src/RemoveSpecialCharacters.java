public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello@#World!123";
        
        // Remove special characters using regex(regression experssion)
        String result = str.replaceAll("[^a-zA-Z0-9]","");
        
        System.out.println("Original String: " + str);
        System.out.println("String without special characters: " + result);
    }
}
