import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int maxBorder = scanner.nextInt();

        logger.log("Создаем и наполняем список");

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= size; i++) {
            list.add(random.nextInt(maxBorder));
        }
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        Filter filter = new Filter(scanner.nextInt());
        list = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + list.toString());
        logger.log("Завершаем программу");

    }
}
