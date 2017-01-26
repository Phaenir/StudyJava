/**
 * Created by RSadykov on 26.01.2017.
 */
public class Lion extends Animal{
    @Override
    public void MakeNoise() {
        System.out.printf("Lion made noise");
    }

    @Override
    public void Eat() {
        System.out.printf("Lion eats");
    }

    @Override
    public void Roam() {
        System.out.printf("Lions roams");
    }
}
