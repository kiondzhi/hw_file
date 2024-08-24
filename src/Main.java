import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/mtmrphosis/Desktop/Hello/newFILE");
        FileWriter writer = new FileWriter(file);
        System.out.println("Вводите данные для записи");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String stroke = scanner.nextLine();
            if (stroke.equals("0")) {
                break;
            }   else {
                writer.write(stroke + System.lineSeparator());
                System.out.println("Введите что-нибудь еще");
            }
        }

        System.out.println("Файл создан");
        writer.close();
        scanner.close();
    }
}