package classExercise;

public class ArrayTest {
    public static void main(String[] args) {
        //f();
        c();
    }

    static void f(){
        int [] f = {1,3,4,5,6,7,56,8};
        System.out.println(f[6]);
    }

    static void g(){
        int [] g = {1,1,1,1,1};
    }

    static  void c(){
        float total = 0;
        float [] c = new float[100];
        for (int i = 0; i < c.length ; i++) {
            total += i;

        }
        System.out.print(total);
    }
}
