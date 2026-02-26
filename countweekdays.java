import java.util.*;
public class countweekdays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String day=sc.next().toLowerCase();
        int n=sc.nextInt();
        Map <String,Integer> dayMap=new HashMap<>();
       dayMap.put("sun",0);
        dayMap.put("mon",1);
        dayMap.put("tues",2);
        dayMap.put("wed",3);
        dayMap.put("thu",4);
        dayMap.put("fri",5);
        dayMap.put("sat",6);
        if(!dayMap.containsKey(day)||n<0){
            System.out.println("invalid input");
            return;
        }
        int start=dayMap.get(day);
        int count=0;
        for(int i=0;i<n-1;i++){
           if((start+i)%7==0){
            count=count+1;
           }
        }
        System.out.println(count);
    }
}
