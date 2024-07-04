package IntroTopics;

public class FunctionOverloading {
    public static void main(String[] args) {
        float a = fun((float)2.1, (float) 3.1);
        System.out.println(a);
    }

    public static int fun(int a, int b) {
        return a+b;
    }

    public static float fun(float a, int b) {
        return a+b;
    }

    public static float fun(float a, float b){
        return a+b;
    }
}
