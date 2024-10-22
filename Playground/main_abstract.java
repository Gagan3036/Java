abstract class Colleges {
    public abstract void ltce();
    abstract void dyp();
}

class University extends Colleges{
    public void ltce(){
        System.out.printf("Address: KoparKhairane%n");
    }
    void dyp(){
        System.out.printf("Address: Belapur%n");
    }
}

class main_abstract{
    public static void main(String args[]){
        University u = new University();
        u.ltce();
        u.dyp();
    }
}