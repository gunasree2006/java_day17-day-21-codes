import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binarytodecimal {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder binary=new StringBuilder();
        if(n==0){
            binary.append("0");
        }
        while(n>0){
            int rem=n%2;
            binary.append(rem);
            n=n/2;
        }
        binary.reverse();
        System.out.println(binary.toString());
        for(int i=0;i<binary.length();i++){
            char bit=binary.charAt(i);
            if(bit=='1'){
                binary.setCharAt(i, '0');
            }
            else if(bit=='0'){
                binary.setCharAt(i,'1');
            }
        }
        System.out.println(binary.toString());
        int decimal=0;
        int power=0;
        for(int i=binary.length()-1;i>=0;i--){
            char bit=binary.charAt(i);
            if(bit=='1'){
            decimal+=Math.pow(2,power);
        }
    power++;
        }
        System.out.print(decimal);
    }
}
