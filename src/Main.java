import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }

    static void firstTask(){
        ArrayList<Integer> speeds = new ArrayList<>(); // объявите список
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (int speed : speeds) {
            sum = sum + speed;
        }

        int averageSpeed = sum / speeds.size();
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");

    }

    static void secondTask(){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншила");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных");
        System.out.println("Это будут: ");
        System.out.println(animals.get(1));
        System.out.println(animals.get(4));
        System.out.println(animals.get(0));
        System.out.println(animals.get(2));
        System.out.println(animals.get(3));
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00");
        System.out.println("В 10:00");
        System.out.println("В 11:00");
        System.out.println("В 12:00");
        System.out.println("В 13:00");
    }

    static void thirdTask(){
        ArrayList<String> animals = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        animals.add("Крокодил");
        while (true) {
            System.out.println("1 - Показать список животных");
            System.out.println("2 - Добавить животное в список");
            System.out.println("3 - Удалить животное из списка");
            System.out.println("0 - Выход");
            System.out.print("Выберите действие: ");

            int number = in.nextInt();
            in.nextLine();

            switch (number) {
                case 1:
                    System.out.println("Животные в зоопарке:");
                    for (String animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                case 2:
                    System.out.print("Какое животное вы хотите добавить? ");
                    String name = in.nextLine();
                    animals.add(name);
                    System.out.println("Животное \"" + name + "\" добавлено.");
                    break;
                case 3:
                    System.out.print("Какое животное вы хотите удалить? ");
                    String nameToRemove = in.nextLine();
                    int index = animals.indexOf(nameToRemove);

                    if (index != -1) {
                        animals.remove(index);
                        System.out.println("Животное \"" + nameToRemove + "\" удалено.");
                    } else {
                        System.out.println("Животное \"" + nameToRemove + "\" не найдено.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Вы выбрали неверную цифру. Попробуйте снова.");
            }
        }
    }
}