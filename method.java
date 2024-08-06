class method {
    
    /* Overloading concept */

    void area(int a, int b)
    {
        System.out.println("The area is "+ a*b + " Sq units");
    }

    void area(float a)
    {
        System.out.println("The area of square is "+ a*a + " Sq units");
    }
    
    public static void main(String args[])
    {
        method obj = new method();
        obj.area(5);
        obj.area(11, 12);
    }

}
