import java.util.regex.*;

// This is the practice question by Subhash sir
class Sept062021{

    // Function that checks if a string
    // contains uppercase, lowercase, in Between Upper Case
    // Correspondingly categorising them in groups

    public static void whichGrp(String str)
    {
        // ReGex to check if a string
        // contains uppercase, lowercase
        // special character & numeric value
        String[] str_split = str.split(" ");
        for(int i=0;i<str_split.length;i++){
            String regex1 = "^[A-Z]";
            // Compile the ReGex
            Pattern p = Pattern.compile(regex1);
            Matcher m = p.matcher(str);
            if(m.matches()){ // Exactly one capital letter at the beginning
                System.out.println("Group 1:");
            }
        }

        /*
        else if(str_split[i].matches("\b[a-z]*[^A-Z]")){ // Every Character lower
                System.out.println("Group 2:");
            }
            else{
                System.out.println("Group 3:");
            }
        */
    }
 
    // Driver Code
    public static void main(String[] args) {
         // Given string
         String str = "THis is Subham Minhas GoiNG on holiday";
 
         // Function Call
         whichGrp(str);
    }

}
