class UpperTriangularMatrix {
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        System.out.println("Printing full matrix...");
        for(int i = 0; i < mat.length; i++){
            // Loop through all elements of current row
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void printuppartri(int mat[][]){
        System.out.println("Printing Upper Triangular Matrix...");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i <= j){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }  
    public static void main(String args[])
    {
        int mat[][] =  {{11, 12, 13},
                        {21, 22, 23},
                        {31, 32, 33}};
        print2D(mat);
        System.out.println("\n");
        printuppartri(mat);
    }
    
}
/*
Output:- 
PS C:\Users\gagan\Documents\Repository\Java\Experiements> cd "c:\Users\gagan\Documents\Repository\Java\Experiements\" ; if ($?) { javac UpperTriangularMatrix.java } ; if ($?) { java UpperTriangularMatrix }
Printing full matrix...
11 12 13 
21 22 23 
31 32 33 


Printing Upper Triangular Matrix...
11 12 13 22 23 33 
 */