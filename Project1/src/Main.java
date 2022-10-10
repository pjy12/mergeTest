public class Main {
    public static void main(String[] args) {
        System.out.println("this is project1");

        a(1, 4, 5);

        System.out.println(b(1));
        System.out.println(b(4));

        Cars cars = new Cars(4, 2001);
        System.out.println(cars.toString());
        System.out.println(cars.speed);
        System.out.println(cars.year);

        System.out.println(c(1, 3));
        System.out.println(d(1, 6));
        System.out.println(k(3, 10));


        Mans mans = new Mans("bob", 20, "Student");
        mans = new Mans("kill", 34, "Teacher");
        System.out.println(mans.toString());

        temp();
        temp2();
        temp3();

    }


    public static void a(int i, int j, int k){
        System.out.println(i+j);
        System.out.println("====");
        System.out.println(i+k);
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

    public static double k(int k, int m){
        return k/m;
    }

    public static void temp3(){
        System.out.println("this is tmp3");
    }

    public static void temp(){
        System.out.println("aaaaa");
        System.out.println("bbbbb");
        System.out.println("ccccc");
    }


    public static void temp2(){
        System.out.println("ddddd");
        System.out.println("eeeee");
        System.out.println("fffff");
    }
}
