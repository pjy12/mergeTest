public class Main1 {
    public static void main(String[] args) {
        System.out.println("this is project1");

        a(1, 4);

        System.out.println(b(1));
        System.out.println(b(4));

    }


    public static void a(int i, int j){
        System.out.println(i+j);
        System.out.println("====");
        return;
    }

    public static boolean b(int c){
        if(c == 1){
            return true;
        }else{
            return false;
        }
    }

    public static int c(int a, int b){
        return a*b;
    }

    public static int d(int a, int c){
        return a-c;
    }
}
