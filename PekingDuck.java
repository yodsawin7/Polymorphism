public class PekingDuck extends Duck {

    @Override
    public void sound() { 
       System.out.println("Grob grob!");
    }
    public void clean(Animal animal) { // overriding
       System.out.println("I cannot clean. I died already.");
    }
  }
  