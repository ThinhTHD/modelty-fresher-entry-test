public class CustomFizzBuzz {
    public static void main(String[] args) {
        System.out.println("Test case 1:x=3,y=5");
        runFizzBuzz(3,5);
        System.out.println("Test case 2:x=2,y=7");
        runFizzBuzz(2,7);

        System.out.println("Test case 3:x=4,y=6");
        runFizzBuzz(4,6);


    }

    public static void runFizzBuzz(int x, int y) {
        for (int i = 1; i <= 100; i++)
        {
            if (i % x == 0 && y == 0)
            {
                System.out.println("FooBar");
            }
            else if (i % x == 0)
            {
                System.out.println("Foo");

            }
            else if (i % y == 0)
            {

                System.out.println("Bar");

            }else
            {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
