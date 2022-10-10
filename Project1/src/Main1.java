public class Main1 {
    public static void main(String[] args) {
        System.out.println("this is project1");

        a(1, 4, 5);

        System.out.println(e(1));
        System.out.println(e(4));

        Car car = new Car(4, 2001);
        System.out.println(car.toString());
        System.out.println(c(1, 3));
        System.out.println(d(1, 6));
        System.out.println(f(3, 10));

        tmp();

        Man man = new Man("bob", 20, "Student");
        System.out.println(man.toString());

        tmp3();

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
    public static int c(int a, int b){
        return a*b;
    }

    public static int d(int a, int c){
        return a-c;
    }

    public static double f(int k, int m){
        return k/m;
    }

    public static void tmp3(){
        System.out.println("this is tmp3");
    }
}
