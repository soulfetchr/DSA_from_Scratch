public class N_numbers {
    public static void main(String[] args) {
        int n =25;
        print(1,n);
    }
    static void print(int i, int n){
        if(i>n) {
            return;
        }
        System.out.println(i);
        print(i+1,n);

    }
}
