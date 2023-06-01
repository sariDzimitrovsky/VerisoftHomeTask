public abstract class Animal {

    protected  boolean mammals;
    protected  boolean carnivorous;
    protected  int mood;

    Animal(boolean mammals , boolean carnivorous , int mood){
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }

    public int  MOOD_HAPPY = 0;
    public  int MOOD_SCARE = 1;

    public abstract void sayHellow();
    public abstract void sayHellow(int  mood);

    public void setMammals(boolean mammals){
        this.mammals = mammals;
    }
    public void setCarnivorous(boolean carnivorous){
        this.carnivorous = carnivorous;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public boolean isMammals() {
        return mammals;
    }
}
