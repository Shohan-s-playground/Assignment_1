public class Demo4 {
    public static void main(String[] args) {

        final String COLOR="\033[";
        final String RESET="\033[0m";

        int date=28;
        int month=12;
        int year=2023;
        int hour=23;
        int minute=59;
        int seconds=59;
        System.out.printf("%7$s31m%s%8$s/%7$s32m%s%8$s/%7$s33m%s%8$s %7$s34m%s%8$s:%7$s35m%s%8$s:%7$s36m%s%8$s",month,date,year,hour,minute,seconds,COLOR,RESET);
    }
    
}
