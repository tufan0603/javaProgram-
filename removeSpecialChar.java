//package javaProgram;
public class removeSpecialChar {
    public static void main(String[] args) {
        String str = "$ja!va$&st%ar";

        // Approach -1
        str.replaceAll("[^a-zA-Z0-9]" , "");
    }
}
