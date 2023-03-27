package src;

public class metodlar2 {
    static void print(){
        System.out.println("Parametresiz Metot");
    }
    static void print(int a){
        System.out.println("Parametre: " + a);
    }
    static int print(int a, int b){
        int result = a + b;
        return result;
    }
    public static void main(String[] args){
        print();
        print(12);
        System.out.println(print(8,6));
    }
}
