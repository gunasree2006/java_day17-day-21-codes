import java.util.Scanner;
public class match {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float X=sc.nextFloat();
        float Y=sc.nextFloat();
        float total_runrate=((X*10)+(Y*40))/50;
        System.out.printf("%.2f",total_runrate);
        sc.close();
    }
}
