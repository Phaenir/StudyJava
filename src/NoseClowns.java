/**
 * Created by RSadykov on 27.01.2017.
 */

interface Nose{
    int iMethod();
}

abstract class Picasso implements Nose{
    @Override
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso{}

class Acts implements Nose{

    @Override
    public int iMethod() {
        return 5;
    }
}

public class NoseClowns extends Clowns{
    public static void main(String[] args){
        Nose[]i=new Nose[3];
        i[0]=new Acts();
        i[1]=new Clowns();
        i[2]=new NoseClowns();
        for (int j = 0; j < 3; j++) {
            System.out.println(i[j].iMethod()+" "+i[j].getClass());
        }
    }
}
