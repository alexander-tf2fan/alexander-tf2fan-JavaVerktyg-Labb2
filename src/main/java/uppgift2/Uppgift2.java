package uppgift2;public class Uppgift2 {

    public int add(String number){
        String[] splitNumber = number.split(",");
        return Integer.parseInt(splitNumber[0]) + Integer.parseInt(splitNumber[1]);
    }
}

