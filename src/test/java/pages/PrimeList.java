package pages;

import java.util.ArrayList;
import java.util.List;

public class PrimeList implements PrimeNumberInterface{

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        int min ,max ;


        if(startingValue<endingValue){
            min=startingValue;
            max=endingValue;
        }else {
            min=endingValue;
            max=startingValue;
        }

        List<Integer> list = new ArrayList<>();


        for (int i = min; i <= max; i++){


            if (isPrime(i)){
                list.add(i);
            }
        }


        return list;
    }


    @Override
    public boolean isPrime(int value) {


        if (value == 1) {
            return false;
        }


        else if (value <= 3) {
            return true;
        }


        else if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }

        else {


            for (int i = 5; i * i <= value; i = i + 6) {
                if (value % i == 0 || value % (i + 2) == 0) {
                    return false;
                }
            }
        }

        return true;
    }

}
