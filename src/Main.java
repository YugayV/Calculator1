import com.company.Calculator;

import java.io.IOException;
import java.util.Scanner;


public class Main {


            public static void main(String[] args) throws IOException {


        System.out.println("Пожалуйста введите команду:");



            Scanner sc = new Scanner(System.in);


            try {
                String result;
                result = new Calculator().calculate(sc.nextLine().trim().split(""));
                System.out.println(result);

            } finally {
                sc.close();
            }



        }

}






