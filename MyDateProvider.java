package milosz.pakiet;

import java.util.Random;
public class MyDateProvider implements DataProvider{
    @Override
    public String getDate() {
        Random r = new Random();
        return "losowo  " + String.valueOf(r.nextGaussian()) + " " + " 234234";


    }
}
