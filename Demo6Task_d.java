public class Demo6Task_d {
    public static void main(String[] args) {
        String item1="Apples";
        int q1=5;
        String price1="0.99";

        String item2="Oranges";
        int q2=10;
        String price2="1.49";

        final String COLOURG="\033[32m";
        final String COLOURY="\033[33m";
        final String COLOURM="\033[35m";
        final String COLOURB="\033[34m";
        final String RESET="\033[0m";
        final String bold="\033[1m";

        System.out.printf("%s+",COLOURY);
        System.out.printf("\033[33m-".repeat(10),COLOURG);
        System.out.printf("%s+",COLOURY);
        System.out.printf("\033[33m-".repeat(10),COLOURG);
        System.out.printf("%s+",COLOURY);
        System.out.printf("\033[33m-".repeat(7),COLOURG);
        System.out.printf("%s+ \n",COLOURY);
        System.out.printf("|%5$s%4$s%-10s%5$s%6$s|%5$s%4$s%-10s%5$s%6$s|%5$s%4$s%7s%5$s%6$s|%5$s \n"," ITEM"," QANTITY","PRICE ",bold,RESET,COLOURY);
        System.out.printf("%s+",COLOURY);
        System.out.printf("\033[32m-".repeat(10));
        System.out.printf("%s+",COLOURY);
        System.out.print("\033[33m-".repeat(10));
        System.out.printf("%s+",COLOURY);
        System.out.printf("\033[32m-".repeat(7));
        System.out.printf("%s+ \n",COLOURY);
        System.out.printf("| %4$s%-9s%5$s|%4$s%7$s%9s%4$s%5$s | %4$s%6$s$%4$s%8$s%4s%4$s%5$s | \n",item1,q1,price1,RESET,COLOURY,COLOURG,COLOURB,COLOURM);
        System.out.printf("| %4$s%-9s%5$s|%4$s%7$s%9s%4$s%5$s | %4$s%6$s$%4$s%8$s%4s%4$s%5$s | \n",item2,q2,price2,RESET,COLOURY,COLOURG,COLOURB,COLOURM);
        System.out.printf("%s+",COLOURY);
        System.out.printf("\033[32m-".repeat(10));
        System.out.printf("%s+",COLOURY);
        System.out.print("\033[33m-".repeat(10));
        System.out.printf("%s+",COLOURY);
        System.out.printf("\033[32m-".repeat(7));
        System.out.printf("%s+ \n",COLOURY);
}
}