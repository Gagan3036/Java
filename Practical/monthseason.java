import java.util.*;

class monthseason{
    public static void main(String args[]){
        String season = " ";

        System.out.print("Enter any one month from 1 to 12: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n) {
            case 12:
            case 1:
            case 2:
            season = "Winter";
            break;
                
            case 3:
            season ="Spring";
            break;

            case 4:
            case 5:
            case 6:
            season = "Summer";
            break;

            case 7:
            case 8:
            case 9:
            season = "Monsoon";
            break;

            case 10:
            case 11:
            season = "Autumn";
            break;

            default:
                System.out.println("Invalid Month Entered");
                break;
        }
        System.out.println("This month have "+season+" season");
    }
}