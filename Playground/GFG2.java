
class GFG2{
    static int i=0, j=0;

    public static void print2Dmatrix(int mat[][]){
        System.out.println("Printing complete matrix");
        for(i=0; i<mat.length; i++){
            for(j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printuppertri(int mat[][]){
        System.out.print("Printing upper triangular matrix");
        for(i=0; i<mat.length; i++){
            for(j=0; j<mat[i].length; j++){
                if(i>j){
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int mat[][] = {  {11, 12, 13}
                        ,{21, 22, 23}      
                        ,{31, 32, 33} };

        print2Dmatrix(mat);
        System.out.println();
        printuppertri(mat);
    }
}