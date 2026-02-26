import java.util.*;
public class salaryofcricketers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
int seniour=6;
int salary_x=sc.nextInt();
double donates_of_seniour=(seniour*(salary_x*0.50));
int juniour=5;
int salary_y=sc.nextInt();
double donates_of_juniour=(juniour*(salary_y*0.40));
double total=donates_of_seniour+donates_of_juniour;
System.out.printf("%.2f",total);
    }
}
