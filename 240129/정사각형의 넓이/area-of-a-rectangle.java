import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int area = n*n ;
        if(area < 5){
            System.out.println(area);
            System.out.println("tiny");
        }else{
            System.out.println(area);
        }
    }
}