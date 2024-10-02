public class MultipleCatch { 
 
    public static void main(String[] args) { 
    
        try{ 
            int a[]=new int[5]; 
            a[5]=30/0; 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.println("Arithmetic Exception occurs as is number divided by 0"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) 
        { 
            System.out.println("ArrayIndexOutOfBounds Exception occurs"); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Parent Exception occurs"); 
        } 
            System.out.println("rest of the code"); 
    } 
}
/*
 * Output:- 
PS C:\Users\gagan\Documents\Repository\Java\Experiements\Ex-13> cd "c:\Users\gagan\Documents\Repository\Java\Experiements\Ex-10\" ; if ($?) { javac MultipleCatch.java } ; if ($?) { java MultipleCatch }
Arithmetic Exception occurs as is number divided by 0
rest of the code
 */