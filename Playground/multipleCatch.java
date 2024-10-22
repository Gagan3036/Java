public class multipleCatch {
    public static void main(String args[]){
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs as is number diided by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception Occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception Occurs");
        }
    }
}
