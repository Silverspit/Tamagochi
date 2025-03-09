public class Tamagochi {
    private String name;
    private int age;
    private String mood;
    private double energy;

    // laver konstruktør for klassen
    public Tamagochi(String name, int age, String mood){
        this.name = name;
        this.age = age;
        this.mood = mood;
        energy = 100;
    }
    public Tamagochi (){

    }


    // lave setter og getter

    public String getName(){
     return name;
    }

    public int getAge(){
        return age;
    }

    public String getMood(String mood){
        return mood;
    }

    public double getEnergy(){
        return energy;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMood(String mood){
        this.mood = mood;
    }

    public void setEnergy(double energy){
        this.energy = energy;
    }

    //  kav general metoder til cat and dog, som de selv skal override

        public void play(){
            System.out.println("is playing");
        }

        public void feed(){
            System.out.println("is eating the food you gave");
        }

        public void sleep(){
            System.out.println(getName()+"is now sleeping");
        }

    // to String metode, så jeg kan få noget læseligt ud.

    public String toString(){
        return "your Tamagochis name is " + name
                +"\n"+ " it's age is " + age
                +"\n" + " right now it's mood is " + mood
                +"\n" +" and it's energy is on " + energy + " procent";
    }
}
