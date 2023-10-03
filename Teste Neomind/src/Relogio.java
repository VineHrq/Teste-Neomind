import java.util.Scanner;

class CalculateClockAngle {
    public static int retornaAnguloRelogio(int hour, int minute) {

        hour = hour % 12;

        double angleMinute = minute * 6;

        double angleHour = hour * 30;

        int angle = Math.abs((int) (angleHour - angleMinute));

        return Math.min(angle, 360 - angle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora:");
        int hour = sc.nextInt();
        System.out.print("Digite o minuto:");
        int minute = sc.nextInt();

        int angle = retornaAnguloRelogio(hour, minute);
        System.out.println("O ângulo entre os ponteiros do relógio é: " + angle + " graus");
    }
}