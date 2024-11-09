public class StringBufferBuilderMethods {
    public static void main(String[] args) {
    	
    	System.out.println("StringBuffer Methods");
        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");

        // append(): Adds data to the end of the string
        sbf.append(", World!");
        System.out.println("StringBuffer after append: " + sbf);  // Output: Hello, World!

        // insert(): Inserts data at the specified index
        sbf.insert(5, ",");
        System.out.println("StringBuffer after insert: " + sbf);  // Output: Hello,, World!

        //  replace(): Replaces characters from start index to end index
        sbf.replace(5, 7, "!");
        System.out.println("StringBuffer after replace: " + sbf);  // Output: Hello! World!

        //  delete(): Deletes characters from start index to end index
        sbf.delete(5, 6);
        System.out.println("StringBuffer after delete: " + sbf);  // Output: Hello World!

        //  reverse(): Reverses the string
        sbf.reverse();
        System.out.println("StringBuffer after reverse: " + sbf);  // Output: !dlroW olleH

        // capacity(): Returns the current capacity
        System.out.println("StringBuffer capacity: " + sbf.capacity());  // Output: 29 (default is 16 + length of string)

        System.out.println("=================================================");
        System.out.println("StringBuffer Methods");
        
        // Using StringBuilder
        StringBuilder sbd = new StringBuilder("Java");

        //  append(): Adds data to the end of the string
        sbd.append(" Programming");
        System.out.println("StringBuilder after append: " + sbd);  // Output: Java Programming

        //  insert(): Inserts data at the specified index
        sbd.insert(5, "Language ");
        System.out.println("StringBuilder after insert: " + sbd);  // Output: Java Language Programming

        //  replace(): Replaces characters from start index to end index
        sbd.replace(5, 13, "Code");
        System.out.println("StringBuilder after replace: " + sbd);  // Output: Java Code Programming

        //  delete(): Deletes characters from start index to end index
        sbd.delete(5, 9);
        System.out.println("StringBuilder after delete: " + sbd);  // Output: Java Programming

        //  reverse(): Reverses the string
        sbd.reverse();
        System.out.println("StringBuilder after reverse: " + sbd);  // Output: gnimmargorP avaJ

        // capacity(): Returns the current capacity
        System.out.println("StringBuilder capacity: " + sbd.capacity());  // Output: 30 (default is 16 + length of string)
    }
}
