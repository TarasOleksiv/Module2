import java.util.Scanner;

/**
 * Created by Taras on 28.06.2017.
 */
public class Console {
    public static void main(String[] args){
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
        System.out.println();
        System.out.println("_______________");
        System.out.println("Варіант №1.");
        System.out.println("_______________");
        System.out.println("Ім'я: \t" + name);
        System.out.println("Місто: \t" + city);
        System.out.println("Вік: \t" + age);
        System.out.println("Хоббі: \t" + hobby);
        System.out.println("_______________");
        System.out.println();
        System.out.println("_______________");
        System.out.println("Варіант №2.");
        System.out.println("_______________");
        System.out.println("Людина по імені " + name + " живе у місті " + city);
        System.out.println("Цій людині " + age + " років і вона любить " + hobby);
        System.out.println("_______________");
        System.out.println();
        System.out.println("_______________");
        System.out.println("Варіант №3.");
        System.out.println("_______________");
        System.out.println(name + " - ім'я");
        System.out.println(city + " - місто");
        System.out.println(age + " - вік");
        System.out.println(hobby + " - хоббі");
        System.out.println("_______________");
    }
}
