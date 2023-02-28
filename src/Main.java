import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String pravilniy = "password";
        String userentered = "";
        String exit = "exit";
        System.out.println("Введите пароль:");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            userentered = scanner.nextLine();
            if (userentered.equals(pravilniy)) {
                System.out.println("Вы вошли в систему");
                break;
            } else if (userentered.equals(exit)) {
                System.out.println("Вы вышли из системы");
                break;
            } else
                System.out.println("Неверный пароль, попробуйте ещё раз");
        }
    }
}