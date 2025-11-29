public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;
    public Duck(){

    }
    public abstract void display();
    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All of them swim");
    }
}
