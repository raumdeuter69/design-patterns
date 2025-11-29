public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Ducckk");
    }
    @Override
    public void performFly() {
        FlyWithWings flyWithWings = new FlyWithWings();
        flyWithWings.fly();
    }
    @Override
    public void performQuack() {
        Squeak sq = new Squeak();
        sq.quack();
    }
    
}
