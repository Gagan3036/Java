public class string {
    public static void main(String args[]){
        String str0 = "Hello World";
        String str1 = "Hello Universe";
        
        System.out.println("\t\tApplying 5 different string function on the string: "+str0);
        System.out.println("First character: " + str0.charAt(0));
        System.out.println("Length of string: "+str0.length());
        System.out.println("Upper case of string: "+ str0.toUpperCase());
        System.out.println("Lower case of string: "+ str0.toLowerCase());
        System.out.println("Concatenated string: "+str0.concat(str1));
        
    }
}
