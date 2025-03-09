import java.util.Scanner;

// skal den exstends?
public class Game {
    // This class can be seen as the "main" class. It takes data from a user and now creates
    //either a Cat object or a Dog object.

    Scanner scanner = new Scanner(System.in);

    // Vælg create animal methode

    public Tamagochi chooseAnimal(){
        while (true) {
            System.out.println("Welcome to Tamagochi press 1 for cat and 2 for dog");

            Tamagochi tamagochi = new Tamagochi();

           // int sc = scanner.nextLine();
            //scanner.nextLine();
            String a = scanner.nextLine().trim();
            if (a.equals("1")) {
                System.out.println("You would like to create a cat please choose a name for it");
                String name = scanner.nextLine();
                System.out.println("choose an age for your cat");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("choose it's mood");
                String mood = scanner.nextLine();
                Cat cat = new Cat(name, age, mood);
                System.out.println(cat);
                tamagochi = cat;
                System.out.println("／l、");
                System.out.println(" ﾟ､ ｡ ７");
                System.out.println("l  ~ヽ)");
                System.out.println("じしf_,)ノ");
                return tamagochi;

            } else if (a.equals("2")) {
                System.out.println("You would like to create a dog please choose a name for it");
                String name = scanner.nextLine();
                System.out.println("choose an age for your dog");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("choose it's mood");
                String mood = scanner.nextLine();
                Dog dog = new Dog(name, age, mood);
                System.out.println(dog);
                tamagochi = dog;
                return tamagochi;
            }      else {
                System.out.println("wrong input");
            }

        }
    }

    // method for play feed sleep

    public void activity(Tamagochi tamagochi){
        while (true) {
            System.out.println("What would you like to do?" +
                    "\n" + "1 - play" +
                    "\n" + "2 - feed" +
                    "\n" + "3 - sleep");

            // handling efter valg
            int sc = scanner.nextInt();
            scanner.nextLine();

            if (sc == 1) {
                if (tamagochi.getEnergy() < 50) {
                    System.out.println("Your tamagochi is low on energy");
                }
                tamagochi.play();
                return;
            }
            if (sc == 2) {
                tamagochi.feed();
                return;
            }
            if (sc == 3) {
                tamagochi.sleep();
                return;
            }

        }

    }
    // Game over metode som kan dræbe tamagochien og slutte spillet
     public boolean gameOver (Tamagochi tamagochi){
        if (tamagochi.getEnergy() <= 0 ){
            System.out.println("So sorry but " + tamagochi.getName() + " has died game over...");
            System.out.println("◕_◕");
            return false;
        }
        return true;
     }

        // Lave while loop på energy


    
}
