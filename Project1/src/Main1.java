public class Main1 {
    public static void main(String[] args) {
        System.out.println("this is project1");

        a(1, 4, 5);

        System.out.println(e(1));
        System.out.println(e(4));

    }


    public static void a(int i, int j, int k){
        System.out.println(i+j);
        System.out.println("====");
        System.out.println(i+k);
        return;
    }

    public static boolean e(int c){
        if(c == 1){
            return true;
        }else{
            return false;
        }
    }

    public static double f(int k, int m){
        return k/m;
    }
}
