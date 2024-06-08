package demo;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Demo Main");

        Faker faker = new Faker();

        System.out.println(faker.business().creditCardNumber());

        System.out.println(faker.cat().breed());

        System.out.println(faker.ancient().god());


    }
}
