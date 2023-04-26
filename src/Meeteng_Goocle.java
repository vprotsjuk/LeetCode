package src;

public class Meeteng_Goocle {
    public static void main(String[] args) {
        String[][] calender1 = new String[][]{{"9:30", "10:30"}, {"12:00", "13:00"}, {"16:00", "18:00"}};
        double[][] doubleCalender1 = new double[calender1.length][calender1[0].length];
        String[][] calender2 = new String[][]{{"10:00", "11:30"}, {"12:30", "14:30"},
                {"14:30", "15:00"}, {"16:00", "17:00"}};
        double[][] doubleCalender2 = new double[calender2.length][calender2[0].length];

        String[] time1 = new String[]{"9:00", "20:00"};
        double[] doubleTime1 = new double[time1.length];
        String[] time2 = new String[]{"10:00", "18:30"};
        double[] doubleTime2 = new double[time2.length];
        convertCalenderToDouble(calender1, doubleCalender1);
//        System.out.println();
        convertCalenderToDouble(calender2, doubleCalender2);
//        System.out.println();
        convertTimeToDouble(time1, doubleTime1);
//        System.out.println();
        convertTimeToDouble(time2, doubleTime2);
        double startpoint = Math.max(doubleTime1[0], doubleTime2[0]);
        System.out.println(startpoint);
        if(doubleCalender1[0][0] <= startpoint && doubleCalender1[0][1] > startpoint){
            startpoint = doubleCalender1[0][1];
            System.out.println(startpoint);

        }


    }


    public static double[][] convertCalenderToDouble(String[][] calender, double[][] doubleCalender) {
        for (int i = 0; i < calender.length; i++) {
            for (int j = 0; j < calender[0].length; j++) {
                String s = calender[i][j].replace(':', '.');
                s = s.replace(".3", ".5");
                doubleCalender[i][j] = Double.parseDouble(s);
            }
        }
        for (int i = 0; i < calender.length; i++) {
//            System.out.print(" ");
            for (int j = 0; j < calender[0].length; j++) {
//                System.out.print(doubleCalender[i][j] + " ");

            }
        }
        return doubleCalender;
    }
    public static double[] convertTimeToDouble(String[] time, double[] doubleTime) {
        for (int i = 0; i < time.length; i++) {
                String s = time[i].replace(':', '.');
                s = s.replace('3', '5');
                doubleTime[i] = Double.parseDouble(s);
        }
        for (int i = 0; i < time.length; i++) {
//            System.out.print(doubleTime[i] + " ");
        }
        return doubleTime;
    }
}


