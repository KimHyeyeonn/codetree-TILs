import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cm = sc.nextInt();
        int kg = sc.nextInt();

        //int bmi = kg/((100/cm)*(100/cm)) ;
          int bmi = kg * 100 * 100 / (cm * cm);

        if(bmi >= 25){
            System.out.println(bmi);
            System.out.println("Obesity");
        }else{
            System.out.println(bmi);
        }
    }
}