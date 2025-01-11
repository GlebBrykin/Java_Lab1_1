import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        double radius = 10;
        System.out.println("S=" + Math.PI * radius * radius);

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        System.out.print("Введите температуру в градусах Цельсия: ");
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        double temperature = Double.parseDouble(consoleReader.readLine());
        System.out.println("Температура в градусах Фаренгейта: " + ((temperature * 9.0 / 5.0) + 32.0));

        System.out.println("********************");
        System.out.println("Задача 3");
        System.out.println("********************");
        System.out.print("Введите сторону \"a\" треугольника: ");
        double a = Double.parseDouble(consoleReader.readLine());
        System.out.print("Введите сторону \"b\" треугольника: ");
        double b = Double.parseDouble(consoleReader.readLine());
        System.out.print("Введите сторону \"c\" треугольника: ");
        double c = Double.parseDouble(consoleReader.readLine());
        if((a > (b + c)) || (b > (a + c)) || (c > (a + b)))
        {
            System.out.println("Треугольник с введёнными сторонами не существует.");
            return;
        }
        double p = (a + b + c) / 2.0;
        System.out.println("Площадь треугольника: " + (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
    }
}