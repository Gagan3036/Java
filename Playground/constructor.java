class constructor {
    int x, z;
    constructor(int y){
        x = 10;
        x += y;
    }
    constructor(){
        z = 200;
        z += 100;
    }
    
    public static void main(String[] args) {
        constructor run = new constructor(5);
        System.out.println(run.x);
        constructor run2 = new constructor();
        System.out.print(run2.z);
    }
}
