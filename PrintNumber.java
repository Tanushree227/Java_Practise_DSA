public class PrintNumber {
    public static void main(String[] args) {
        //for loop
        System.out.println("Using For loop");
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }

        //while loop
        int i = 0;
        System.out.println("Using While loop");
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }

        //do-while loop
        int j = 0;
        System.out.println("Using Do-While loop");
        do
        {
            System.out.println(j);
            j++;
        } while(j<=10);

    }
}
