import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Greetings!");
        System.out.println("Please, enter values of a, b, c (in this order)");
        System.out.println("*Note that it will be used in more than 1 formula");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(linearFormula(a,b,c));
        System.out.println(degreeFormula(a,b,c));
    }

    public static double linearFormula(double a, double b, double c){
        return ((a-3)*b/2)+c;
    }

    public static double degreeFormula(double a, double b, double c){
        double square = b*b + 4*a*c;
        double res;

        if(square >= 0 && a!=0){
            res = (b+square)/2*a - Math.pow(a,3)*c+Math.pow(b,-2);
        }else{
            System.out.println("Impossible to count!");
            res = -1;
        }

        return res;
    }


}
