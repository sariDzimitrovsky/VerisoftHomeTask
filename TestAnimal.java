public class TestAnimal {
    public static void main(String[] args) {

        Animal dog = new Dog(true,true,0);
        dog.MOOD_HAPPY = 0;
        dog.MOOD_SCARE = 1;
        dog.sayHellow();

        dog.sayHellow(1);
        dog.sayHellow(0);

    }

}
