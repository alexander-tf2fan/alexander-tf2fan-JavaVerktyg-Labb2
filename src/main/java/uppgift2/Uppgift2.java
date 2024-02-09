package uppgift2;public class Uppgift2 {

    public int add(String number) {
        int sum = 0;
        if (number.isEmpty())
            return 0;
        String[] splitStringNumber = number.split(",|\n|;|//");
        int[] actualNumber = new int[splitStringNumber.length];
        for (int i = 0; i < actualNumber.length; i++) {
            if(splitStringNumber[i].isEmpty()) // For some reason I need to do this.
                continue;
            actualNumber[i] = Integer.parseInt(splitStringNumber[i]);
            sum += actualNumber[i];
        }
        return sum;
    }
}

