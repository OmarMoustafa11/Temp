import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter temp");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("High") ){
                System.out.println("Sunblock may be needed " ) ;
            }
            else if(name.equalsIgnoreCase("Low")) {
                System.out.println("A coat may be needed ");
            }
                else if (name.equalsIgnoreCase("Humid")){

                    System.out.println("It's muggy!! ");

                }

    }

}

