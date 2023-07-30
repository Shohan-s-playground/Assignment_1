public class Demo6Task_a{
    public static void main(String[] args) {

        int num1=5;
        String str1="0%";

        final String COLOUR1="\033[41m";
        final String COLOUR2="\033[42m";
        final String RESET="\033[0m";
    
        System.out.printf("%s[%10s%s%-10s]%s \n",COLOUR1,num1,COLOUR2,str1,RESET);
        
    }
    
}