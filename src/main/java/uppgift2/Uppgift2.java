package uppgift2;

import java.util.Arrays;
import java.util.List;

public class Uppgift2 {

    public int add(String number) {
        int sum = 0;
        boolean confirmNegative = false;
        if (number.isEmpty())
            return 0;
        String[] splitStringNumber = number.split(",|\n|;|//");
        int[] actualNumber = new int[splitStringNumber.length];

            for (int i = 0; i < actualNumber.length; i++) {
                if (splitStringNumber[i].isEmpty()) // For some reason I need to do this.
                    continue;
                actualNumber[i] = Integer.parseInt(splitStringNumber[i]);
                if (actualNumber[i] < 0) {
                    confirmNegative = true;
                }

                sum += actualNumber[i];

            }
            if(confirmNegative) {
                int[] forNegative = Arrays.stream(actualNumber).filter(i -> i < 0).toArray();
                throw new IllegalArgumentException("Negatives not allowed" + Arrays.toString(forNegative));
            }
        return sum;
    }
}



