public class Main {
    public static void main(String[] args) {
        double ftToCm = 30.48;
        int miToCm = 160934;

        // 9.2피트를 cm로 변환하여 출력
        double feet = 9.2;
        double feetInCm = feet * ftToCm;
        System.out.printf("%.1fft = %.1fcm%n", feet, feetInCm);

        // 1.3마일을 cm로 변환하여 출력
        double miles = 1.3;
        double milesInCm = miles * miToCm;
        System.out.printf("%.1fmi = %.1fcm%n", miles, milesInCm);
    }
}