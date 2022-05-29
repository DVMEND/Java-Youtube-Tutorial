import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //for loop = executes a block of code a limited amount of times

        //for index=0, while index is less than or equal to 10, increase index by 1
        //for (int=1; i<=10;i++)
        //for index=10 while index is greater than or equal to 0, decrease index by 1
        //decrease by 2: i-=2
        for (int i = 10; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("Happy new year!");



        
        //Nested loops = a loop inside a loop

        Scanner scanner = new Scanner (System.in);

        int rows;
        int columns;
        String symbol = "";
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for(int i =1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);

            }

        }

    }
}
