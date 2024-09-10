import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Problem - 1
      /*  System.out.println("*********************");
        System.out.println("Name:  Shuhrat ");
        System.out.println("Surname: Egamberdiyev ");
        System.out.println("Email: shuhrategamberdiyev@gmail.com");
        System.out.println("Address: Tashkent, Uzbekistan");  */


        // Problem - 2
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("What your name?");
        String name = scanner.next();
        System.out.println("Hello "+name+"👋");  */


        // Problem - 3
    /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Inter width:");
        double width = scanner.nextDouble();
        System.out.print("Inter  height:");
        double  height = scanner.nextDouble();
        System.out.println("Area:"+width*height);
        System.out.println("Perimeter:"+2*(width+height));  */


        // Problem - 4
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of cylinder:");
        double radius = scanner.nextDouble();
        System.out.print("Enter length of cylinder:");
        double length = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area is:" + area);
        System.out.println("The volume is:" + area * length);  */


        // Problem - 5
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Equilateral triangle length:");
        double length = scanner.nextDouble();
        System.out.print("Enter Equilateral triangle height:");
        double height = scanner.nextDouble();
        double area = (Math.pow(3, 0.5) / 4) * (Math.pow(height, 2));
        System.out.println("The area is: " + area);
        System.out.println("The volume of the Triangular prism is: " + area * length);  */


       /* long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;
        long currentHour = totalHour % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);*/


        /*double number = Math.random();
        System.out.println(number);
        Random random = new Random();
        int a = random.nextInt(1,30);
        System.out.println(a);
        System.out.println((int) (number*10));*/


     /*   double a = 6.5;
        a += 1;
        System.out.println(a);
        a = 6;
        a /=2;
        System.out.println(a);*/


       /* int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);
        System.out.println("What will be " + number1 + "+" + number2 + " ?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        System.out.println(number1 + "+" + number2 + "=" + answer + " " + "is " + (number1 + number2 == answer));*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Today is: " + LocalDate.now().getDayOfWeek());
        int date = scanner.nextInt();
        switch ((LocalDate.now().getDayOfWeek().getValue() + date) % 7) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
        }*/

        /*char ch = 'A';
        System.out.println(ch);

        ch = 65;
        System.out.println(ch);

        ch = '\u0041';
        System.out.println(ch);
        System.out.println(++ch);*/


       /* int[] numbers = new int[10];
        System.out.println(numbers);
        System.out.println(numbers[2]);*/


        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        while (++i < arr.length) {
            System.out.print(arr[i] + " ");

        }
        System.out.println(i);*/

       /* int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        int b= arr
                .length;
        while ((b--)>0){
            System.out.print(arr[b]);
        }*/

         /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Son kiriting: ");

        int sum = 0;
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                sum += scanner.nextInt();
            }else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")){
                    break;
                }else {
                    System.out.println("Wrong option!!! Try again");
                }
            }
        }
        System.out.println(sum);*/


        //    searchCharacterCount();
/*private static void searchCharacterCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So'z kiriting:");
        String str = scanner.next();
        System.out.println("Xarf kiriting:");
        String next = scanner.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==next.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("So'z kiriting:");
        String str = scanner.nextLine();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upper++;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                lower++;
            }
        }
        System.out.println("To upper case:" + upper);
        System.out.println("To lower case:" + lower);*/



       /* Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < args.length; i++) {
            arr[i] = scanner.nextInt();

        }
        int count = 0;
        for (int i = 1; i < 10; i++) {
            if (arr[i]<arr[count]){
                count = i;
            }
        }
        System.out.println("Index:"+count);*/


        /*for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println("Welcome to OOP course!!");
            }
        }*/
    }


}
