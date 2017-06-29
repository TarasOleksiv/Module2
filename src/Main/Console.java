package Main;

import java.util.Scanner;

/**
 * Created by Taras on 28.06.2017.
 */
public class Console {
    public static void main(String[] args){

        // Collect info
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String name = in.nextLine();
        System.out.print("Введіть місто вашого проживання: ");
        String city = in.nextLine();
        System.out.print("Введіть ваш вік: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Яке ваше хоббі?: ");
        String hobby = in.nextLine();
        System.out.print("Оберіть варіант виводу (1 -табличний, 2 -текстовий, 3 -інший): ");
        String variant = in.nextLine().trim();

        // Print info

        switch(variant) {
            case "1":
                // Variant #1
                System.out.println();
                System.out.println("_______________");
                System.out.println("Варіант №1.");
                System.out.println("_______________");
                System.out.println("Ім'я: \t" + name);
                System.out.println("Місто: \t" + city);
                System.out.println("Вік: \t" + age);
                System.out.println("Хоббі: \t" + hobby);
                System.out.println("_______________");
                break;
            case "2":
                // Variant #2
                System.out.println();
                System.out.println("_______________");
                System.out.println("Варіант №2.");
                System.out.println("_______________");
                System.out.println("Людина по імені " + name + " живе у місті " + city);
                System.out.println("Цій людині " + age + " років і вона любить " + hobby);
                System.out.println("_______________");
                break;
            case "3":
                // Variant #3
                System.out.println();
                System.out.println("_______________");
                System.out.println("Варіант №3.");
                System.out.println("_______________");
                System.out.println(name + " - ім'я");
                System.out.println(city + " - місто");
                System.out.println(age + " - вік");
                System.out.println(hobby + " - хоббі");
                System.out.println("_______________");
                break;
            default:
                System.out.println();
                System.out.println("_______________");
                System.out.println("На жаль, обраний вами варіант виводу не відповідає запропонованим варіантам 1, 2 чи 3.");
                System.out.println("Для коректного виводу інформації введіть номер одного з варіантів (1, 2 чи 3).");
                System.out.println("Запустіть програму ще раз.");
                System.out.println("_______________");
                break;
        }
    }
}
