public class Main {
    public static void main(String[] args) {
       Game game = new Game();

       Tamagochi tamagochi = game.chooseAnimal();

       boolean running = true;
       while(running) {
           game.activity(tamagochi);
           running = game.gameOver(tamagochi);
       }
    }
}


// mangler at lave tid som koncept i game, når en metode har kørt f.eks 3 gange play, så bliver den sulten
// 