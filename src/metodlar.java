package src;

public class metodlar {
    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    public static void main(String[] args){
        int result = sum(4,3) + sum(6,4);
        System.out.println(result);
    }
    //----------------------------------
    /*static void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public static void main(String[] args){
        sum(5,2);
    } */
    //--------------------------------------
    /*static int power(int base, int exp) {
        int result = 1;
        for(int i =1; i<=exp; i++){
            result*=base;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(power(2,3));
        System.out.println(power(4,2));
        System.out.println(power(10,9));
    } */
}


