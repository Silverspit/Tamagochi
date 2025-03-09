public class Cat extends Tamagochi {

    //  Lav konstruktør
    public Cat (String name, int age, String mood){
        super(name, age, mood);
    }

 //  override a method

   public void play(){
        if (getEnergy() <= 0){
            System.out.println("your Tamagochi died, so sorry :( ");
        }
        double lostEnergy =  ((int)(Math.random()*49+1));
        setEnergy(getEnergy() - lostEnergy);
        System.out.println("is running up the wall your energy is now " + getEnergy() + " you lost " + lostEnergy + " energy points" );
    }

    public void feed(){
        double total =  getEnergy() + (int)(Math.random()*4+1);
        if (total <= 100 ){
            setEnergy(total);

        }else {
            setEnergy(100);
        }
        System.out.println("It ate and is not hungry anymore " + getMood("happy") + getEnergy());
    }

    public void sleep(){
        double total =  getEnergy() + (int)(Math.random()*4 +1);
        if (total <= 100 ){
            setEnergy(total);

        }else {
            setEnergy(100);
        }
        System.out.println(getName()+ "dosen't want to sleep, because it'a a cat..." + getEnergy());
    }

}
