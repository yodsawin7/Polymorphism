public class Duck extends Animal implements Flyable{

 @Override

 void turn(){
    System.out.println("owl turn");
}

void sound () {
    System.out.println("Quack Quack!" );
}

public void fly(){
    System.out.println("duck fly");
}

public void glide(){
    System.out.println("duck gilde");
}



public void clean (Animal prey) {
    System.out.println(prey + " is being cleaned.");
}

}