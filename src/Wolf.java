/**
 * Created by RSadykov on 26.01.2017.
 */
public class Wolf extends Animal {
    @Override
    public void MakeNoise() {
        System.out.printf("Wolf made noise");
    }

    @Override
    public void Eat() {
        System.out.printf("Wolf eats");
    }

    @Override
    public void Roam() {
        System.out.printf("Wolf roams");
    }
}
