public class Demo6Task_b {
    public static void main(String[] args) {

        String name1="Alice";
        int marks1=24;

        String name2="Bob";
        int marks2=30;

        final String COLOUR1="\033[34;1m";
        final String COLOUR2="\033[33m";
        final String COLOUR3="\033[35m";
        final String RESET="\033[0m";

        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(17),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(5),COLOUR2);
        System.out.printf("%s+ \n",COLOUR2);
        System.out.printf("|%4$s%3$s%-17s%4$s%5$s|%4$s%3$s%5s%4$s%5$s|%4$s \n"," NAME","AGE ",COLOUR1,RESET,COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(17),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(5),COLOUR2);
        System.out.printf("%s+ \n",COLOUR2);
        System.out.printf("%4$s| %3$s%-16s%4$s|%3$s%5$s%4s%3$s%4$s |%3$s \n",name1,marks1,RESET,COLOUR2,COLOUR3);
        System.out.printf("%4$s| %3$s%-16s%4$s|%3$s%5$s%4s%3$s%4$s |%3$s \n",name2,marks2,RESET,COLOUR2,COLOUR3);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(17),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(5),COLOUR2);
        System.out.printf("%s+ \n",COLOUR2);
    }
    
}
