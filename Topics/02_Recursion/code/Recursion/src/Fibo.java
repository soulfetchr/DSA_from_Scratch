public class Fibo {
    public static void main(String[] args) {
        int n =6;
        System.out.println(printfibo(n));
    }

    static int printfibo(int n){
        if(n<2) {
             return n;
        }

       return printfibo(n-1) + printfibo(n-2);
        }

}
