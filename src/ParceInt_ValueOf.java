package src;

public class ParceInt_ValueOf {
    public static void main(String[] args) {
        String integer = "5";
        int convertInt = new Integer (integer);
        convertInt = convertInt + 3;
        System.out.println(convertInt);

        String number = "6.24";
        double d = Double.parseDouble(number);
         d = d * 2;
        System.out.println("String " + number + " is parse to double value : " + d);


        String str = "8.23";
        double value = Double.valueOf(str);
        System.out.println("String to double conversion " +
                "using valueOf : " + (value + value));


        String floating = "122.44";
        double converted = new Double(floating);
        converted = converted * 2;
        System.out.println("Double value " + converted + " " +
                "created from String " + floating );

        double pie = 3.14;
        String parsed = "" + pie;
        System.out.println("Double value : " + pie + " String value : " + parsed);

        double myValue = 88.22;
        String doubled = String.valueOf(myValue);
        System.out.println("Double value " + myValue + " converted " +
                "to String : " + doubled);

        Double code = new Double(5543.3);
        String decode = code.toString();
        System.out.println("double : " + code + " String : " + decode);




    }


}

