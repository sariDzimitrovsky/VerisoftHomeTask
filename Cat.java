
public class Cat extends  Animal implements Land{

    private int numberOfLegs;

    Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public  void sayHellow(int mood){
        if(mood == this.MOOD_HAPPY){
            System.out.println("Cat purring.");
        }
        if(mood == this.MOOD_SCARE){
            System.out.println("Cat hissing.");
        }
    }

    public  void sayHellow(){
        System.out.println("Cat making a meow~ sound.");
    }
}
