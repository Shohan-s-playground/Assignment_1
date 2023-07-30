public class Demo6Task_c {
    public static void main(String[] args) {
        String city1="Los Angeles";
        String state1="California";
        double population1=3966936;

        String line1="\033[32mNew \033[0mYork";
        double population2=8336817;

        final String COLOUR2="\033[33m";
        final String COLOUR3="\033[35m";
        final String RESET="\033[0m";
        final String bold="\033[1m";

        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(17),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(13),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(12),COLOUR2);
        System.out.printf("%s+ \n",COLOUR2);
        System.out.printf("|%5$s%4$s%-17s%5$s%6$s|%5$s%4$s%-13s%5$s%6$s|%5$s%4$s%12s%5$s%6$s|%5$s \n"," CITY"," STATE","POPULATION ",bold,RESET,COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(17),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(13),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(12),COLOUR2);
        System.out.printf("%s+ \n",COLOUR2);
        System.out.printf("| %4$s%-16s%5$s| %4$s%-12s%5$s|%4$s%6$s%,11.0f%4$s%5$s | \n",city1,state1,population1,RESET,COLOUR2,COLOUR3);
        System.out.printf("%s| %s%-25s%1$s| %2$s%3$-21s%1$s|%2$s%4$s%5$,11.0f%2$s%1$s |%2$s \n",COLOUR2,RESET,line1,COLOUR3,population2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(17),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(13),COLOUR2);
        System.out.printf("%s+",COLOUR2);
        System.out.printf("\033[33m-".repeat(12),COLOUR2);
        System.out.printf("%s+ \n",COLOUR2);

        
    }
    
}
