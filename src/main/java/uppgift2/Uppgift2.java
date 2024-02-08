package uppgift2;public class Uppgift2 {

    public int add(String number){
        if(number.isEmpty())
            return 0;
        String[] splitNumber = number.split(",");
        if(splitNumber.length == 1)
            return Integer.parseInt(splitNumber[0]);
        return Integer.parseInt(splitNumber[0]) + Integer.parseInt(splitNumber[1]);
    }
}

