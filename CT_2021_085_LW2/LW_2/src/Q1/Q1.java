package Q1;

public class Q1 {
    public static void main(String[] args) {

        //part a
        int A=12;
        int B=8;
        int C=20;

        double result1=Math.sqrt(Math.pow(B,2)+4*A*C);
        //double result1=Math.sqrt(B*B+4*A*C);
        System.out.println(result1);

        //part b
        int X=15;
        int Y=18;

        double result2=Math.sqrt(X+4*Math.pow(Y,3));
        //double result2=Math.sqrt(X+4*Y*Y*Y);
        System.out.println(result2);

        //part c
        double result3=Math.cbrt(X*Y);
        System.out.println(result3);

        //part d
        float r=21;
        double area=Math.PI*Math.pow(r,2);
        System.out.println(area);

    }
}
