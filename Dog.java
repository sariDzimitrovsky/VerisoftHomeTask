public class Dog  extends  Animal implements Land {

    private int numberOfLegs;

    Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public  void sayHellow(int mood){
        if(mood == this.MOOD_HAPPY){
            System.out.println("Dog barking loudly.");
        }
        if(mood == this.MOOD_SCARE){
            System.out.println("Dog making a whooping sound.");
        }
    }

    public  void sayHellow(){
        System.out.println("Dog wagging their tails.");
    }
}
