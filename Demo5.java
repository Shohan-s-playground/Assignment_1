public class Demo5 {
    public static void main(String[] args) {

        final String COLOR="\033[";
        final String RESET="\033[0m";

        int numSet1=978;
        int numSet2=3;
        int numSet3=16;
        int numSet4=1484100;

        System.out.printf("%5$s33m%s%6$s-%5$s34m%s%6$s-%5$s35m%s%6$s-%5$s31m%s%6$s \n",numSet1,numSet2,numSet3,numSet4,COLOR,RESET);
    }
    
}
