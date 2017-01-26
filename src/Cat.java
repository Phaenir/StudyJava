/**
 * Created by RSadykov on 26.01.2017.
 */
public class Cat extends Feline {
    @Override
    public void MakeNoise() {
        System.out.printf("Cat made noise");
    }

    @Override
    public void Eat() {
        System.out.printf("Cat eats");
    }
}
