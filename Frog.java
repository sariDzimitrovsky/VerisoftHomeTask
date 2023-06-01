public class Frog extends  Animal implements Land , Water{

    private int numberOfLegs;
    private boolean gills;
    private boolean laysEgg;

    Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }


    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    @Override
    public boolean hasGills(){
        return  this.gills;
    }
    @Override
    public boolean hasLaysEggs(){
        return  this.laysEgg;
    }

    public  void sayHellow(int mood){
        if(mood == this.MOOD_SCARE){
            System.out.println("Frog plopping into the water.");
        }
    }

    public  void sayHellow(){
        System.out.println("Frog singing quack quack quack on the shore.");
    }
}
